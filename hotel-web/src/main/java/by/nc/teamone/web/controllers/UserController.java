package by.nc.teamone.web.controllers;

import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.services.IFacade;
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


    @RequestMapping(value = "/main/{command}/{id}", method = RequestMethod.GET)
    public ModelAndView goToUserPage(@PathVariable("command") String command,
                                     @PathVariable("id") Long id) {
        System.out.println("UserController goToUserPage GET");

        ModelAndView modelAndView = new ModelAndView("definition-user");

        modelAndView.addObject("user", facade.getUserById(id));
        modelAndView.addObject("command", command);
        if (command.equals("addClaim")) {
            modelAndView.addObject("type", facade.getAllType());
        }
        else if (command.equals("findAll")){
            modelAndView.addObject("claim", facade.getClaimByIdUser(id));
        }
        return modelAndView;
    }


}
