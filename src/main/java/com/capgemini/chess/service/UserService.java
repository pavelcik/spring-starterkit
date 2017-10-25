package com.capgemini.chess.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.chess.dataaccess.dao.UserDao;
import com.capgemini.chess.dataaccess.entities.UserEntity;
import com.capgemini.chess.dataaccess.mappers.UserMapper;
import com.capgemini.chess.dataacess.dto.UserDto;
import com.capgemini.chess.exceptions.InvalidNameEnteredException;

@Service
public class UserService {
@Autowired
private UserDao userdao;
private static final String nameValidator = "[a-zA-Z]+";

public boolean validateUserFieldsName(String name) throws InvalidNameEnteredException {
	 if(userdao.getUSERS().stream().anyMatch(u-> u.getName().matches(nameValidator))) {
		 return true;
	 }else throw new InvalidNameEnteredException();
}
	
public UserEntity findById(String id) {
	return userdao.getUSERS().stream().filter(u -> u.getId().equals(id)).findFirst().get();
}


public UserDto update(UserDto updatedUser) {
	UserEntity updatedUserEntity = UserMapper.getUserEntityFromUserDto(updatedUser);
	UserEntity currentUserEntity = findById(updatedUser.getId());
	userdao.getUSERS().set(userdao.getUSERS().indexOf(currentUserEntity), updatedUserEntity);
	return UserMapper.getUserDtoFromUserEntity(updatedUserEntity);
}

public UserDto changeUserInfo(UserDto userdto) throws InvalidNameEnteredException {
	
	update(userdto);
	validateUserFieldsName(userdto.getName());
	return userdto;
}


}