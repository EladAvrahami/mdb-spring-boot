package com.mdbspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories//need to provide the packages where our repositories are located
@ComponentScan("com.mdbspringboot.*")
public class MdbSpringBootApplication {


	public static void main(String[] args) {
		SpringApplication.run(MdbSpringBootApplication.class, args);
		System.out.println("############start########");


	}

}
