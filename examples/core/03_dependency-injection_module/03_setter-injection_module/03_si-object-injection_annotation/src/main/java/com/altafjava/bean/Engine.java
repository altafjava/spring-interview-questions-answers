package com.altafjava.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	@Value(value = "234")
	private int engineId;
	@Value("Toyota")
	private String engineName;

	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineName=" + engineName + "]";
	}

}
