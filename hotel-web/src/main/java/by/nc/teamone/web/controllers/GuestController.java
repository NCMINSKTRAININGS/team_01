package by.nc.teamone.web.controllers;

import by.nc.teamone.entities.models.UserModel;
import by.nc.teamone.services.IFacade;
import by.nc.teamone.web.utils.CheckRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
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
        System.out.println("GuestController goToRegistration GET");
        ModelAndView view = new ModelAndView();
        view.setViewName("definition-registration");
        return view;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView addUser(@RequestBody UserModel userModel){
        System.out.println("GuestController addUser POST");
        facade.addUser(userModel);
        return new ModelAndView("/index.jsp");
    }

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView goToUserPage(Authentication authentication){

        System.out.println("GuestController goToUserPage GET");
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        List<String> roles = new ArrayList<String>();
        for (GrantedAuthority a : authorities)
            roles.add(a.getAuthority());

        if (checkRoles.isAdmin(roles)) {
            ModelAndView modelAndView = new ModelAndView("definition-admin");
            modelAndView.addObject("type", facade.getAllType());
        	return modelAndView;
        } else if (checkRoles.isUser(roles)) {
            ModelAndView modelAndView = new ModelAndView("definition-user");
            modelAndView.addObject("type", facade.getAllType());
            modelAndView.addObject("name", 200500); // temp
        	return modelAndView;
        } else return new ModelAndView("/index.jsp");
    }
}
