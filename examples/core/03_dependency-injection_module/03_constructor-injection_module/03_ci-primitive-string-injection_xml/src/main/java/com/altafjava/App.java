package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.altafjava.bean.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println(employee);
	}
}