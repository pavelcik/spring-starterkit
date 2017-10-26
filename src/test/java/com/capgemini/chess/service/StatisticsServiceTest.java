package com.capgemini.chess.service;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.chess.ChessApplication;
import com.capgemini.chess.dataaccess.dao.UserDao;
import com.capgemini.chess.dataaccess.entities.UserEntity;
import com.capgemini.chess.enums.Level;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StatisticsServiceTest {

	@Autowired
	StatisticsService service;
	@Autowired
	UserDao userdao;
	
	@Test
	public void GetStatisticInformationByLevelTest() {
		
		//given
		
		String id = "debbie";
		
		//when
		service.listInformationAboutUser(id);
		
		//then
		assertEquals(service.listInformationAboutUser(id).getLevel(), userdao.getUSERS().get(3).getLevel());
	}
	
	@Test
public void GetStatisticInformationByGamesPlayeTest() {
		
		//given
		
		String id = "debbie";
		
		//when
		service.listInformationAboutUser(id);
		
		//then
		assertNotEquals(service.listInformationAboutUser(id).getGamesPlayed(), userdao.getUSERS().get(2).getGamesPlayed());
	
}
	@Test
public void FindUserPositionTest() {
		
		//given
		
		String id = "debbie";
		
		//when
		service.findUserPosition(id);
	
		//then
		assertEquals(service.findUserPosition(id), 1);
}	
	@Test
	public void FindUserWrongPositionTest() {
			
			//given
			
			String id = "marco1";
			
			//when
			service.findUserPosition(id);
		
			//then
			assertNotEquals(service.findUserPosition(id), 1);
	
}
	
	@Test
	public void FindUserLastPositionTest() {
			
			//given
			
			String id = "marco1";
			
			//when
			service.findUserPosition(id);
		
			//then
			assertEquals(service.findUserPosition(id), 6);
	
}
}