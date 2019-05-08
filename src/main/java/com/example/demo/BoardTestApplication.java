package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value= {"com.example.demo.persistence"})
public class BoardTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardTestApplication.class, args);
	}

}
