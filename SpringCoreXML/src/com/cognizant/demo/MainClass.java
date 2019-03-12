package com.cognizant.demo;




import com.cognizant.springbean.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass{
	public static void main(String args[]){
		// independent from bean class
		Resource resource=new ClassPathResource("applicationContext.xml");
		// BeanFactory is pure IOC container
		BeanFactory ioc1=new XmlBeanFactory(resource);
		Bean bean1=(Bean)ioc1.getBean("bean1");
		bean1.x();
		// ApplicationContext is IOc container which is superset of beanfactory 
		// provides services like validation ,email
		ApplicationContext ioc2=new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Bean bean2=(Bean)ioc2.getBean("bean1");  
		bean2.x();
		// outside
	ApplicationContext ioc3=
		new FileSystemXmlApplicationContext("c:\\applicationContext\\applicationContext.xml");
		Bean bean3=(Bean)ioc3.getBean("bean1");
		bean3.x(); 
	}

}
