package by.nc.teamone.services;

import by.nc.teamone.entities.Equipment;
import by.nc.teamone.entities.Type;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.models.AddressModel;
import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.entities.models.RoomModel;
import by.nc.teamone.entities.models.UserModel;
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
    public List<ClaimModel> getClaimByIdUser(Long id) {
        return userManager.getClaimByIdUser(id);
    }
    
    @Override
	public void addClaim(ClaimModel claimModel) {
		claimManager.addClaim(claimModel);
		
	}
    
    // ---------------Room
    @Override
    public void addRoom(RoomModel roomModel){
        roomManager.addRoom(roomModel);
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
