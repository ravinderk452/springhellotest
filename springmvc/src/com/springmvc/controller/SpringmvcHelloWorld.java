package com.springmvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class SpringmvcHelloWorld {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "Hello spring mvc framework";
		@SuppressWarnings("resource")
	      ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	      
	      GeometryExample1 geometryBean1=context.getBean("geometryExample1", GeometryExample1.class);
	      geometryBean1.drawShape();
		return new ModelAndView("welcome", "message", message);
		
	}
}