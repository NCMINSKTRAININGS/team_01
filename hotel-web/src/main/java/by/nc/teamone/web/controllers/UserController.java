package by.nc.teamone.web.controllers;

import by.nc.teamone.entities.Claim;
import by.nc.teamone.services.IFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IFacade facade;

    @ModelAttribute("claim")
    public Claim construct(){
        return new Claim();
    }

    @RequestMapping(value = "/addRequest", method = RequestMethod.GET)
    public ModelAndView addRequestGet(){
        ModelAndView modelAndView = new ModelAndView("definition-user");
        modelAndView.addObject("type", facade.getAllType());
        modelAndView.addObject("userCommand", "newRequest");
        return modelAndView;
    }
    @RequestMapping(value = "/addRequest", method = RequestMethod.POST)
    public ModelAndView addRequestPost(@ModelAttribute("claim") Claim claim){
        ModelAndView modelAndView = new ModelAndView("definition-user");
        facade.addClaim(claim);
        return modelAndView;
    }

}
