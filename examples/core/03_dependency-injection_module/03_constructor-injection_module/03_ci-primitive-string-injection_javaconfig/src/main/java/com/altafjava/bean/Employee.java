package com.altafjava.bean;

public class Employee {
	private int id;
	private String name;
	private String address;
	private float salary;

	public Employee(int id, String name, String address, float salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

}
