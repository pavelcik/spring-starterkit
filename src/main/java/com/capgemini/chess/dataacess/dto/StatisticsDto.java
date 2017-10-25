package com.capgemini.chess.dataacess.dto;

import com.capgemini.chess.enums.Level;

public class StatisticsDto {
	private long gamesPlayed;
	private long gamesWon;
	private long gamesLost;
	private long gamesDrown;
	private long points;
	private Level level;
	
	
	
	
	
	public StatisticsDto() {
		super();
	}
	public StatisticsDto(long gamesPlayed, long gamesWon, long gamesLost, long gamesDrown, long points, Level level) {
		super();
		this.gamesPlayed = gamesPlayed;
		this.gamesWon = gamesWon;
		this.gamesLost = gamesLost;
		this.gamesDrown = gamesDrown;
		this.points = points;
		this.level = level;
	}
	public long getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(long gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	public long getGamesWon() {
		return gamesWon;
	}
	public void setGamesWon(long gamesWon) {
		this.gamesWon = gamesWon;
	}
	public long getGamesLost() {
		return gamesLost;
	}
	public void setGamesLost(long gamesLost) {
		this.gamesLost = gamesLost;
	}
	public long getGamesDrown() {
		return gamesDrown;
	}
	public void setGamesDrown(long gamesDrown) {
		this.gamesDrown = gamesDrown;
	}
	public long getPoints() {
		return points;
	}
	public void setPoints(long points) {
		this.points = points;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}

}
