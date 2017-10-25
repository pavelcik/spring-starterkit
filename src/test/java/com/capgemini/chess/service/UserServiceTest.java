package com.capgemini.chess.service;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.chess.ChessApplication;
import com.capgemini.chess.dataaccess.dao.UserDao;
import com.capgemini.chess.dataaccess.entities.UserEntity;
import com.capgemini.chess.dataaccess.mappers.UserMapper;
import com.capgemini.chess.dataacess.dto.UserDto;
import com.capgemini.chess.exceptions.InvalidNameEnteredException;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ChessApplication.class)

public class UserServiceTest {
	

	@Autowired
	UserService service;
	
	
	@Test
	public void UpdateValuestest() throws InvalidNameEnteredException {
		
		//given
		
		String newName = "Marcin";
		
		
		UserDto dto = new UserDto("marco1", "marco1@email.com", "Kotek123", "Marcin", "Tutti",
				"I love Italy and I love chess.", "Don't be afraid to dream...");
		
		
		UserDto updated = service.changeUserInfo(dto);
		
		Assert.assertEquals(newName, updated.getName());
		
		
	}
	
	@Test(expected=InvalidNameEnteredException.class)
	public void UpdateValuesWhenNameIsNotRightTest() throws InvalidNameEnteredException {
		//given
		
				String newName = "Marcin122";
				
				
				UserDto dto = new UserDto("marco1", "marco1@email.com", "Kotek123", "Marcin", "Tutti",
						"I love Italy and I love chess.", "Don't be afraid to dream...");
				
				
				UserDto updated = service.changeUserInfo(dto);
				
				
				
	}
	
	

}
