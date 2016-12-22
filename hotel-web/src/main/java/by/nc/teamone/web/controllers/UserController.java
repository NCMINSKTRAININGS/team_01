package by.nc.teamone.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import by.nc.teamone.services.IFacade;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IFacade facade;
    
    
    

//    @RequestMapping(value = "/addRequest", method = RequestMethod.POST)
//    public void addRequestPost(@RequestBody ClaimModel claimModel) {
//        facade.addClaim(claimModel);
//    }
//
//
//    @RequestMapping(value = "/main/{command}/{id}", method = RequestMethod.GET)
//    public ModelAndView goToUserPage(@PathVariable("command") String command,
//                                     @PathVariable("id") Long id) {
//
//        ModelAndView modelAndView = new ModelAndView("definition-user");
//
//        modelAndView.addObject("user", facade.getUserById(id));
//        modelAndView.addObject("command", command);
//        if (command.equals("addClaim")) {
//            modelAndView.addObject("type", facade.getAllType());
//        }
//        else if (command.equals("findAll")){
//            modelAndView.addObject("claim", facade.getClaimByIdUser(id));
//        }
//        return modelAndView;
//    }


}
