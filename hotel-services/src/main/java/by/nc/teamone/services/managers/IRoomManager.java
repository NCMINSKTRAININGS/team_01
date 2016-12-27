package by.nc.teamone.services.managers;

import java.util.List;

import by.nc.teamone.entities.Room;
import by.nc.teamone.entities.models.RoomModel;

public interface IRoomManager {

    void addRoom(RoomModel roomModel);

	List<Room> getRoomList();

}
