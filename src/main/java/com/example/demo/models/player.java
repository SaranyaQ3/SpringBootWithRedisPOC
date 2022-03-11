package com.example.demo.models;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Player")
public class player implements Serializable {
	
	private Integer playerId;
	private String playerName;
	private String gender;
	private String game;
	
	public player(Integer playerId, String playerName, String gender, String game) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.gender = gender;
		this.game = game;
	}

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}	
	
}
