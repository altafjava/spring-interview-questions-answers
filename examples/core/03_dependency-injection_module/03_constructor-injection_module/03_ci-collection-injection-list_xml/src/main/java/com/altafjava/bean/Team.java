package com.altafjava.bean;

import java.util.List;

public class Team {
	private String teamName;
	private List<String> players;

	public Team(String teamName, List<String> players) {
		this.teamName = teamName;
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", players=" + players + "]";
	}

}
