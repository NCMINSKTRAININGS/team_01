package by.nc.teamone.web.validators;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

@Component
@PropertySource(value = {
		"classpath:/validator/messages.properties",
		"classpath:/validator/regex.properties" })
public class BaseValidator {
	
	@Autowired
	private Environment environment;
	
	boolean checkRegexp(String value, String regex){
		
		Pattern pattern = Pattern.compile(getRegex(regex));
		Matcher matcher = pattern.matcher(value);
		
		return !matcher.matches();
	}
	
	public Map<String, String> getMessages(BindingResult bindingResult) {
		List<ObjectError> listErrors = bindingResult.getAllErrors();
		Map<String, String> mapErrors = new HashMap<>();
		for (int i = 0; i < listErrors.size(); i++) {
			mapErrors.put(listErrors.get(i).getCode(), listErrors.get(i).getDefaultMessage());
		}
		return mapErrors;
	}
	
	public void getError(Errors errors, String code, String message) {
		errors.reject(code, environment.getRequiredProperty(message));
	}
	
	public String getRegex(String regex){
		return environment.getRequiredProperty(regex);
	}
}
