package com.cognizant.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyDemo {
	public static void main(String[] args){
		// by default IOC container implements singleton and factory design method
			AbstractApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
            ioc.registerShutdownHook();
}
}
