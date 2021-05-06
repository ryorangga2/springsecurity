package com.kodehive.miniproacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.kodehive.miniproacademy.controller.api.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class MiniproacademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniproacademyApplication.class, args);
	}

}
