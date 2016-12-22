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
        ModelAndView view = new ModelAndView();
        view.setViewName("definition-admin");
        view.addObject("command", command);
        if (command.equals("showClaims")) {
            view.addObject("claims", facade.getAllClaim());
        }
        return view;
    }

    @RequestMapping(value = "/main", method = RequestMethod.POST)
    public void addRoom(@RequestBody RoomModel roomModel) {
        facade.addRoom(roomModel);
        System.out.println("AdminController addRoom POST");
    }
}
