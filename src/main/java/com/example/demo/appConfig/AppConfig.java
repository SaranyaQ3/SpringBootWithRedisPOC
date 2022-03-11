package com.example.demo.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.example.demo.models.player;

@Configuration
public class AppConfig {
	
	@Bean
	public RedisConnectionFactory redisConnectionFactory() {
		return new LettuceConnectionFactory();
	}
	
	@Bean
	public RedisTemplate<String, player> redisTemplate(){
		RedisTemplate<String, player> playerTemplate= new RedisTemplate<>();
		playerTemplate.setConnectionFactory(redisConnectionFactory());
		return playerTemplate;
	}
	

}
