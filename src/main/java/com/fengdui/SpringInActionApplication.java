package com.fengdui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringInActionApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringInActionApplication.class, args);
		SpringApplication application = new SpringApplication();
		ConfigurableApplicationContext applicationContext = application.run(SpringInActionApplication.class, args);
	}
}
