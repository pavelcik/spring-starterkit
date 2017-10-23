package com.capgemini.chess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.chess.dataaccess.dao.UserDao;
import com.capgemini.chess.dataacess.dto.UserDto;
@Service
public class UserUpdateService {
@Autowired	
private UserDao userDao;
	
public List <UserDto> showAll() {
	return userDao.showAll();
}
public List <UserDto> findById(String id) {
	return userDao.findById(id);
}

public List <UserDto> modifyList() {
	return userDao.modifyUserList();
}

}
