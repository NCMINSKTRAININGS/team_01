package by.nc.teamone.dba.dao.room;

import by.nc.teamone.dba.dao.BaseDAOImpl;
import by.nc.teamone.entities.Room;
import org.springframework.stereotype.Repository;

/**
 * Created by Valeria on 05.12.2016.
 */
@Repository()
public class RoomDAOImpl extends BaseDAOImpl<Room, Long> implements IRoomDAO{
    public RoomDAOImpl() {
        super(Room.class);
    }
}
