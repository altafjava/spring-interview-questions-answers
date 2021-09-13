package com.altafjava.bean;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private String brand;
	private String model;
	private Engine engine;

	public Car(String brand, String model, Engine engine) {
		this.brand = brand;
		this.model = model;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", engine=" + engine + "]";
	}

}
