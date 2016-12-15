package by.nc.teamone.web.controllers;

import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.services.IFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IFacade facade;


    @RequestMapping(value = "/addRequest", method = RequestMethod.GET)
    public ModelAndView addRequestGet(){
        ModelAndView modelAndView = new ModelAndView("definition-user");
        modelAndView.addObject("type", facade.getAllType());
        modelAndView.addObject("userCommand", "newRequest");
        return modelAndView;
    }
    @RequestMapping(value = "/addRequest", method = RequestMethod.POST)
    public ModelAndView addRequestPost(@RequestBody ClaimModel claimModel){
        facade.addClaim(claimModel);
        ModelAndView modelAndView = new ModelAndView("definition-user");
        return modelAndView;
    }

}
