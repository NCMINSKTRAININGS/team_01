package by.nc.teamone.web.controllers;

import by.nc.teamone.constants.EntityConstants;
import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.services.IFacade;
import by.nc.teamone.web.constants.WebConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IFacade facade;


    @RequestMapping(value = "/addRequest", method = RequestMethod.POST)
    public void addRequestPost(@RequestBody ClaimModel claimModel) {
        facade.addClaim(claimModel);
    }


    @RequestMapping(value = WebConstants.MAIN+"/{"+WebConstants.COMMAND+"}/{id}", method = RequestMethod.GET)
    public ModelAndView goToUserPage(@PathVariable(WebConstants.COMMAND) String command,
                                     @PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("definition-user");

        modelAndView.addObject(EntityConstants.USER, facade.getUserById(id));
        modelAndView.addObject(WebConstants.COMMAND, command);
        if (command.equals("addClaim")) {
            modelAndView.addObject(EntityConstants.TYPE, facade.getAllType());
        }
        else if (command.equals("findAll")){
            modelAndView.addObject(EntityConstants.CLAIM, facade.getClaimByIdUser(id));
        }
        return modelAndView;
    }


}
