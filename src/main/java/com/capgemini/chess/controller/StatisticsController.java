package com.capgemini.chess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.chess.dataacess.dto.StatisticsDto;
import com.capgemini.chess.service.StatisticsService;

@RestController
@RequestMapping("ShowUserStatistics")
public class StatisticsController {
	
	@Autowired
	private StatisticsService statisticsService;
	
	@RequestMapping(value="/{id}")
	@GetMapping
	public StatisticsDto showUserStatistics(@PathVariable("id") String id) {
		return statisticsService.listInformationAboutUser(id);
	}
	
	
}
