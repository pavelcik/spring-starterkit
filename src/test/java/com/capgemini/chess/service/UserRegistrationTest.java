package com.capgemini.chess.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.chess.ChessApplication;
import com.capgemini.chess.dataaccess.entities.UserEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ChessApplication.class)
public class UserRegistrationTest {

	private UserRegistrationService service = new UserRegistrationService();

	@Test
	public void shouldRegisterNewUser() throws Exception {
		// given
		UserEntity entity = giveEntity();

		// when
		UserEntity user = service.register(entity);

		// then
		Assert.assertEquals(user.getId(), new Long(1));
	}

	private UserEntity giveEntity() {
		UserEntity entity = new UserEntity();
		entity.setEmail("a@b.pl");
		entity.setPassword("12345678");
		entity.setName("Name");
		entity.setSurname("Surname");
		return entity;
	}

}
