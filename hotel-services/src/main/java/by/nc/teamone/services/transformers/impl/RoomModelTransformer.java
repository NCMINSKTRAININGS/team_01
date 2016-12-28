package by.nc.teamone.services.transformers.impl;

import by.nc.teamone.entities.Room;
import by.nc.teamone.entities.models.RoomModel;
import org.springframework.stereotype.Repository;


@Repository
public class RoomModelTransformer {

    public Room buildEntity(RoomModel model) {

        Room room = new Room();
        room.setCoast(model.coast);
        room.setSeats(model.seats);
        return room;
    }
}
