package by.nc.teamone.dba.dao.user;

import by.nc.teamone.dba.dao.BaseDAOImpl;
import by.nc.teamone.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl extends BaseDAOImpl<User, Long> implements IUserDAO {

	public UserDAOImpl() {
		super(User.class);
	}

}
