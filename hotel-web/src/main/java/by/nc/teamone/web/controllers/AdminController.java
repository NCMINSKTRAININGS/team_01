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
    public ModelAndView goToAdminPage(@PathVariable("command") String command) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("definition-admin");
        modelAndView.addObject("command", command);
        if (command.equals("showUsers")) {
            modelAndView.addObject("users", facade.getAllUsers());
        }
        if (command.equals("addRoom")){
            modelAndView.addObject("users", facade.getAllUsers());
        }
        return modelAndView;
    }

    @RequestMapping(value = "/main/{command}/{id}", method = RequestMethod.GET)
    public ModelAndView goToAdminClaimPage(@PathVariable("command") String command,
                                           @PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("definition-admin");
        modelAndView.addObject("command", command);
        if (command.equals("showClaims")){
            modelAndView.addObject("claims", facade.getClaimByIdUser(id));
            modelAndView.addObject("user", facade.getUserById(id));
        }
        return modelAndView;
    }


        @RequestMapping(value = "/main", method = RequestMethod.POST)
    public void addRoom(@RequestBody RoomModel roomModel) {
        facade.addRoom(roomModel);
    }
}
