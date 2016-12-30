package by.nc.teamone.web.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        view.addObject("user", facade.getUserByName(name));
        view.setViewName("definition-addclaim");
        return view;
    }

    @RequestMapping(value="/addClaim", method = RequestMethod.POST)
    public ModelAndView addClaim(@ModelAttribute("userClaimModel") UserClaimModel userClaimModel){
        ModelAndView view = new ModelAndView();
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        userClaimModel.userId = (facade.getUserByName(name).getId());
        view.addObject("user", facade.getUserByName(name));
        int result = facade.addClaim(userClaimModel);
        if(result == -2){
        	view.addObject("message", "No money");
        }else if(result == -1){
        	view.addObject("message", "No seats");
        }else if(result == 0){
        	view.addObject("message", "BD error"); // Нужно допилить после написания кастомных Exception p.s. Лера это не тебе
        }else view.addObject("message", "Success");
        view.addObject("roomList", facade.getRoomList());
        view.setViewName("definition-user");
        return view;
    }
}
