package com.capgemini.chess.dataaccess.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.cfg.NotYetImplementedException;

import com.capgemini.chess.dataaccess.entities.UserEntity;
import com.capgemini.chess.dataaccess.mappers.UserMapper;

public class UserDao {
	
	
	public UserDao() {
		addDummyUsers();
	}
	private List<UserEntity> USERS = new ArrayList<>();

	public UserEntity save(UserEntity entity) {
		throw new NotYetImplementedException();
	}
	public List showAll() {
		return UserMapper.getUserDtoFromUserEntity(USERS);
	}
	public List findById(String id) {
		List<UserEntity> usersById = USERS.stream().filter(u->u.getId().equals(id)).collect(Collectors.toList());
		return UserMapper.getUserDtoFromUserEntity(usersById);
	}
	
	private void addDummyUsers() {
		USERS.add(new UserEntity("marco1","marco1@email.com","Kotek123","Marco","Tutti","I love Italy and I love chess.","Don't be afraid to dream..."));
		USERS.add(new UserEntity("carol1","carol1@email.com","Carol123","Carol","Hastings","I am from America and I like dogs.","Keep working!"));
		USERS.add(new UserEntity("anthony12_big","crazyanthony@email.com","vivalafiesta1","Anthony","James","I have two cats.","Spaghetti is everything..."));
		USERS.add(new UserEntity("debbie","debbie.michales@email.com","Password12","Debbie","Michaels","Mother of two from Canada.","Find your goal in life and you will be happy..."));
		USERS.add(new UserEntity("joseph","joseph111@email.com","Qwerty123","Joseph","Saint","Just a regular guy.","Dream big , not small..."));
		USERS.add(new UserEntity("eddie","eddiefreddie@email.com","Password12345","Eddie","Smith","Chess champion in '09","Chess>life..."));
	}

}