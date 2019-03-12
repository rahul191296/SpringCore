package com.cognizant.springbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bean2 {
	private Bean3 bean3;
	public Bean3 getBean3() {
		return bean3;
	}
@Autowired
	public void setBean3(Bean3 bean3) {
		this.bean3 = bean3;
	}

	public void xb4(){
		bean3.xb4();
	}



}