package com.altafjava.bean;

public class Company {
	private String name;

	public void setName(String name) {
		this.name = name;
		System.out.println("setter");
	}

	public Company() {
		System.out.println("no arg constructor");
	}

	public Company(String name) {
		this.name = name;
		System.out.println("1 arg constructor");
	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}

}
