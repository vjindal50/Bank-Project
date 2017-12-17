package com.vj.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.servlet.ModelAndView;

import com.vj.model.Customer;
import com.vj.service.CustomerService;
import com.vj.service.EmployeeService;



@Controller
public class RegistrationController {
	
	@Autowired
    private CustomerService customerService;
	
	@Autowired
    private EmployeeService employeeService;
		
	@RequestMapping(value = "/registerme", method = RequestMethod.POST)
	public ModelAndView Login(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In register controller");		
		String submit = request.getParameter("submit");
		
		if(submit.equals("Reg_Customer")) {
			request.setAttribute("type", "customer");
			
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
			
			Date Dob = null;
			try {
				Dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			customer.setAddress(address);
			if (altphone.equals("") || altphone == null) {
				customer.setAlternatePhone(" ");
			} else {
				customer.setAlternatePhone(altphone);
			}
			customer.setDOB(Dob);
			customer.setEmail(email);
			customer.setFirstName(fname);
			customer.setJoinDate(new Date());
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
			
			return new ModelAndView("home", "model", customer.toString() );
			
		}
//		
//		if(submit.equals("Login_Employee")) {
//			request.setAttribute("type", "employee");
//			String uname = request.getParameter("uname");
//			String pass = request.getParameter("pass");
//			if (customerService.login(uname, pass) != null) {
//				return new ModelAndView("home", "model", employeeService.login(uname, pass));
//			} else {
//				return new ModelAndView("home", "model", "no employee found");
//			}
//		}
		
		if(submit.equals("Reg_Admin")) {
			return new ModelAndView("LoginReg", "adminMsg", "<h1>Admin cannot register<h1>");
		}
		
		System.out.println(submit);	
	    return new ModelAndView("error");
		
	} 

}
