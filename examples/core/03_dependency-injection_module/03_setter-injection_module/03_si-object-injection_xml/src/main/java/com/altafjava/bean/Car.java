package com.altafjava.bean;

public class Car {
	private String brand;
	private String model;
	private Engine engine;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", engine=" + engine + "]";
	}

}
