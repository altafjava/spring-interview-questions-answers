package com.altafjava.bean;

public class Engine {
	private int engineId;
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
