package com.cognizant.springbean;

public class Bean1 {
	private Bean2 bean2;
	public Bean1(Bean2 bean2){
		super();
		this.bean2=bean2;
	}
	public void xBean1Method(){
		bean2.xBean2Method();
	}

}
