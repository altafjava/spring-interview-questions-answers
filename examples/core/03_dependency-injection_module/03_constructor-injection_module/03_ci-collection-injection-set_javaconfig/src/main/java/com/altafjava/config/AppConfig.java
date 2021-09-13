package com.altafjava.config;

import java.util.HashSet;
import java.util.Set;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.altafjava.bean.Team;

@Configuration
public class AppConfig {

	@Bean
	public Team team() {
		Set<String> players = new HashSet<>();
		players.add("Ronaldo");
		players.add("Messi");
		players.add("Salah");
		players.add("Messi");
		return new Team("Footbal Players", players);
	}
}
