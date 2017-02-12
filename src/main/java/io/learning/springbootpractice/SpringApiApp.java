package io.learning.springbootpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication   					//to mention this is spring boot application
public class SpringApiApp {
 
	public static void main(String[] args) {
		
		//start the servlet container and host the application
		
		SpringApplication.run(SpringApiApp.class, args);  //Static class which accepts two arguments- Main class which is mentioned as 
														  //Spring Boot Application and Command line arguments

	}

}
