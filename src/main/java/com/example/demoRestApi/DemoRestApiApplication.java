package com.example.demoRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class DemoRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApiApplication.class, args);
	}
}
