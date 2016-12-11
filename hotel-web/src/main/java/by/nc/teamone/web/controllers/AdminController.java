package by.nc.teamone.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import by.nc.teamone.services.IFacade;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
	
	@Autowired
    private IFacade facade;
	
}
