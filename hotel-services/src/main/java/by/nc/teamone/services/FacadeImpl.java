package by.nc.teamone.services;

import by.nc.teamone.entities.models.RoomModel;
import by.nc.teamone.entities.models.UserModel;
import by.nc.teamone.services.managers.IRoomManager;
import by.nc.teamone.services.managers.IUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FacadeImpl implements IFacade{

    @Autowired
    IUserManager userManager;

    @Autowired
    IRoomManager roomManager;

    @Override
    public void addUser(UserModel userModel){

        System.out.println("FacadeImpl addUser");
        userManager.addUser(userModel);
    }

    @Override
    public void addRoom(RoomModel roomModel){
        roomManager.addRoom(roomModel);
    }

}
