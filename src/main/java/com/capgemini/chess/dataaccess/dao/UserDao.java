package com.capgemini.chess.dataaccess.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.capgemini.chess.dataaccess.entities.UserEntity;
import com.capgemini.chess.enums.Level;

@Component
public class UserDao {

	public UserDao() {
		addDummyUsers();
	}

	private List<UserEntity> USERS = new ArrayList<>();

	

	public List<UserEntity> getUSERS() {
		return USERS;
	}

	private void addDummyUsers() {
		USERS.add(new UserEntity("marco1", "marco1@email.com", "Kotek123", "Marco", "Tutti",
				"I love Italy and I love chess.", "Don't be afraid to dream...",120L,30L,50L,40L,200L,Level.NEWBIE));
		USERS.add(new UserEntity("carol1", "carol1@email.com", "Carol123", "Carol", "Hastings",
				"I am from America and I like dogs.", "Keep working!",345L,124L,57L,164L,6750L,Level.EXPERIENCED_MIDDLEBORW));
		USERS.add(new UserEntity("anthony12_big", "crazyanthony@email.com", "vivalafiesta1", "Anthony", "James",
				"I have two cats.", "Spaghetti is everything...",410L,80L,120L,210L,602L,Level.BEGINNER));
		USERS.add(new UserEntity("debbie", "debbie.michales@email.com", "Password12", "Debbie", "Michaels",
				"Mother of two from Canada.", "Find your goal in life and you will be happy...",6820,4020,480,2320,86750,Level.CHUCK_NORRIS_OF_CHESS));
		USERS.add(new UserEntity("joseph", "joseph111@email.com", "Qwerty123", "Joseph", "Saint", "Just a regular guy.",
				"Dream big , not small...",1200,200,1000,700,10000,Level.ADVANCED));
		USERS.add(new UserEntity("eddie", "eddiefreddie@email.com", "Password12345", "Eddie", "Smith",
				"Chess champion in '09", "Chess>life...",150,30,50,40,350,Level.WEAKLING));
	}
	
	

}