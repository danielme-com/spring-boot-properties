package com.danielme.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:custom.properties")
@ConfigurationPropertiesScan
public class SpringBootPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPropertiesApplication.class, args);
	}

}
