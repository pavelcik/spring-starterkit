package com.capgemini.chess.dataacess.dto;

import org.springframework.stereotype.Component;

@Component
public class UserDto {
	private String id;
	private String email;
	private String password;
	private String name;
	private String surname;
	private String about_me;
	private String life_motto;

	public UserDto() {
		
	}
	public UserDto(String id, String email, String password, String name, String surname, String about_me,
			String life_motto) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.about_me = about_me;
		this.life_motto = life_motto;
	}

	public String getAbout_me() {
		return about_me;
	}

	public void setAbout_me(String about_me) {
		this.about_me = about_me;
	}

	public String getLife_motto() {
		return life_motto;
	}

	public void setLife_motto(String life_motto) {
		this.life_motto = life_motto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
}
