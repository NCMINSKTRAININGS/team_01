package by.nc.teamone.services.managers;

import by.nc.teamone.entities.User;
import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.entities.models.UserModel;

import java.util.List;

public interface IUserManager {

    void addUser(UserModel userModel);

    User getUserByName(String name);

    User getUserById(Long id);

    List<ClaimModel> getClaimByIdUser(Long id);

    List<UserModel> getAllUsers();
}


