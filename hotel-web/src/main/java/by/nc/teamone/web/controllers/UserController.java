package by.nc.teamone.web.controllers;

import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.entities.models.TypeModel;
import by.nc.teamone.services.IFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IFacade facade;



    @RequestMapping(value = "/addRequest2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public @ResponseBody List<TypeModel> addRequestGet(){
        return facade.getAllTypeModel();// можно вообще убрать TypeModel и сделать facade.getAllType , всё будет тоже норм
    }

    @RequestMapping(value = "/addRequest", method = RequestMethod.POST)
    public  void addRequestPost(@RequestBody ClaimModel claimModel){
        facade.addClaim(claimModel);
    }

}
