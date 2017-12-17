package com.vj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

	@RequestMapping(value = "/homeme.html", method = RequestMethod.POST)
	public ModelAndView Login(HttpServletRequest request, HttpServletResponse response,ModelAndView model) {		
		System.out.println("In home page controller");		
		String submit = request.getParameter("submit");		
		System.out.println(submit);	
		
		model.addObject("model", submit);
		model.setViewName("LoginReg");
	    return model;
		
	} 
}
