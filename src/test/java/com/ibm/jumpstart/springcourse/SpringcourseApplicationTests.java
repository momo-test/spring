package com.ibm.jumpstart.springcourse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringcourseApplicationTests {

	@Autowired
	SpringcourseApplication springcourseApplication ;

	@Test
	void contextLoads() {
		
	assertEquals( springcourseApplication.getActiveProfile() , "dev"); 

	SpringcourseApplication.main(new String[]{"firstArg" , "secondArg", "fourthArg"});

	}

}
