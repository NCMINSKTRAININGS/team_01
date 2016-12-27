package by.nc.teamone.web.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import by.nc.teamone.entities.models.UserModel;
import by.nc.teamone.services.IFacade;
import by.nc.teamone.web.utils.CheckRoles;
import by.nc.teamone.web.validators.UserValidator;

@Controller
@RequestMapping(value="/")
public class RegistrationController {
	
	@Autowired
	private IFacade facade;
	
	@Autowired
	private CheckRoles checkRoles;
	
	@Autowired
	private UserValidator userValidator;

	@ModelAttribute("userModel")
    public UserModel construct(){
    	return new UserModel();
    }
	
	@InitBinder("userModel")
	private void updateCompanyBinder(WebDataBinder binder) {
		binder.setValidator(userValidator);
	}
    
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView goToRegistration(){
		ModelAndView view = new ModelAndView();
		view.setViewName("definition-registration");
		return view;
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("userModel") UserModel userModel, BindingResult bindingResult){
		
		userValidator.validate(userModel, bindingResult);
		
		if(bindingResult.hasErrors()){
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("errors", userValidator.getMessages(bindingResult));
			return new ModelAndView("definition-registration");
		}
		else{
			facade.addUser(userModel);
			return new ModelAndView("definition-index");
		}
	}

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView goToUserPage(Authentication authentication){

        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        List<String> roles = new ArrayList<String>();
        for (GrantedAuthority a : authorities)
            roles.add(a.getAuthority());
        String name = SecurityContextHolder.getContext().getAuthentication().getName();

        if (checkRoles.isAdmin(roles)) {
            ModelAndView modelAndView = new ModelAndView("definition-admin");
            modelAndView.addObject("user", facade.getUserByName(name));
        	return modelAndView;
        } else if (checkRoles.isUser(roles)) {
            ModelAndView modelAndView = new ModelAndView("definition-user");
            modelAndView.addObject("user", facade.getUserByName(name));
            return modelAndView;
        } else if (checkRoles.isLandlord(roles)) {
        	ModelAndView modelAndView = new ModelAndView("definition-landlord");
	        modelAndView.addObject("user", facade.getUserByName(name));
	        return modelAndView;
        } else return new ModelAndView("definition-index");
    }
}
