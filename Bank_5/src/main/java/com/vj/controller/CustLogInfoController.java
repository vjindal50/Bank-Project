package com.vj.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vj.model.CustomerLog;
import com.vj.model.Employee;
import com.vj.service.CustomerService;

@Controller
public class CustLogInfoController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/custlogid", method = RequestMethod.POST)
	public ModelAndView GetCustLogInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		System.out.println("in cust log info controller");
		System.out.println(request.getParameter("custintlogidz"));
		
		ModelAndView model = new ModelAndView();
		
		int custLogId = Integer.parseInt(request.getParameter("custintlogidz"));
		System.out.println(custLogId);
		
		CustomerLog log = customerService.getCustomerLog(custLogId);
		model.addObject("custlist", log.toString());
		
		Employee employee = (Employee) request.getSession().getAttribute("emp");
		
		model.addObject("empname", employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName());
		model.addObject("empId", employee.getEmpID());
		model.addObject("LastLogin", employee.getJoinDate());
		model.addObject("eaddress", employee.getAddress());
		model.addObject("ealtphone", employee.getAlternatePhone());
		model.addObject("edob", employee.getDOB());
		model.addObject("eemail", employee.getEmail());
		model.addObject("eeid", employee.getEmpID());
		model.addObject("efname", employee.getFirstName());
		model.addObject("elname", employee.getLastName());
		model.addObject("emname", employee.getMiddleName());
		model.addObject("ephone", employee.getPhone());
		model.addObject("euname", employee.getUserName());
		model.addObject("epass", employee.getPassword());
		
		model.setViewName("home");
		
		return model;
	}

}
