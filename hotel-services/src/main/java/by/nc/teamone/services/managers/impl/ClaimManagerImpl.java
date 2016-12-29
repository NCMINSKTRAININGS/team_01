package by.nc.teamone.services.managers.impl;

import by.nc.teamone.dba.dao.IClaimStatusDAO;
import by.nc.teamone.dba.dao.IRoomDAO;
import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.dba.dao.IUserRoomDAO;
import by.nc.teamone.entities.Room;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.UserRoom;
import by.nc.teamone.entities.models.UserClaimModel;
import by.nc.teamone.services.managers.IClaimManager;
import by.nc.teamone.utils.LoggerError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Service
@Transactional
@Scope("singleton")
public class ClaimManagerImpl implements IClaimManager {

    @Autowired
    private IClaimStatusDAO claimStatusDAO;
    
    @Autowired
    private IUserDAO userDAO;
    
    @Autowired
    private IRoomDAO roomDAO;

    @Autowired
    private IUserRoomDAO userRoomDAO;

    @Override
    public int addClaim(UserClaimModel claimModel) {
    	
    	User user = userDAO.get(claimModel.userId);
    	Room room = roomDAO.get(claimModel.roomId);
    	
    	if(user.getMoney() < room.getCoast())
    		return -2;
    	
    	if(room.getSeats() <= 0)
    		return -1;
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    	UserRoom userRoom = new UserRoom();
    	
    	try {
			userRoom.setCheckInDate(formatter.parse(claimModel.checkInDate));
			userRoom.setCheckOutDate(formatter.parse(claimModel.checkOutDate));
		} catch (ParseException e) {
			LoggerError.INSTANCE.logError(userRoom.getClass(),e.getMessage());
		}
		
    	userRoom.setRoom(room);
    	userRoom.setUser(user);
    	userRoom.setClaimStatus(claimStatusDAO.get(1L));
    	userRoomDAO.add(userRoom);
    	
    	user.setMoney(user.getMoney() - room.getCoast());
    	userDAO.update(user);
    	room.setSeats(room.getSeats() - 1);
    	roomDAO.update(room);
    	
    	return 1;
    }


}
