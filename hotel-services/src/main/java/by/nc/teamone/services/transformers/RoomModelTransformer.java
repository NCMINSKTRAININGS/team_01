package by.nc.teamone.services.transformers;

import by.nc.teamone.entities.Room;
import by.nc.teamone.entities.models.RoomModel;
import org.springframework.stereotype.Repository;

/**
 * Created by Valeria on 13.12.2016.
 */
@Repository
public class RoomModelTransformer {

    public Room buildEntity(RoomModel model) {

        Room room = new Room();

        room.setCoast(model.coast);
        room.setSeats(model.seats);
        room.setStatus(model.status_id);
        room.setType(model.type_id);

        return room;
    }
}
