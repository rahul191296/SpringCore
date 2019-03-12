package com.cognizant.springbean;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bean1 {
	public Bean1(){
		System.out.println("bean1 constructor");
	}
public void x(){
	System.out.println("---x--");
}
}
