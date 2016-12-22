package by.nc.teamone.web.controllers;

import by.nc.teamone.constants.EntityConstants;
import by.nc.teamone.entities.models.UserModel;
import by.nc.teamone.services.IFacade;
import by.nc.teamone.web.constants.WebConstants;
import by.nc.teamone.web.utils.CheckRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value="/")
public class GuestController {
	
	@Autowired
	private IFacade facade;
	
	@Autowired
	private CheckRoles checkRoles;

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView goToRegistration(){
        ModelAndView view = new ModelAndView();
        view.setViewName("definition-registration");
        return view;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView addUser(@RequestBody UserModel userModel){
        facade.addUser(userModel);
        return new ModelAndView(WebConstants.INDEX);
    }

    @RequestMapping(value = WebConstants.MAIN, method = RequestMethod.GET)
    public ModelAndView goToUserPage(Authentication authentication){

        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        List<String> roles = new ArrayList<String>();
        for (GrantedAuthority a : authorities)
            roles.add(a.getAuthority());

        if (checkRoles.isAdmin(roles)) {
            ModelAndView modelAndView = new ModelAndView("definition-admin");
            modelAndView.addObject(EntityConstants.TYPE, facade.getAllType());
        	return modelAndView;
        } else if (checkRoles.isUser(roles)) {
            ModelAndView modelAndView = new ModelAndView("definition-user");
            String name = SecurityContextHolder.getContext().getAuthentication().getName();
            modelAndView.addObject(EntityConstants.USER, facade.getUserByName(name));
        	return modelAndView;
        } else return new ModelAndView(WebConstants.INDEX);
    }
}
