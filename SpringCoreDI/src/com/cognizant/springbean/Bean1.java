package com.cognizant.springbean;

public class Bean1 {
private int a;
private String b;
public Bean1(int a,String b){
	this.a=a;
	this.b=b;
}
public int getA(){
	return a;
}
public String getB(){
	return b;
}
public int sum(){
	return a+Integer.parseInt(b);
	
}
}
