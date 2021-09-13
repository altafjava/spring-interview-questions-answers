package com.altafjava.bean;

public class Customer {
	private String name;
	private String address;
	private int age;

	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

}
