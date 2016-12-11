package by.nc.teamone.services;

import by.nc.teamone.entities.User;
import by.nc.teamone.entities.models.UserModel;
import by.nc.teamone.services.managers.IUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FacadeImpl implements IFacade{

    @Autowired
    IUserManager userManager;

    @Override
    public void addUser(UserModel userModel){
        userManager.addUser(userModel);
    }

}
