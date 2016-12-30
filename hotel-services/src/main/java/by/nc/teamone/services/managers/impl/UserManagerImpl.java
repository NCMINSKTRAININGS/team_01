package by.nc.teamone.services.managers.impl;

import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.enums.UserRole;
import by.nc.teamone.entities.models.UserClaimModel;
import by.nc.teamone.entities.models.UserModel;
import by.nc.teamone.services.managers.IUserManager;

import by.nc.teamone.services.transformers.impl.UserModelTransformer;

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
            userModels.add(userModelTransformer.buildModel(iter));
        }
        return userModels;
    }

    @Override
    public List<UserClaimModel> getClaimByIdUser(Long id) {
        User user = userDAO.get(id);
        List<UserClaimModel> claimModels = new ArrayList<UserClaimModel>();
//        for (ClaimStatus iter:user.getClaims()){
//            //claimModels.add(claimModelTransformer.buildModel(iter));
//        }
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
