package com.altafjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.altafjava.bean.Employee;

@Configuration
public class AppConfig {

	@Bean(name = "employee")
	public Employee createEmployee() {
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Sam Altaf");
		employee.setAddress("Tunisia");
		employee.setSalary(635474.74f);
		return employee;
	}
}
