package com.capgemini.chess.service;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.capgemini.chess.dataaccess.mappers.StatisticsMapper;
import com.capgemini.chess.dataacess.dto.StatisticsDto;
@Service
public interface StatisticsService {
	public StatisticsDto listInformationAboutUser(String id);

	public StatisticsDto generateStatsForUser(String id);

	public int findUserPosition(String id);
}
