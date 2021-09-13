package com.altafjava.bean;

import java.util.Map;

public class Country {
	private String name;
	private Map<String, String> cityWithZip;

	public Country(String name, Map<String, String> cityWithZip) {
		this.name = name;
		this.cityWithZip = cityWithZip;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", cityWithZip=" + cityWithZip + "]";
	}

}
