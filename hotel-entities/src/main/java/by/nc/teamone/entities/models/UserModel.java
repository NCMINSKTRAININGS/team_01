package by.nc.teamone.entities.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserModel {

	public String login;
	public String password1;
	public String password2;
	public String name;
	public String surname;
	public String email;
	public String phone;
	
	@JsonCreator
	public UserModel(@JsonProperty("login")String login, 
			@JsonProperty("password1")String password1, 
			@JsonProperty("password2")String password2, 
			@JsonProperty("name")String name, 
			@JsonProperty("surname")String surname, 
			@JsonProperty("email")String email,
			@JsonProperty("phone")String phone) {
		
		this.login = login;
		this.password1 = password1;
		this.password2 = password2;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;

		System.out.println("UserModel");
	}
	
	
	
}
