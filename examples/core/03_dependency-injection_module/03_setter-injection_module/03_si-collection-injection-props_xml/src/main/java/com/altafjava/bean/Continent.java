package com.altafjava.bean;

import java.util.Properties;

public class Continent {
	private Properties continents;

	public void setContinents(Properties continents) {
		this.continents = continents;
	}

	@Override
	public String toString() {
		return "Continent [continents=" + continents + "]";
	}

}
