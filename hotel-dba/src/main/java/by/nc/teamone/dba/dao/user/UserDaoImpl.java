package by.nc.teamone.dba.dao.user;

import org.springframework.stereotype.Repository;

import by.nc.teamone.dba.dao.BaseDaoImpl;
import by.nc.teamone.entities.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User, Long> implements IUserDao{

	public UserDaoImpl() {
		super(User.class);
	}
}
