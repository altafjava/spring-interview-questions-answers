package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.altafjava.bean.Car;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Car car = applicationContext.getBean(Car.class);
		System.out.println(car);
	}
}
