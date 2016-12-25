package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.entities.User;
import org.hibernate.query.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Scope("singleton")
@Repository
public class UserDAOImpl extends BaseDAOImpl<User, Long> implements IUserDAO {

	public UserDAOImpl() {
		super(User.class);
	}

	@Override
	public User getByLogin(String login) {
		Query query = getSession().createQuery("select D from User D where D.login = :log", clazz);
		query.setParameter("log", login);
		List<User> list = (List<User>) query.getResultList();
		return list.get(0);
	}
}
