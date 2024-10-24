package com.ibm.jumpstart.springcourse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringcourseApplicationTests {

	private static Logger logger ; 
	@Autowired
	SpringcourseApplication springcourseApplication ;

	@BeforeAll
	static void intiallizing ( ) {
		
	logger = LoggerFactory.getLogger(SpringcourseApplicationTests.class) ; 
	logger.info("logger has been intiallized ! ");

	}

	@Test
	void contextLoads() {
		
	assertEquals( springcourseApplication.getActiveProfile() , "dev"); 


	SpringcourseApplication.main(new String[]{"firstArg" , "secondArg", "fourthArg"}) ;

	}

}
