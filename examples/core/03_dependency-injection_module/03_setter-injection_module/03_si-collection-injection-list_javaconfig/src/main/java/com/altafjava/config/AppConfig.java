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
		Team team = new Team();
		team.setTeamName("Football Players");
		List<String> players = new ArrayList<>();
		players.add("Ronaldo");
		players.add("Messi");
		players.add("Salah");
		team.setPlayers(players);
		return team;
	}
}
