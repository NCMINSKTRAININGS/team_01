package by.nc.teamone.web.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import by.nc.teamone.entities.models.UserClaimModel;
import by.nc.teamone.services.IFacade;

@Controller
@RequestMapping(value="/claim")
public class ClaimController {

    @Autowired
    private IFacade facade;

    @ModelAttribute("userClaimModel")
    public UserClaimModel construct(){
        return new UserClaimModel();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView goToAddClaim(@RequestParam("roomId") long roomId){
        ModelAndView view = new ModelAndView();
        view.addObject("roomId", roomId);
        view.setViewName("definition-addclaim");
        return view;
    }


    @RequestMapping(value="/addClaim", method = RequestMethod.POST)
    public ModelAndView addClaim(@ModelAttribute("userClaimModel") UserClaimModel userClaimModel){
        ModelAndView view = new ModelAndView();
        userClaimModel.userId = (facade.getUserByName(SecurityContextHolder.getContext().getAuthentication().getName()).getId());
        System.out.println(userClaimModel);
        facade.addClaim(userClaimModel);
        view.setViewName("definition-user");
        return view;
    }
}
