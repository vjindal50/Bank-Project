package com.vj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {
		
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public ModelAndView Login(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In logout controller");		
		String submit = request.getParameter("submit");
		System.out.println(submit);	
	    return new ModelAndView("customerLogin","model","successfully logged out");
		
	} 

}
