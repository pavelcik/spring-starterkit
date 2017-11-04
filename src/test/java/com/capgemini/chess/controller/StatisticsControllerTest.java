package com.capgemini.chess.controller;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.capgemini.chess.controller.StatisticsController;
import com.capgemini.chess.dataaccess.dao.UserDao;
import com.capgemini.chess.dataaccess.entities.UserEntity;
import com.capgemini.chess.dataacess.dto.StatisticsDto;
import com.capgemini.chess.enums.Level;
import com.capgemini.chess.service.StatisticsServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

public class StatisticsControllerTest {
	private MockMvc mockMvc;
	

	@Mock
	private StatisticsServiceImpl statisticsService;
	
	@Autowired
	private WebApplicationContext wac;
	
	@Before
	public void setUp() {
		Mockito.reset(statisticsService);
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		
	}

	@Test
	public void ShouldShowUserStatisticsTest() throws Exception {
		StatisticsDto userStats = new StatisticsDto(120L,30L,50L,40L,200L,Level.NEWBIE,"Marco","Tutti","marco1");
		Mockito.when(statisticsService.listInformationAboutUser("marco1")).thenReturn(userStats);
		
		mockMvc.perform(get("/ShowUserStatistics/{id}","marco1"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
		.andExpect(jsonPath("$.gamesPlayed", is(120)))
		.andExpect(jsonPath("$.points", is(200)));
		
		
	}
	
	@Test
	public void ShouldShowUserPositionTest() throws Exception {
		StatisticsDto userStats = new StatisticsDto(120L,30L,50L,40L,200L,Level.NEWBIE,"Marco","Tutti","marco1");
		int position = 1;
		Mockito.when(statisticsService.findUserPosition("marco1")).thenReturn(position);
		
		mockMvc.perform(get("/ShowUserStatistics/position/{id}","marco1"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
		.andExpect(jsonPath("$",is(6)));
		
		
	}
	

}
