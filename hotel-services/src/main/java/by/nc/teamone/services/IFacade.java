package by.nc.teamone.services;

import by.nc.teamone.entities.Claim;
import by.nc.teamone.entities.Type;
import by.nc.teamone.entities.models.UserModel;

import java.util.List;

public interface IFacade {

    void addUser(UserModel userModel);

    List<Type> getAllType();

    void addClaim(Claim claim);

}
