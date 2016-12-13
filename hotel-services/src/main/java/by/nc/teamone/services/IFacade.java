package by.nc.teamone.services;

import by.nc.teamone.entities.models.RoomModel;
import by.nc.teamone.entities.models.UserModel;

public interface IFacade {

    void addUser(UserModel userModel);

    void addRoom(RoomModel roomModel);

}
