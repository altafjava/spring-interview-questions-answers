package com.altafjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.altafjava.bean.Car;
import com.altafjava.bean.Engine;

@Configuration
public class AppConfig {

	@Bean
	public Engine engine() {
		return new Engine(456, "Cummins");
	}

	@Bean
	public Car car(Engine engine) {
		return new Car("Honda", "City", engine);
	}
}
