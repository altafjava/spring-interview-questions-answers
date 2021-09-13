package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.altafjava.bean.Car;

@ComponentScan
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
		Car car = applicationContext.getBean(Car.class);
		System.out.println(car);
	}
}
