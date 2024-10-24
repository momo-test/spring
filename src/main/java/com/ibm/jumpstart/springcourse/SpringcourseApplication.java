package com.ibm.jumpstart.springcourse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.ibm.jumpstart.api.Controller;

import jakarta.annotation.PostConstruct;

@ComponentScan("com.ibm.jumpstart.api")
@SpringBootApplication
@PropertySource("classpath:dev.properties")

public class SpringcourseApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringcourseApplication.class); 
	
	@Value ("${module.type}")
	private  String activeModule ; 

	public static Controller controller;

	public static void main(String[] args) {
	
	for (String arg : args ){
	 logger.info("Argument sent to the main : {}" , arg);
	}
	 SpringApplication.run(SpringcourseApplication.class, args);	
	
	}
	@PostConstruct
	public void checkActiveProfile ( ){
		System.out.println("Active Module : " + activeModule);

	}
     public String getActiveProfile () {
		return activeModule ; 
	 }
}
