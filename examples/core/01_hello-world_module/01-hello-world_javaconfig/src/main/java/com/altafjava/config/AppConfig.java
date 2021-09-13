package com.altafjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.altafjava.bean.GreetingService;
import com.altafjava.bean.impl.GreetingServiceImpl;
import com.altafjava.service.GreetingManager;

@Configuration
public class AppConfig {

	@Bean(name = "greetingService")
	public GreetingService buildGreetingServiceBean() {
		return new GreetingServiceImpl();
	}

	@Bean
	public GreetingManager buildGreetingManagerBean(GreetingService greetingService) {
		GreetingManager greetingManager = new GreetingManager();
		greetingManager.setGreetingService(greetingService);
		return greetingManager;
	}

}
