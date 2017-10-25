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

@Service
public class StatisticsService {
	private List<UserEntity> statisticsOfUser = new ArrayList<>();
	private List<UserEntity> sorted = new ArrayList<>(); 
	@Autowired
	private UserDao userdao;
	
	

	
//	public StatisticsDto listInformationAboutUser(String id) {
//		
//		return userdao.generateStatsForUser(id);
//	}
	
public StatisticsDto listInformationAboutUser(String id) {
		
		return generateStatsForUser(id);
	}

public StatisticsDto generateStatsForUser(String id) {
	for(int i=0;i<userdao.getUSERS().size();i++) {
		if(userdao.getUSERS().get(i).getId()==id) {
			statisticsOfUser.add(userdao.getUSERS().get(i));
		}
	}
	return StatisticsMapper.getStatisticsDtoFromUserEntity(statisticsOfUser.get(0));

//	statisticsOfUser = USERS.stream().filter(u->u.getId().equals(id))
//			.flatMap(p->Stream.of(p.getName(),p.getSurname(),p.getId(),
//					p.getLevel(),p.getPoints(),p.getGamesPlayed(),
//					p.getGamesWon(),p.getGamesDrown(),p.getGamesLost()))
//			.collect(Collectors.toList());
//	
//return new StatisticsDto(USERS.get(0).getGamesPlayed(),USERS.get(0).getGamesWon(),USERS.get(0).getGamesLost(),USERS.get(0).getGamesDrown()
//		,USERS.get(0).getPoints(),USERS.get(0).getLevel(),USERS.get(0).getName(),USERS.get(0).getSurname(),USERS.get(0).getId());
//	
}


public  int findUserPosition(String id) {
	   
	 sorted = userdao.getUSERS().stream().sorted((u1,u2)->Integer.compare(u1.getLevel().getValue(),u2.getLevel().getValue()))
			 .collect(Collectors.toList());
	return IntStream.range(0, sorted.size())
	    .filter(userID->sorted.get(userID).getId().equals(id))
	    .findFirst().getAsInt();
	    
	
		
}
	
}
