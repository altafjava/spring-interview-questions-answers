package com.altafjava.bean;

public class Engine {
	private int engineId;
	private String engineName;

	public Engine(int engineId, String engineName) {
		this.engineId = engineId;
		this.engineName = engineName;
		System.out.println("---Engine constructor called---");
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineName=" + engineName + "]";
	}

}
