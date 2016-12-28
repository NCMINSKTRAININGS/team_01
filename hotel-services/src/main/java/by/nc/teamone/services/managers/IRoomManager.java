package by.nc.teamone.services.managers;

import by.nc.teamone.entities.Room;
import by.nc.teamone.entities.models.RoomModel;

import java.util.List;

public interface IRoomManager {

    void addRoom(RoomModel roomModel);

	List<Room> getRoomList();

    void changeStatusRoom(long idRoom, boolean flag, long idUser);


}
