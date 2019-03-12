package com.cognizant.demo;
import com.cognizant.springbean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class LoginDemo {
	public static void main(String[] args){
		// by default IOC container implements singleton and factory design method
			ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");

}
}
