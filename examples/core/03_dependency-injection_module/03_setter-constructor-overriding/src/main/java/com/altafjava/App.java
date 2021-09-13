package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.altafjava.bean.Company;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Company company = applicationContext.getBean(Company.class);
		System.out.println(company);
	}
}
