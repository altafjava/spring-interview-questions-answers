package com.altafjava.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private String address;
	private float salary;

	public Employee(@Value("123") int id, @Value("Sam Altaf") String name, @Value(value = "Tokyo") String address, @Value(value = "9876.54") float salary) {
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
