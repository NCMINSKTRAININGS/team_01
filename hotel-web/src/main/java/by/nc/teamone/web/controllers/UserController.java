package by.nc.teamone.web.controllers;

import by.nc.teamone.entities.User;
import by.nc.teamone.services.IFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
        return new ModelAndView("definition-login");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView afterLogin(){
        ModelAndView view = new ModelAndView();
        view.setViewName("main-user");
        return view;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView afterLoginWithError(@RequestParam(value = "error", required = false) String error){
        ModelAndView view = new ModelAndView();
        if (error == null) {
            view.setViewName("definition-login");
        } else
        view.setViewName("definition-login");
        return view;
    }


    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView goToLogOut(){
        ModelAndView view = new ModelAndView();
        view.setViewName("definition-login");
        return view;
    }

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView goToMain(){
        ModelAndView view = new ModelAndView();
        view.setViewName("main-user");
        return view;
    }

    
}
