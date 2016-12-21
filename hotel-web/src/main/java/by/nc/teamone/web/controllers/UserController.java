package by.nc.teamone.web.controllers;

import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.services.IFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
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

    @RequestMapping(value = "/main/{command}", method = RequestMethod.GET)
    public ModelAndView goToUserPage(@PathVariable("command") String command) {
        ModelAndView modelAndView = new ModelAndView("definition-user");
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        modelAndView.addObject("user", facade.getUserByName(name));
        modelAndView.addObject("command", command);
        if (command.equals("addClaim")) {
            modelAndView.addObject("type", facade.getAllType());
        }
        else if (command.equals("findAll")){
            modelAndView.addObject("claim", facade.getAllClaim());
        }
        return modelAndView;
    }


}
