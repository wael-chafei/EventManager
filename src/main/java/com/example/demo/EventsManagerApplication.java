package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventsManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventsManagerApplication.class, args);
		System.out.println("Server is running ...") ; 
	}

}
