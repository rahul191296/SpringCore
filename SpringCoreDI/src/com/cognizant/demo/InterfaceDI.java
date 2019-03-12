package com.cognizant.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springbean.Bean1;
import com.cognizant.springbean.Greeting;

public class InterfaceDI {
	public static void main(String[] args){
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
	    Greeting greeting=(Greeting)ioc.getBean("greeting");
	    System.out.println(greeting.sayHello("rahul"));
	}

}
