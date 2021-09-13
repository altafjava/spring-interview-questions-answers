package com.altafjava.bean;

import java.util.Set;

public class Team {
	private String teamName;
	private Set<String> players;

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setPlayers(Set<String> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", players=" + players + "]";
	}

}
