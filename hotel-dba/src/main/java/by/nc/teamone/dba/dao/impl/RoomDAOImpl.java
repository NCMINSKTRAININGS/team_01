package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IRoomDAO;
import by.nc.teamone.entities.Room;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Scope("singleton")
@Repository
public class RoomDAOImpl extends BaseDAOImpl<Room, Long> implements IRoomDAO {
    public RoomDAOImpl() {
        super(Room.class);
    }
}
