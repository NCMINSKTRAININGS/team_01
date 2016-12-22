package by.nc.teamone.services.managers.impl;

import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.entities.Claim;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.enums.UserRole;
import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.entities.models.UserModel;
import by.nc.teamone.services.managers.IUserManager;
import by.nc.teamone.services.transformers.UserModelTransformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@Scope("singleton")
public class UserManagerImpl implements IUserManager {

    @Autowired
    private IUserDAO userDAO;
    
    @Autowired
    private UserModelTransformer userModelTransformer;

    @Override
    public List<UserModel> getAllUsers() {
        List<User> users = userDAO.getAll();
        List<UserModel> userModels = new ArrayList<UserModel>();
        for (User iter:users){
            UserModel userModel = new UserModel();
            userModel.setLogin(iter.getLogin());
            userModel.setEmail(iter.getEmail());
            userModel.setName(iter.getName());
            userModel.setId(iter.getId());
            userModels.add(userModel);
        }
        return userModels;
    }

    @Override
    public List<ClaimModel> getClaimByIdUser(Long id) {
        User user = userDAO.get(id);
        List<ClaimModel> claimModels = new ArrayList<ClaimModel>();
        for (Claim iter:user.getClaims()){
            ClaimModel claimModel = new ClaimModel();
            claimModel.setCheckInDate(iter.getCheckInDate());
            claimModel.setCheckOutDate(iter.getCheckOutDate());
            claimModel.setTypeObj( iter.getType());
            claimModel.setId( iter.getId());
            claimModel.setStatus(iter.getStatus());
            claimModels.add(claimModel);
        }
        return claimModels;
    }




    @Override
    public User getUserById(Long id) {
        return userDAO.get(id);
    }

    @Override
    public void addUser(UserModel userModel) {

    	User user = userModelTransformer.buildEntity(userModel);
    	user.setRole(UserRole.USER.getRole());
    	user.setEnabled(true);
    	userDAO.add(user);
  }

    @Override
    public User getUserByName(String name) {
        User user = userDAO.getByLogin(name);
        return user;
    }
}
