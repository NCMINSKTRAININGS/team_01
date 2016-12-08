package by.nc.teamone.services.managers.impl;

import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.enums.UserRole;
import by.nc.teamone.services.managers.IUserManager;
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

    @Override
    public void addUser(User user) {
        user.setRole(UserRole.USER.getRole());
        userDAO.add(user);
    }
}
