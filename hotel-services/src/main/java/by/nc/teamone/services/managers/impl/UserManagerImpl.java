package by.nc.teamone.services.managers.impl;

import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.enums.UserRole;
import by.nc.teamone.entities.models.UserModel;
import by.nc.teamone.services.managers.IUserManager;
import by.nc.teamone.services.transformers.UserModelTransformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Scope("singleton")
public class UserManagerImpl implements IUserManager {

    @Autowired
    private IUserDAO userDAO;
    
    @Autowired
    private UserModelTransformer userModelTransformer;

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
        user.setPassword(null);
        return user;
    }
}
