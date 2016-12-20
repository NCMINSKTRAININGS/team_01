package by.nc.teamone.services;

import by.nc.teamone.entities.Type;
import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.entities.models.TypeModel;
import by.nc.teamone.entities.models.UserModel;

import java.util.List;

public interface IFacade {

    void addUser(UserModel userModel);

    List<TypeModel> getAllTypeModel();

    List<Type> getAllType();

    void addClaim(ClaimModel claimModel);


}
