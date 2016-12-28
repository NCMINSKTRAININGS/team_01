package by.nc.teamone.services;

import by.nc.teamone.entities.*;
import by.nc.teamone.entities.models.*;
import by.nc.teamone.services.managers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FacadeImpl implements IFacade{



    @Autowired
    IUserManager userManager;

    @Autowired
    ITypeManager typeManager;
    
    @Autowired
    IClaimManager claimManager;

    @Autowired
    IRoomManager roomManager;
    
    @Autowired
    IEquipmentManager equipmentManager;

    @Autowired
    IAddressManager addressManager;

    @Autowired
    IUserRoomManager userRoomManager;
    
    
    // ---------------User
    @Override
    public List<UserModel> getAllUsers() {
        return userManager.getAllUsers();
    }
    
    @Override
    public User getUserById(Long id) {
        return userManager.getUserById(id);
    }
    
    @Override
    public User getUserByName(String name) {
        return userManager.getUserByName(name);
    }
    
    @Override
    public void addUser(UserModel userModel){
        userManager.addUser(userModel);
    }
    
    // ---------------Claim
    @Override
    public List<UserClaimModel> getClaimByIdUser(Long id) {
        return userManager.getClaimByIdUser(id);
    }
    
    @Override
	public int addClaim(UserClaimModel claimModel) {
		return claimManager.addClaim(claimModel);
	}
    
    // ---------------Room
    @Override
    public List<UserRoomModel> getUserRoomList(){
        return userRoomManager.getUserRoomList();
    }

    @Override
    public void addRoom(RoomModel roomModel){
        roomManager.addRoom(roomModel);
    }
    
    @Override
	public List<Room> getRoomList() {
		return roomManager.getRoomList();
	}

    @Override
    public void changeStatusRoom(long idRoom, boolean flag, long idUser) {
        roomManager.changeStatusRoom(idRoom, flag, idUser);
    }
    
    //----------------Type
    @Override
    public List<Type> getAllType(){
        return typeManager.getAllType();
    }
    
    //----------------Equipment
    @Override
    public List<Equipment> getAllEquipment(){
        return equipmentManager.getAllEquipment();
    }

    //----------------Address
    @Override
    public List<AddressModel> getAllAddress(){
        return addressManager.getAllAddress();
    }
}
