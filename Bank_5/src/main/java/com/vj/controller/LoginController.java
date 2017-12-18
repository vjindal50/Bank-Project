package com.vj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.servlet.ModelAndView;

import com.vj.model.Employee;
import com.vj.service.CustomerService;
import com.vj.service.EmployeeService;



@Controller
public class LoginController {
	
	@Autowired
    private CustomerService customerService;
	
	@Autowired
    private EmployeeService employeeService;
		
	@RequestMapping(value = "/logininto", method = RequestMethod.POST)
	public ModelAndView Login(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In Login controller");		
		String submit = request.getParameter("submit");
		
		if(submit.equals("Login_Customer")) {
			request.setAttribute("type", "customer");
			String uname = request.getParameter("uname");
			String pass = request.getParameter("pass");
			if (customerService.login(uname, pass) != null) {
				return new ModelAndView("home", "model", customerService.login(uname, pass));
			} else {
				return new ModelAndView("home", "model", "no customer found");
			}
		}
		
		if(submit.equals("Login_Employee")) {
			request.setAttribute("type", "employee");
			String uname = request.getParameter("uname");
			String pass = request.getParameter("pass");
			Employee employee = new Employee();
			employee = employeeService.login(uname, pass);
			if (employee != null) {
				ModelAndView model = new ModelAndView();
				model.addObject("empname", employee.getFirstName() + " " + employee.getMiddleName() + " " + employee.getLastName());
				model.addObject("empId", employee.getEmpID());
				model.addObject("LastLogin", employee.getJoinDate());
				model.setViewName("home");
				return model;
			} else {
				return new ModelAndView("home", "model", "no employee found");
			}
		}
		
		if(submit.equals("Login_Admin")) {
			request.setAttribute("type", "admin");
			String uname = request.getParameter("uname");
			String pass = request.getParameter("pass");
			if (uname.equals("vj") && pass.equals("137115")) {
				return new ModelAndView("home", "model", "admin is here");
			} else {
				return new ModelAndView("home", "model", "no admin found");
			}
		}
		
		System.out.println(submit);	
	    return new ModelAndView("error");
		
	} 

}
