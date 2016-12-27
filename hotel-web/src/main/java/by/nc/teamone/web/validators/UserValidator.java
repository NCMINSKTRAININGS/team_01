package by.nc.teamone.web.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import by.nc.teamone.entities.models.UserModel;

@Component
public class UserValidator extends BaseValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return UserModel.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		
		UserModel userModel = (UserModel) object;
		
		if(checkRegexp(userModel.login, "regex.user.login"))
			getError(errors, "login", "mess.error.user.login");
		
		if(checkRegexp(userModel.password1, "regex.user.password"))
			getError(errors, "password", "mess.error.user.password");
		
		if(checkRegexp(userModel.password2, "regex.user.password"))
			getError(errors, "password", "mess.error.user.password");
		
		if(userModel.password1.equals(userModel.password2))
			getError(errors, "password.no_match", "mess.error.user.password.not_match");
		
		if(checkRegexp(userModel.name, "regex.user.name"))
			getError(errors, "name", "mess.error.user.name");
		
		if(checkRegexp(userModel.surname, "regex.user.surname"))
			getError(errors, "surname", "mess.error.user.surname");
		
		if(checkRegexp(userModel.email, "regex.user.email"))
			getError(errors, "email", "mess.error.user.email");
		
		if(checkRegexp(userModel.phone, "regex.user.phone"))
			getError(errors, "phone", "mess.error.user.phone");
	}
	
}
