package com.app.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class StudentLogger {

	
  @Before("execution(* com.app.service.StudentServiceImpl.*(..))")
  public void  getmethod(){
	  
	  System.out.println("AOP get method has called "); 
  
  }
  
/*  @Around("execution(* com.app.service.StudentService.*(..))")
public void  getmethod(JoinPoint p){
	  
	  System.out.println("AOP get method has called "+p.getArgs().getClass().getName()); 
  
  }*/
  
  
}
