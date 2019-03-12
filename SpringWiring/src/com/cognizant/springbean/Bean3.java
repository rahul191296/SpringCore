package com.cognizant.springbean;

public class Bean3 {
private Bean4 bean4;

public Bean3(Bean4 bean4) {
	super();
	this.bean4 = bean4;
}
public void xBean3Method(){
	bean4.xBean4Method();
}
}
