package com.capgemini.chess.dataaccess.mappers;

import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.chess.dataaccess.entities.UserEntity;
import com.capgemini.chess.dataacess.dto.StatisticsDto;
import com.capgemini.chess.dataacess.dto.UserDto;
import com.capgemini.chess.enums.Level;
//
//protected long gamesPlayed;
//protected long gamesWon;
//protected long gamesLost;
//protected long gamesDrown;
//protected long points;
//protected Level level;


public class StatisticsMapper {

	public static StatisticsDto getStatisticsDtoFromUserEntity(UserEntity userEntity) {
		StatisticsDto statisticsdto = null;
		if(userEntity !=null) {
			statisticsdto = new StatisticsDto();
			statisticsdto.setGamesPlayed(userEntity.getGamesPlayed());
			statisticsdto.setGamesWon(userEntity.getGamesWon());
			statisticsdto.setGamesLost(userEntity.getGamesLost());
			statisticsdto.setGamesDrown(userEntity.getGamesDrown());
			statisticsdto.setPoints(userEntity.getPoints());
			statisticsdto.setLevel(userEntity.getLevel());
		}
		return statisticsdto;
			}
	
	public static UserEntity getUserEntityFromStatisticsDto(StatisticsDto statisticsdto) {
		UserEntity userEntity = null;
		if(statisticsdto !=null) {
			userEntity = new UserEntity();
			userEntity.setGamesPlayed(statisticsdto.getGamesPlayed());
			userEntity.setGamesWon(statisticsdto.getGamesWon());
			userEntity.setGamesLost(statisticsdto.getGamesLost());
			userEntity.setGamesDrown(statisticsdto.getGamesDrown());
			userEntity.setPoints(statisticsdto.getPoints());
			userEntity.setLevel(statisticsdto.getLevel());
		}
		return userEntity;
			}
	
	public static List<StatisticsDto> getUserDtoFromUserEntity(List<UserEntity> users) {
		return users.stream().map(u -> getStatisticsDtoFromUserEntity(u)).collect(Collectors.toList());
	}
}
