package com.mdbspringboot;

import com.mdbspringboot.bean.Student;
import com.mdbspringboot.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MdbSpringBootApplication {


	public static void main(String[] args) {
		SpringApplication.run(MdbSpringBootApplication.class, args);
		System.out.println("############start########");


	}



}
