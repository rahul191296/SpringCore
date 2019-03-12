package com.cognizant.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springbean.Bean1;

public class ContructorDI {
	public static void main(String[] args){
	ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
    Bean1 bean1=(Bean1)ioc.getBean("bean1");
   System.out.println("sum"+bean1.sum());

}
}
