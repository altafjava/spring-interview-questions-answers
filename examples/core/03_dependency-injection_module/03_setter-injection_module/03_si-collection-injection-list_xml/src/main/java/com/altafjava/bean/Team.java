package com.altafjava.bean;

import java.util.List;

public class Team {
	private String teamName;
	private List<String> players;

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setPlayers(List<String> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", players=" + players + "]";
	}

}
