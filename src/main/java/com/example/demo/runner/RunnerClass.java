package com.example.demo.runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;

import com.example.demo.DAOlayer.IPlayerDAO;
import com.example.demo.models.player;

public class RunnerClass implements CommandLineRunner{
	
	private IPlayerDAO playerDAO;

	@Override
	public void run(String... args) throws Exception {
		playerDAO.save(new player(101,"Maria", "Female", "Volleyball"));
		
		playerDAO.saveAll(
				Map.of(101, new player(101, "Maria", "Female", "Badminton"),
					   102, new player(102, "Tom", "Male", "Volleyball"),
					   103, new player(103, "CR7", "Male", "Football"),
					   104, new player(104, "Smrithi", "Female", "Cricket")
				)
		);
		
		playerDAO.update(new player(102,"Tom Joseph","Male","Volleyball"));
		
		playerDAO.delete(101);
		playerDAO.getAll().forEach((t, u) -> System.out.println(t+" : "+u));		
		
		System.out.println("Details of Player 104: "+ playerDAO.getPlayer(104));
	}
	

}
