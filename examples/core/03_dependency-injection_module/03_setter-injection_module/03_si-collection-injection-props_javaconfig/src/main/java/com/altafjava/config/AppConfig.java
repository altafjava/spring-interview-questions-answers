package com.altafjava.config;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.altafjava.bean.Scientist;

@Configuration
public class AppConfig {

	@Bean
	public Scientist teacher() {
		Scientist scientist = new Scientist();
		Properties scientists = new Properties();
		scientists.setProperty("mathematician", "Al-Battani");
		scientists.setProperty("medicine", "Ibn Sina");
		scientists.setProperty("algoritm", "Muhammad ibn Musa Al-Khwarizmi");
		scientists.setProperty("astronomer", "Omar Khayyam");
		scientists.setProperty("chemistry", "Jabir Ibn Haiyan");
		scientist.setScientists(scientists);
		return scientist;
	}
}
