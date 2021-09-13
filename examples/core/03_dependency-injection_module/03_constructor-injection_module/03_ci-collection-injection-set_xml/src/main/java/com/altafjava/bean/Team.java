package com.altafjava.bean;

import java.util.Set;

public class Team {
	private String teamName;
	private Set<String> players;

	public Team(String teamName, Set<String> players) {
		this.teamName = teamName;
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", players=" + players + "]";
	}

}
