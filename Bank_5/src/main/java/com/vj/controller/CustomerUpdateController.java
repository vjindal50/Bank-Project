package com.vj.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vj.model.Customer;
import com.vj.service.CustomerService;
//import com.vj.service.EmployeeService;

@Controller
public class CustomerUpdateController {

	@Autowired
    private CustomerService customerService;
		
	@RequestMapping(value = "/updateCustProfile", method = RequestMethod.POST)
	public ModelAndView EmpUpdate(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In Login controller");		
		String submit = request.getParameter("submit");
		//Customer customer = new Customer();
		
		//String custid = request.getParameter("custId");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mname = request.getParameter("mname");
		String phone = request.getParameter("phone");
		String altphone= request.getParameter("altphone");
		String email= request.getParameter("email");
		String address= request.getParameter("address");
//		String dob = request.getParameter("dob");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
//		System.out.println(custid);
//		System.out.println(Integer.parseInt(custid));
		
		Customer customer = (Customer) request.getSession().getAttribute("cust");
		
		customer.setCustID(customer.getCustID());
//		System.out.println(Integer.parseInt(custid));
		
		customer.setAddress(address);
		if (altphone.equals("") || altphone == null) {
			customer.setAlternatePhone(" ");
		} else {
			customer.setAlternatePhone(altphone);
		}
		customer.setDOB(customer.getDOB());
		customer.setEmail(email);
		customer.setFirstName(fname);
		customer.setAcc(customer.getAcc());
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
		customer.setStatus(customer.getStatus());
		customer.setUserName(uname);
		System.out.println(customer);
		
	
		Customer customer2 = customerService.updateCustomer(customer);
		System.out.println(submit);
		System.out.println(customer2.getAcc());
		
		ModelAndView model = new ModelAndView();
		model.addObject("custname",customer2.getFirstName() + " " + customer2.getMiddleName() + " " + customer2.getLastName());
		model.addObject("custId",customer2.getCustID());
		model.addObject("LastLogin",customer2.getJoinDate());
		model.addObject("acclist", customer2.getAcc());
		model.addObject("caddress",customer2.getAddress());
		model.addObject("caltphone",customer2.getAlternatePhone());
		model.addObject("cdob",customer2.getDOB());
		model.addObject("cemail",customer2.getEmail());
		model.addObject("cfname",customer2.getFirstName());
		model.addObject("clname",customer2.getLastName());
		model.addObject("cmname",customer2.getMiddleName());
		model.addObject("cphone",customer2.getPhone());
		model.addObject("cuname",customer2.getUserName());
		model.addObject("cpass",customer2.getPassword());
		model.setViewName("customerhome");
		return model;
	
}
}
