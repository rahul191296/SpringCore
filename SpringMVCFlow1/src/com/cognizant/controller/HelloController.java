package com.cognizant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="hello.htm",method=RequestMethod.GET)
	public ModelAndView sayHello(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("data","HelloWorld");
		mv.setViewName("/hello");
		return mv;
	}

}
