/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ibm.jumpstart.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author mohamedayman
 */
@Aspect
@Configuration
public class SecurityAspect {

private  Logger logger = LoggerFactory.getLogger(this.getClass()) ; 


@Before(value ="execution(* com.ibm.jumpstart.api.FirstService.*(..))" )
public  void checkFunction (JoinPoint joinpoint ){

logger.info("function got invoked : {} ",  joinpoint) ;

}

}
