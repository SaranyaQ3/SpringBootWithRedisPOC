package com.example.demo.DAOlayer;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.HashOperations;

import com.example.demo.models.player;


public class playerDAOimpl implements IPlayerDAO{
	
private final String hashReference="Player";
	
	@Resource(name="redisTemplate")
	private HashOperations<String, Integer, player> hashOperations;

	@Override
	public void save(player playerObj) {
		hashOperations.putIfAbsent(hashReference, playerObj.getPlayerId(), playerObj);
		
	}

	@Override
	public player getPlayer(Integer playerId) {
		return hashOperations.get(hashReference, playerId);
	}

	@Override
	public void update(player playerObj) {
		hashOperations.put(hashReference, playerObj.getPlayerId(), playerObj);
		
	}

	@Override
	public Map<Integer, player> getAll() {
		return hashOperations.entries(hashReference);
	}

	@Override
	public void delete(Integer playerId) {
		hashOperations.delete(hashReference,playerId);
		
	}

	@Override
	public void saveAll(Map<Integer, player> map) {
		hashOperations.putAll(hashReference, map);
		
	}
	
	

}
