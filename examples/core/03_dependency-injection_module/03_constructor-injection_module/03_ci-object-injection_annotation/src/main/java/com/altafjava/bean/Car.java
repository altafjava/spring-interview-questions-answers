package com.altafjava.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private String brand;
	private String model;
	private Engine engine;

	public Car(@Value("Maruti Suzuki") String brand, @Value(value = "Dzire") String model, @Autowired Engine engine) {
		this.brand = brand;
		this.model = model;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", engine=" + engine + "]";
	}

}
