package com.ibm.jumpstart.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

	@Autowired
	@Qualifier("second")

	private Servable servable ; 
	
	@GetMapping("/moin")
	public String sendResponse() {
    servable.showService() ; 
	
    System.out.println( "Request second bean");
    
    return "Moin";
	}

}
