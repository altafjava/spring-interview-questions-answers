package com.altafjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import com.altafjava.bean.MyBean;

@Configuration
public class AppConfig {

	@Bean
	@Scope("singleton") /* Here @Scope annotation is not required because by default bean scope is singleton */
	public MyBean createMyBean() {
		return new MyBean();
	}

}
