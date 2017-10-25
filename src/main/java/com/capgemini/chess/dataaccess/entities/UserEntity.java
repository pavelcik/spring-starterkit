package com.capgemini.chess.dataaccess.entities;

import com.capgemini.chess.enums.Level;

public class UserEntity {

	private String id;
	private String email;
	private String password;
	private String name;
	private String surname;
	private String about_me;
	private String life_motto;
	
	private long gamesPlayed;
	private long gamesWon;
	private long gamesLost;
	private long gamesDrown;
	private long points;
	private Level level;

	
	
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

	public UserEntity(String id, String email, String password, String name, String surname, String about_me,
			String life_motto) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.about_me = about_me;
		this.life_motto = life_motto;
	}

	public UserEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	@Override
	public String toString() {
		return "UserEntity [name=" + name + ", surname=" + surname + ", gamesPlayed=" + gamesPlayed + ", gamesWon="
				+ gamesWon + ", gamesLost=" + gamesLost + ", gamesDrown=" + gamesDrown + ", points=" + points
				+ ", level=" + level + "]";
	}

	public UserEntity(String id, String email, String password, String name, String surname, String about_me,
			String life_motto, long gamesPlayed, long gamesWon, long gamesLost,
			long gamesDrown, long points, Level level) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.gamesPlayed = gamesPlayed;
		this.gamesWon = gamesWon;
		this.gamesLost = gamesLost;
		this.gamesDrown = gamesDrown;
		this.points = points;
		this.level = level;
	}
	
	public UserEntity(long gamesPlayed, long gamesWon, long gamesLost,
			long gamesDrown, long points, Level level) {
		super();
		this.gamesPlayed = gamesPlayed;
		this.gamesWon = gamesWon;
		this.gamesLost = gamesLost;
		this.gamesDrown = gamesDrown;
		this.points = points;
		this.level = level;
	}

	public String getAbout_me() {
		return about_me;
	}

	public void setAbout_me(String about_me) {
		this.about_me = about_me;
	}

	public String getLife_motto() {
		return life_motto;
	}

	public void setLife_motto(String life_motto) {
		this.life_motto = life_motto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
