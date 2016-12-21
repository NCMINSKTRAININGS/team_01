package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.entities.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Scope("singleton")
@Repository
public class UserDAOImpl extends BaseDAOImpl<User, Long> implements IUserDAO {

	public UserDAOImpl() {
		super(User.class);
	}

	@Override
	public User getByLogin(String login) {
		//Query query = getSession().createQuery("select D from User D where D.login = :log", clazz);
		//query.setParameter("log", login);
		//List<User> list = (List<User>) query.
		//return list.get(0);
		return null;
	}
}
