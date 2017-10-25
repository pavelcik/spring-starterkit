package com.capgemini.chess.dataaccess.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.chess.dataaccess.entities.StatisticsEntity;
import com.capgemini.chess.enums.Level;

@Component
public class StatisticsDao {
@Autowired
private UserDao userdao;
private List <String> id = new ArrayList<>();
private List <StatisticsEntity> userStatistics = new ArrayList<>();


	
	public StatisticsDao() {
		
	}
	
	public void calculateLevelOfUser() {
		
	}
	
	
	
	private void assignStatisticsToUser() {
		
//		userStatistics = userdao.getUSERS().stream()
//				.map(u->new StatisticsEntity(u.getId(),rand.nextLong()*500,
//						rand.nextLong()*1, (rand.nextLong()*500)-rand.nextLong()*500,500-(rand.nextLong()*500)-(rand.nextLong()*500)
//						500)));
	
		id = (List<String>) userdao.getUSERS().stream().map(u->u.getId());
		
		userStatistics.add(new StatisticsEntity(id.get(0),20L,30L,50L,40L,200L,Level.NEWBIE));
		userStatistics.add(new StatisticsEntity(id.get(1),345L,124L,57L,164L,6750L,Level.EXPERIENCED_MIDDLEBORW));
		userStatistics.add(new StatisticsEntity(id.get(2),410L,80L,120L,210L,602L,Level.BEGINNER));
		userStatistics.add(new StatisticsEntity(id.get(3),6820,4020,480,2320,86750,Level.CHUCK_NORRIS_OF_CHESS));
		userStatistics.add(new StatisticsEntity(id.get(4),1200,200,1000,700,10000,Level.ADVANCED));
		userStatistics.add(new StatisticsEntity(id.get(5),150,30,50,40,350,Level.WEAKLING));
		
	}
}
