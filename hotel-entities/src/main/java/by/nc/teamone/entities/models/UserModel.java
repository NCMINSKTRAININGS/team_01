package by.nc.teamone.entities.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserModel {

	public Long id;
	public String login;
	public String password1;
	public String password2;
	public String name;
	public String surname;
	public String email;
	public String phone;
	public String role;
	private double money;

	public UserModel(){
	}

	@JsonCreator
	public UserModel(@JsonProperty("login")String login, 
			@JsonProperty("password1")String password1, 
			@JsonProperty("password2")String password2, 
			@JsonProperty("name")String name, 
			@JsonProperty("surname")String surname, 
			@JsonProperty("email")String email,
			@JsonProperty("role")String role,
			@JsonProperty("phone")String phone) {
		
		this.login = login;
		this.password1 = password1;
		this.password2 = password2;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
		this.role = role;

	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
