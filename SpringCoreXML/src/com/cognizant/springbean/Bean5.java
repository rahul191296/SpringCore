package com.cognizant.springbean;

public class Bean5 {
	//custom method to create object of bean getBean() is a factory method
	public static Bean5 createInstance(){
		Bean5 bean5=new Bean5();
		return bean5;
	}
	public void z(){
		System.out.println("---Bean5 created----");
	}

}
