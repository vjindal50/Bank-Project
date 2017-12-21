package com.vj.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vj.model.Customer;
import com.vj.model.Employee;
import com.vj.service.CustomerService;
import com.vj.service.EmployeeService;



@Controller
public class RegistrationController {
	
	@Autowired
    private CustomerService customerService;
	
	@Autowired
    private EmployeeService employeeService;
		
	@RequestMapping(value = "/registerCustomer", method = RequestMethod.POST)
	public ModelAndView RegCust(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In customer register controller");		
		
			
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String mname = request.getParameter("mname");
			String phone = request.getParameter("phone");
			String altphone= request.getParameter("altphone");
			String email= request.getParameter("email");
			String address= request.getParameter("address");
			String dob = request.getParameter("dob");
			String uname = request.getParameter("uname");
			String pass = request.getParameter("pass");
			
			Customer customer = new Customer();
		
			customer.setAddress(address);
			if (altphone.equals("") || altphone == null) {
				customer.setAlternatePhone(" ");
			} else {
				customer.setAlternatePhone(altphone);
			}
			customer.setDOB(dob);
			customer.setEmail(email);
			customer.setFirstName(fname);
			customer.setJoinDate(new Date() + "");
			if (lname.equals("") || lname == null) {
				customer.setLastName(" ");
			} else {
				customer.setLastName(lname);
			}
			if (lname.equals("") || lname == null) {
				customer.setMiddleName(" ");
			} else {
				customer.setMiddleName(mname);
			}
			customer.setPassword(pass);
			customer.setPhone(phone);
			customer.setStatus("active");
			customer.setUserName(uname);
			
			customerService.addCustomer(customer);
			
			ModelAndView model = new ModelAndView();

			model.addObject("model", "Your Id is " + customer.getCustID() + ". Please login");
			model.setViewName("customerLogin");
			
			return model;
		
	} 
	
	@RequestMapping(value = "/registerEmployee", method = RequestMethod.POST)
	public ModelAndView RegEmp(HttpServletRequest request, HttpServletResponse response) {
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mname = request.getParameter("mname");
		String phone = request.getParameter("phone");
		String altphone= request.getParameter("altphone");
		String email= request.getParameter("email");
		String address= request.getParameter("address");
		String dob = request.getParameter("dob");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		Employee employee = new Employee();		
		employee.setAddress(address);
		if (altphone.equals("") || altphone == null) {
			employee.setAlternatePhone(" ");
		} else {
			employee.setAlternatePhone(altphone);
		}
		employee.setDOB(dob);
		employee.setEmail(email);
		employee.setFirstName(fname);
		employee.setJoinDate(new Date()+"");
		if (lname.equals("") || lname == null) {
			employee.setLastName(" ");
		} else {
			employee.setLastName(lname);
		}
		if (lname.equals("") || lname == null) {
			employee.setMiddleName(" ");
		} else {
			employee.setMiddleName(mname);
		}
		employee.setPassword(pass);
		employee.setPhone(phone);
		employee.setStatus("current");
		employee.setUserName(uname);
		
		employeeService.addEmployee(employee);		
		System.out.println(employee);
		
		ModelAndView model = new ModelAndView();
		model.addObject("model", "Your Id is " + employee.getEmpID() + ". Please login");
		model.setViewName("employeeLogin");
		
		return model;
		
	}

}
