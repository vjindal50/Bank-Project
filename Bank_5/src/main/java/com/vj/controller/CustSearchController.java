package com.vj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vj.model.Customer;
import com.vj.service.CustomerService;

@Controller
public class CustSearchController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/searchCust", method = RequestMethod.POST)
	public ModelAndView EmpUpdate(HttpServletRequest request, HttpServletResponse response) {	
		ModelAndView model = new ModelAndView();
		List<Customer> list = customerService.getAllCustomer();
		model.setViewName("home");
		return model;
	}

}
