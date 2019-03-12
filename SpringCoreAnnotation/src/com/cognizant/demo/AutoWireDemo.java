package com.cognizant.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springbean.Bean2;



public class AutoWireDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		 Bean2 bean2=(Bean2)ioc.getBean("bean2");
		 bean2.xb4();
}
}
