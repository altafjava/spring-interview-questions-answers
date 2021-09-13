package com.altafjava.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private String brand;
	private String model;
	private Engine engine;

	@Value("Maruti Suzuki")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Value(value = "Dzire")
	public void setModel(String model) {
		this.model = model;
	}

	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", engine=" + engine + "]";
	}

}
