package com.altafjava.config;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.altafjava.bean.University;

@Configuration
public class AppConfig {

	@Bean
	public University university() {
		Map<String, String> colleges = new LinkedHashMap<>();
		colleges.put("8P", "AAR Mahaveer Engineering College");
		colleges.put("EK", "Abdul Kalam Institute of Technological Sciences");
		colleges.put("AG", "ACE Engineering College");
		University university = new University("JNTUH", colleges);
		return university;
	}
}
