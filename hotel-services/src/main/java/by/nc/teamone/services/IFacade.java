package by.nc.teamone.services;

import by.nc.teamone.entities.Equipment;
import by.nc.teamone.entities.Type;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.entities.models.RoomModel;
import by.nc.teamone.entities.models.UserModel;

import java.util.List;

public interface IFacade {

    void addUser(UserModel userModel);
    User getUserByName(String name);
    User getUserById(Long id);
    List<UserModel> getAllUsers();
    
    void addRoom(RoomModel roomModel);
    
    void addClaim(ClaimModel claimModel);
    List<ClaimModel> getClaimByIdUser(Long id);

    List<Type> getAllType();
    List<Equipment> getAllEquipment();   
}

