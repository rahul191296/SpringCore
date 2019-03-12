package com.cognizant.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springbean.Bean1;

public class ComponentDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
		 Bean1 bean1=(Bean1)ioc.getBean("bean1");
			bean1.x();
		 Bean1 bean2=(Bean1)ioc.getBean("bean1");
		 if(bean1==bean2){
			 System.out.println("bean1==bean2");
		 }
	
}
}
