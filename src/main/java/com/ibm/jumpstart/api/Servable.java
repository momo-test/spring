package com.ibm.jumpstart.api;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value= "request" , proxyMode = ScopedProxyMode.TARGET_CLASS)
public interface Servable {

	public void showService () ; 
}
