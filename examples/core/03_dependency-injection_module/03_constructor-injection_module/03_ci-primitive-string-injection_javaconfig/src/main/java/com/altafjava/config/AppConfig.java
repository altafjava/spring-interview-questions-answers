package com.altafjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.altafjava.bean.Employee;

@Configuration
public class AppConfig {

	@Bean(name = "employee")
	public Employee createEmployee() {
		return new Employee(123, "Kais Saied", "Tunisia", 444849.33f);
	}
}
