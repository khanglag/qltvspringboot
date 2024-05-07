package com.example.qltvspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// @SpringBootApplication(scanBasePackages = {"com.example.qltvspringboot.repository"})
@SpringBootApplication
// @ComponentScan(basePackages = {"com.example.qltvspringboot.repository"})
public class QltvspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(QltvspringbootApplication.class, args);
	}

}