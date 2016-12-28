package by.nc.teamone.services.transformers.impl;

import by.nc.teamone.entities.User;
import by.nc.teamone.entities.models.UserModel;
import org.springframework.stereotype.Repository;

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

	public UserModel buildModel(User user){

		UserModel userModel = new UserModel();
		userModel.setId(user.getId());
		userModel.setLogin(user.getLogin());
		userModel.setEmail(user.getEmail());
		userModel.setName(user.getName());
		userModel.setSurname(user.getSurname());
		userModel.setPhone(user.getPhone());
		userModel.setMoney(user.getMoney());
		userModel.setRole(user.getRole());
		return userModel;
	}
}
