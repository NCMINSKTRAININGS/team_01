package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.dba.dao.impl.BaseDAOImpl;
import by.nc.teamone.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl extends BaseDAOImpl<User, Long> implements IUserDAO {

	public UserDAOImpl() {
		super(User.class);
	}
}
