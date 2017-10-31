package com.capgemini.chess.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.chess.dataaccess.dao.UserDao;
import com.capgemini.chess.dataaccess.entities.UserEntity;
import com.capgemini.chess.dataaccess.mappers.StatisticsMapper;
import com.capgemini.chess.dataacess.dto.StatisticsDto;
import com.capgemini.chess.enums.Level;

@Service
public class StatisticsServiceImpl implements StatisticsService {
	
	@Autowired
	private UserDao userdao;
	private List<UserEntity> sorted = new ArrayList<>();
	public StatisticsServiceImpl() {

	}

	public StatisticsDto listInformationAboutUser(String id) {

		return generateStatsForUser(id);
	}

	public StatisticsDto generateStatsForUser(String id) {
		List<UserEntity> statisticsOfUser = new ArrayList<>();
		
		for (int i = 0; i < userdao.getUSERS().size(); i++) {
			if (userdao.getUSERS().get(i).getId() == id) {
				statisticsOfUser.add(userdao.getUSERS().get(i));
			}
		}
		return StatisticsMapper.getStatisticsDtoFromUserEntity(statisticsOfUser.get(0));
	}

	public int findUserPosition(String id) {

		
		
		sorted = userdao.getUSERS().stream()
				.sorted((u1, u2) -> Integer.compare(u2.getLevel().getValue(), u1.getLevel().getValue()))
				.collect(Collectors.toList());
		return IntStream.range(0, sorted.size()).filter(userID -> sorted.get(userID).getId().equals(id)).findFirst()
				.getAsInt() + 1;

	}

}
