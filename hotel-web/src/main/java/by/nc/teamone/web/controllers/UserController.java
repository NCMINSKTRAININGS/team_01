package by.nc.teamone.web.controllers;

import by.nc.teamone.entities.User;
import by.nc.teamone.services.IFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private IFacade facade;

    @ModelAttribute("user")
    public User construct(){
        return new User();
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView goToRegistration(){
        ModelAndView view = new ModelAndView();
        view.setViewName("definition-registration");
        return view;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView addUser(@ModelAttribute("user") User user){
        facade.addUser(user);
        return new ModelAndView("definition-registration");
    }
}
