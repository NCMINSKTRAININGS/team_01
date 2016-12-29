package by.nc.teamone.services.managers.impl;

import by.nc.teamone.dba.dao.*;
import by.nc.teamone.entities.Room;
import by.nc.teamone.entities.UserRoom;
import by.nc.teamone.entities.models.RoomModel;
import by.nc.teamone.services.managers.IRoomManager;
import by.nc.teamone.services.transformers.impl.RoomModelTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Scope("singleton")
public class RoomManagerImpl implements IRoomManager {

    @Autowired
    private IRoomDAO roomDAO;

    @Autowired
    private ITypeDAO typeDAO;

    @Autowired
    private IStatusDAO statusDAO;

    @Autowired
    private IUserRoomDAO userRoomDAO;

    @Autowired
    private RoomModelTransformer roomModelTransformer;

    @Autowired
    private IClaimStatusDAO claimStatusDAO;


    @Override
    public void addRoom(RoomModel roomModel) {

        Room room = roomModelTransformer.buildEntity(roomModel);
        room.setStatus(statusDAO.get(1L));
        room.setType(typeDAO.get(roomModel.type));
        room.setClaimStatus(null    );
        roomDAO.add(room);

    }

	@Override
	public List<Room> getRoomList() {
		List<Room> roomList = roomDAO.getAll();
		return roomList;
	}

    @Override
    public void changeStatusRoom(long idRoom, boolean flag ,long idUser) {

        Room room = roomDAO.get(idRoom);
        long idClaimStatus;

        if (flag) {
            idClaimStatus= 2L;
            room.setStatus(statusDAO.get(2L));
        } else idClaimStatus =3L;


        for(UserRoom iter:room.getUserRooms()){
            if (iter.getUser().getId() == idUser){
                iter.setClaimStatus(claimStatusDAO.get(idClaimStatus));
                if (!flag) iter.getUser().setMoney(iter.getUser().getMoney() + iter.getRoom().getCoast());
                userRoomDAO.update(iter);
            }
        }
        roomDAO.update(room);
    }
}
