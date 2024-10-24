package com.ibm.jumpstart.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Qualifier("second")
@Scope(value= "request" , proxyMode = ScopedProxyMode.TARGET_CLASS)

public class SecondService  implements Servable {

private static final Logger logger =    LoggerFactory.getLogger(SecondService.class);
	@Override
	public void showService() {
		logger.info("this is the second sevice get executed : "+ this);

	}

	@Override
	public String getService ( ) {
		return "Second Service is Called "; 
	}


}
