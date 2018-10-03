package com.blah.blue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootMybatisH2Application {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisH2Application.class, args);
	}
	
}
