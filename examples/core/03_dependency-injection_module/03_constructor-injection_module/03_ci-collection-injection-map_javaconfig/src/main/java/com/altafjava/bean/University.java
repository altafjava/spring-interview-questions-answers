package com.altafjava.bean;

import java.util.Map;

public class University {
	private String name;
	private Map<String, String> colleges;

	public University(String name, Map<String, String> colleges) {
		this.name = name;
		this.colleges = colleges;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", colleges=" + colleges + "]";
	}

}
