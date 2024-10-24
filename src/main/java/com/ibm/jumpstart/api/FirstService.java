package com.ibm.jumpstart.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Qualifier("first")
@Scope(value= "request" , proxyMode = ScopedProxyMode.TARGET_CLASS)

public class FirstService implements Servable {

	
	private static final Logger logger = LoggerFactory.getLogger(FirstService.class);

	@Override
	public void showService() {
	logger.info("The first service function is got executed : "+ this);
	}
	
	public String getService ( ) {
		return "First Service is Called "; 
	}

	
}
