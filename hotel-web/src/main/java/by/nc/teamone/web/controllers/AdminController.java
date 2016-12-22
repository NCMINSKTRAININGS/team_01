package by.nc.teamone.web.controllers;

import by.nc.teamone.entities.models.RoomModel;
import by.nc.teamone.services.IFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private IFacade facade;

    @RequestMapping(value = "/main/{command}", method = RequestMethod.GET)
    public ModelAndView goToRegistrationRoom(@PathVariable("command") String command) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("definition-admin");
        modelAndView.addObject("command", command);
        if (command.equals("showClaims")) {
            modelAndView.addObject("claims", facade.getAllClaim());
        }
        if (command.equals("addRoom")){
            modelAndView.addObject("type", facade.getAllType());
        }
        return modelAndView;
    }

    @RequestMapping(value = "/main", method = RequestMethod.POST)
    public void addRoom(@RequestBody RoomModel roomModel) {
        facade.addRoom(roomModel);
    }
}
