package com.altafjava.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.altafjava.bean.Team;

@Configuration
public class AppConfig {

	@Bean
	public Team team() {
		List<String> players = new ArrayList<>();
		players.add("Ronaldo");
		players.add("Messi");
		players.add("Salah");
		String teamName = "Football Players";
		return new Team(teamName, players);
	}
}
