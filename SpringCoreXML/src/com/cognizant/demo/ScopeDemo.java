package com.cognizant.demo;
import com.cognizant.springbean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemo {
	public static void main(String[] args){
	// by default IOC container implements singleton and factory design method
		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
    Bean ref1=(Bean)ioc.getBean("bean1");
    Bean ref2=(Bean)ioc.getBean("bean1");
    if(ref1==ref2){
    	System.out.println(" default");
    }
    Bean2 bean2ref1=(Bean2)ioc.getBean("bean2");
    Bean2 bean2ref2=(Bean2)ioc.getBean("bean2");
    if(bean2ref1!=bean2ref2){
    	System.out.println(" prototype");
    }
}
}
