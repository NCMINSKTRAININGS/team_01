package by.nc.teamone.services.transformers;

import org.springframework.stereotype.Repository;

import by.nc.teamone.entities.User;
import by.nc.teamone.entities.models.UserModel;

@Repository
public class UserModelTransformer{

	public User buildEntity(UserModel model) {
		
		User user = new User();
		
		user.setLogin(model.login);
		user.setPassword(model.password1);
		user.setName(model.name);
		user.setSurname(model.surname);
		user.setEmail(model.email);
		user.setPhone(model.phone);
		
		return user;
	}
}
