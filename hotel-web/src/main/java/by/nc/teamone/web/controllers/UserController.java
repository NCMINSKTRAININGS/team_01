package by.nc.teamone.web.controllers;

import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.entities.models.CommandModel;
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


   @RequestMapping(value = "/getCommand", method = RequestMethod.GET)
    public ModelAndView getCommandPost(@RequestBody CommandModel commandModel){
       ModelAndView modelAndView = new ModelAndView("definition-user");
       modelAndView.addObject("command",commandModel.command);
       modelAndView.addObject("type", facade.getAllType());
       return modelAndView;
   }

    @RequestMapping(value = "/addRequest", method = RequestMethod.POST)
    public  void addRequestPost(@RequestBody ClaimModel claimModel){
        facade.addClaim(claimModel);
    }

}
