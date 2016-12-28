package by.nc.teamone.services;

import by.nc.teamone.entities.*;
import by.nc.teamone.entities.models.*;

import java.util.List;

public interface IFacade {

    void addUser(UserModel userModel);
    User getUserByName(String name);
    User getUserById(Long id);
    List<UserModel> getAllUsers();
    
    void addRoom(RoomModel roomModel);
    List<Room> getRoomList();
    
    int addClaim(UserClaimModel claimModel);
    List<UserClaimModel> getClaimByIdUser(Long id);

    List<Type> getAllType();
    List<Equipment> getAllEquipment();

    List<AddressModel> getAllAddress();
    List<UserRoomModel> getUserRoomList();
    void changeStatusRoom(long idRoom, boolean flag , long idUser);
}

