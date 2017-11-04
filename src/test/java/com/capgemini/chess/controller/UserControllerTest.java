package com.capgemini.chess.controller;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.capgemini.chess.dataacess.dto.StatisticsDto;
import com.capgemini.chess.dataacess.dto.UserDto;
import com.capgemini.chess.enums.Level;
import com.capgemini.chess.service.UserServiceImpl;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserControllerTest {

private MockMvc mockMvc;
	

	@Mock
	private UserServiceImpl userService;
	
	@Autowired
	private WebApplicationContext wac;
	
	@Before
	public void setUp() {
		
		Mockito.reset(userService);
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		
	}

	@Test
	public void ShouldShowNewUserDataTest() throws Exception {
		UserDto dto = new UserDto("marco1", "marco1@email.com", "Kotek123", "Marcin", "Tutti",
				"I love Italy and I love chess.", "Don't be afraid to dream...");
		
		Mockito.when(userService.changeUserInfo(dto)).thenReturn(dto);
		
		mockMvc.perform(post("/AccountSettings/editInfo/{id}/","marco1"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.name",is("Marcin")))
		.andDo(MockMvcResultHandlers.print())
		.andReturn();

		
		
	}
	

}
