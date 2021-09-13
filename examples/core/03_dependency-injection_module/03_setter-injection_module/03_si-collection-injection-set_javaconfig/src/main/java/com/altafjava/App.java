package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.altafjava.bean.Team;
import com.altafjava.config.AppConfig;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Team team = applicationContext.getBean(Team.class);
		System.out.println(team);
	}
}
