package com.capgemini.chess.service;

import org.springframework.stereotype.Service;

import com.capgemini.chess.dataaccess.entities.UserEntity;
import com.capgemini.chess.dataaccess.mappers.UserMapper;
import com.capgemini.chess.dataacess.dto.UserDto;
import com.capgemini.chess.exceptions.InvalidNameEnteredException;
@Service
public interface UserService {
	public boolean validateUserFieldsName(String name) throws InvalidNameEnteredException;

	public UserEntity findById(String id);
	public UserDto update(UserDto updatedUser);
	public UserDto changeUserInfo(UserDto userdto) throws InvalidNameEnteredException;

}
