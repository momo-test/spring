package com.ibm.jumpstart.springcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ibm.jumpstart.api.Controller;

@ComponentScan("com.ibm.jumpstart.api")
@SpringBootApplication
public class SpringcourseApplication {

	public static Controller controller;

	public static void main(String[] args) {
	
	 SpringApplication.run(SpringcourseApplication.class, args);	
	
	
	
	}

}
