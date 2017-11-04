package com.capgemini.chess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.chess.dataacess.dto.StatisticsDto;
import com.capgemini.chess.service.StatisticsService;
import com.capgemini.chess.service.StatisticsServiceImpl;

@RestController
@RequestMapping("ShowUserStatistics")
public class StatisticsController {
	
	@Autowired
	private StatisticsServiceImpl statisticsService;
	
	@RequestMapping(value="/{id}")
	@GetMapping
	public StatisticsDto showUserStatistics(@PathVariable("id") String id) {
		return statisticsService.listInformationAboutUser(id);
	}
	
	@RequestMapping(value="/position/{id}") 
	@GetMapping
	public int showUserPosition(@PathVariable("id") String id) {
		return statisticsService.findUserPosition(id);
	}
	
	
}
