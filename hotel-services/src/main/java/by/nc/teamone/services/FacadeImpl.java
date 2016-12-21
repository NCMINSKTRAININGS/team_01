package by.nc.teamone.services;

import by.nc.teamone.entities.Claim;
import by.nc.teamone.entities.Type;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.entities.models.TypeModel;
import by.nc.teamone.entities.models.UserModel;
import by.nc.teamone.services.managers.IClaimManager;
import by.nc.teamone.services.managers.ITypeManager;
import by.nc.teamone.entities.models.RoomModel;
import by.nc.teamone.services.managers.IRoomManager;
import by.nc.teamone.services.managers.IUserManager;
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

    @Override
    public List<ClaimModel> getClaimByIdUser(Long id) {
        return userManager.getClaimByIdUser(id);
    }

    @Autowired
    IRoomManager roomManager;

    @Override
    public User getUserByName(String name) {
        return userManager.getUserByName(name);
    }

    @Override
    public void addUser(UserModel userModel){
        userManager.addUser(userModel);
    }

    @Override
    public List<TypeModel> getAllTypeModel(){
        return typeManager.getAllTypeModel();
    }

    @Override
    public List<Type> getAllType(){
        return typeManager.getAllType();
    }

    @Override
    public void addClaim(ClaimModel claimModel) {
        claimManager.addClaim(claimModel);
    }

    @Override
    public void addRoom(RoomModel roomModel){
        roomManager.addRoom(roomModel);
    }

    @Override
    public List<Claim> getAllClaim() {
        return claimManager.getAllClaim();
    }

    @Override
    public User getUserById(Long id) {
        return userManager.getUserById(id);
    }

}
