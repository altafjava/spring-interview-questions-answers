package com.altafjava.bean;

public class Customer {
	private String name;
	private int age;

	public Customer(int age, String name) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

}
