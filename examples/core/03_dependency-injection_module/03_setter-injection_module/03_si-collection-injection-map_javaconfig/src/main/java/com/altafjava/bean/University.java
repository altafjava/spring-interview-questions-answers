package com.altafjava.bean;

import java.util.Map;

public class University {
	private String name;
	private Map<String, String> colleges;

	public void setName(String name) {
		this.name = name;
	}

	public void setColleges(Map<String, String> colleges) {
		this.colleges = colleges;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", colleges=" + colleges + "]";
	}

}
