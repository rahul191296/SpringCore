package com.cognizant.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cognizant.springbean.*;
public class FactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean5 bean5=(Bean5)ioc.getBean("bean5");
		bean5.z();
	}

}
