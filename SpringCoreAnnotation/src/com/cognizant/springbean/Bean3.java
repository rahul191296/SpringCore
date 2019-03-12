package com.cognizant.springbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bean3 {
	private Bean4 bean4;
@Autowired
	public Bean3(Bean4 bean4) {
		super();
		this.bean4 = bean4;
	}
	public void xb4(){
		bean4.xb4();
	}

}
