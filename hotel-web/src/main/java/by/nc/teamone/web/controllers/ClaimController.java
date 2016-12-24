package by.nc.teamone.web.controllers;


import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.services.IFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/claim")
public class ClaimController {

    @Autowired
    private IFacade facade;

    @ModelAttribute("claimModel")
    public ClaimModel construct(){
        return new ClaimModel();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView goToAddClaim(){
        ModelAndView view = new ModelAndView();
        view.addObject("typeList", facade.getAllType());
        view.addObject("addressList", facade.getAllAddress());
        view.setViewName("definition-addclaim");
        return view;
    }


    @RequestMapping(value="/addClaim", method = RequestMethod.POST)
    public ModelAndView addClaim(@ModelAttribute("addClaim") ClaimModel claimModel){
        ModelAndView view = new ModelAndView();
        claimModel.setId(facade.getUserByName(SecurityContextHolder.getContext().getAuthentication().getName()).getId());
        facade.addClaim(claimModel);
        view.setViewName("definition-user");
        return view;
    }
}
