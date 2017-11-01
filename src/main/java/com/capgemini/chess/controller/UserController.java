package com.capgemini.chess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.chess.dataacess.dto.UserDto;
import com.capgemini.chess.exceptions.InvalidNameEnteredException;
import com.capgemini.chess.service.UserService;

@RestController
@RequestMapping("AccountSettings")
public class UserController {

@Autowired
private UserService userService;


@RequestMapping(value="/editInfo/{id}/newName={name}", method = RequestMethod.POST)
public UserDto changeUserName(@PathVariable String name,@PathVariable String id) throws InvalidNameEnteredException {
//	dto = userService.findById(id);
	UserDto dto = new UserDto("marco1", "marco1@email.com", "Kotek123", "Marcin", "Tutti",
			"I love Italy and I love chess.", "Don't be afraid to dream...");
	dto = userService.changeUserInfo(dto);
	dto.setName(name); 
	return dto;
}
}
