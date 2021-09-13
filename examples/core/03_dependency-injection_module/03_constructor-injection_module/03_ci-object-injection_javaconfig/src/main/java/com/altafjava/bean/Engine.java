package com.altafjava.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	private int engineId;
	private String engineName;

	public Engine(@Value(value = "234") int engineId, @Value("Toyota") String engineName) {
		this.engineId = engineId;
		this.engineName = engineName;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineName=" + engineName + "]";
	}

}
