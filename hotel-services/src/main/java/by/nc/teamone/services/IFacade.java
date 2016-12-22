package by.nc.teamone.services;

import by.nc.teamone.entities.Type;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.entities.models.RoomModel;
import by.nc.teamone.entities.models.UserModel;

import java.util.List;

public interface IFacade {

    void addUser(UserModel userModel);

    List<Type> getAllType();

    void addClaim(ClaimModel claimModel);

    void addRoom(RoomModel roomModel);

    User getUserByName(String name);


    User getUserById(Long id);

    List<ClaimModel> getClaimByIdUser(Long id);

    List<UserModel> getAllUsers();


}

