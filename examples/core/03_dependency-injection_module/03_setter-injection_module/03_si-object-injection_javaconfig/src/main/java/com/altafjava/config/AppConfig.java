package com.altafjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.altafjava.bean.Car;
import com.altafjava.bean.Engine;

@Configuration
public class AppConfig {

	@Bean
	public Engine engine() {
		Engine engine = new Engine();
		engine.setEngineId(456);
		engine.setEngineName("Cummins");
		return engine;
	}

	@Bean
	public Car car(Engine engine) {
		Car car = new Car();
		car.setBrand("Honda");
		car.setModel("city");
		car.setEngine(engine);
		return car;
	}
}
