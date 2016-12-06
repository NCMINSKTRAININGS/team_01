package by.nc.teamone.services.managers.impl;

import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.enums.UserRole;
import by.nc.teamone.services.managers.IUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserManagerImpl implements IUserManager {

    @Autowired
    private IUserDAO userDAO;

    public static UserManagerImpl userManagerImpl;

    private UserManagerImpl getInstance(){
        if(userManagerImpl == null){
            userManagerImpl = new UserManagerImpl();
            return userManagerImpl;
        }else return userManagerImpl;
    }

    @Override
    public void addUser(User user) {
        user.setRole(UserRole.USER.getRole());
        userDAO.add(user);
    }
}
