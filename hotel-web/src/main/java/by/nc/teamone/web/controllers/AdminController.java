package by.nc.teamone.web.controllers;

import by.nc.teamone.entities.models.RoomModel;
import by.nc.teamone.services.IFacade;
import by.nc.teamone.web.constants.WebConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private IFacade facade;

    @RequestMapping(value = WebConstants.MAIN, method = RequestMethod.GET)
    public ModelAndView goToRegistrationRoom() {
        ModelAndView view = new ModelAndView();
        view.setViewName("definition-admin");
        return view;
    }

    @RequestMapping(value = WebConstants.MAIN, method = RequestMethod.POST)
    public void addRoom(@RequestBody RoomModel roomModel) {
        facade.addRoom(roomModel);
    }
}
