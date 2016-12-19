package by.nc.teamone.web.controllers;

import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.services.IFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IFacade facade;


    @RequestMapping(value = "/addRequest2", method = RequestMethod.POST)
    public  @ResponseBody Map<String, Object> addRequestGet(){
        Map<String, Object> answer = new HashMap<String, Object>();
        answer.put("command","newRequest");
        answer.put("types", facade.getAllType());
        return answer;
    }

    @RequestMapping(value = "/addRequest", method = RequestMethod.POST)
    public ModelAndView addRequestPost(@RequestBody ClaimModel claimModel){
        facade.addClaim(claimModel);
        ModelAndView modelAndView = new ModelAndView("definition-user");
        return modelAndView;
    }

}
