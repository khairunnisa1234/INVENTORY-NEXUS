package com.ts.nexux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackages ="com.dao")
@EntityScan(basePackages="com.model")
@SpringBootApplication(scanBasePackages ="com")
@ComponentScan(basePackages = {"com.controller", "dao"})
@EnableJpaRepositories(basePackages = "dao")

public class NexuxApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexuxApplication.class, args);
	}

}
