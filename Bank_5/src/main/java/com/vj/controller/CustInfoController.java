package com.vj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustInfoController {
	
	public ModelAndView getCust(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView model = new ModelAndView();
		return model;
	}

}
