package com.altafjava.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private String address;
	private float salary;

	@Value("123")
	public void setId(int id) {
		this.id = id;
	}

	@Value("Sam Altaf")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "Tokyo")
	public void setAddress(String address) {
		this.address = address;
	}

	@Value(value = "9876.54")
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

}
