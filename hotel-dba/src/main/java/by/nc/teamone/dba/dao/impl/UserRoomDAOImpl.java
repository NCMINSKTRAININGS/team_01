package by.nc.teamone.dba.dao.impl;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import by.nc.teamone.dba.dao.IUserRoomDAO;
import by.nc.teamone.entities.UserRoom;

@Scope("singleton")
@Repository
public class UserRoomDAOImpl extends BaseDAOImpl<UserRoom, Long> implements IUserRoomDAO {
    public UserRoomDAOImpl() {
        super(UserRoom.class);
    }

}
