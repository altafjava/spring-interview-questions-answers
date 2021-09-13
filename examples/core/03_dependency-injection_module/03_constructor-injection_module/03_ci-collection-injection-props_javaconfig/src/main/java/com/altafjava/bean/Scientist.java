package com.altafjava.bean;

import java.util.Properties;

public class Scientist {
	private Properties scientists;

	public Scientist(Properties scientists) {
		this.scientists = scientists;
	}

	@Override
	public String toString() {
		return "Scientist [scientists=" + scientists + "]";
	}

}
