package com.ibm.jumpstart.springcourse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.jumpstart.api.Controller;
import com.ibm.jumpstart.api.FirstService;

@SpringBootTest
class SpringcourseApplicationTests {

	private static Logger logger ; 
	@Autowired
	SpringcourseApplication springcourseApplication ;

	@Mock
	FirstService firstService ; 

	@InjectMocks 
	Controller controller ; 

	@BeforeAll
	static void intiallizing ( ) {
		
	logger = LoggerFactory.getLogger(SpringcourseApplicationTests.class) ; 
	logger.info("logger has been intiallized ! ");

	}

	@Test
	void testController () {

		when(firstService.getService()).thenReturn("No one is calling i ame sleeping function ! ") ; 
		assertEquals( controller.sendResponse(), "Moin"); 

	}

	@Test
	void contextLoads() {
	
	assertEquals( springcourseApplication.getActiveProfile() , "dev"); 

	SpringcourseApplication.main(new String[]{"firstArg" , "secondArg", "fourthArg"}) ;

	FirstService  firstServiceMock = mock(FirstService.class) ; 
	when(firstServiceMock.getService()).thenReturn("We have call nothing") ; 

	logger.info(firstServiceMock.getService());
	}

}
