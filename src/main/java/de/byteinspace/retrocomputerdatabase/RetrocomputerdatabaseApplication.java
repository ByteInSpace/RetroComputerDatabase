package de.byteinspace.retrocomputerdatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class})
@EnableScheduling
public class RetrocomputerdatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetrocomputerdatabaseApplication.class, args);
	}
	
	@Bean
	public StartupRunner scheduleRunner() {
		return new StartupRunner();
	}



}
