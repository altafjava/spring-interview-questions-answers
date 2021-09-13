package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.altafjava.bean.Employee;
import com.altafjava.config.AppConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = applicationContext.getBean(Employee.class);
		System.out.println(employee);
	}
}