package com.altafjava.bean;

import java.util.Map;

public class Country {
	private String name;
	private Map<String, String> cityWithZip;

	public void setName(String name) {
		this.name = name;
	}

	public void setCityWithZip(Map<String, String> cityWithZip) {
		this.cityWithZip = cityWithZip;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", cityWithZip=" + cityWithZip + "]";
	}

}
