package com.altafjava.bean;

import java.util.Properties;

public class Continent {
	private Properties continents;

	public Continent(Properties continents) {
		this.continents = continents;
	}

	@Override
	public String toString() {
		return "Continent [continents=" + continents + "]";
	}

}
