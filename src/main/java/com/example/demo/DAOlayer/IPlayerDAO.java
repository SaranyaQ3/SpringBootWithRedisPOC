package com.example.demo.DAOlayer;

import java.util.Map;

import com.example.demo.models.player;

public interface IPlayerDAO {
	
	void save (player playerObj);
	
	player getPlayer(Integer playerId);
	
	void update(player playerObj);
	
	Map<Integer, player> getAll();
	
	void delete(Integer playerId);
	
	void saveAll(Map<Integer, player> map);
	
}
