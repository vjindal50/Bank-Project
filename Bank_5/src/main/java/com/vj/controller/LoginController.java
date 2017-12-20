package com.vj.controller;

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
			Customer customer=new Customer();
			customer=customerService.login(uname, pass);
			if (customer != null) {
				
				request.getSession().setAttribute("cust",customer);
				System.out.println(customer.getAcc());
				ModelAndView model = new ModelAndView();
				
				return custHome(model, customer);
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
				request.getSession().setAttribute("emp", employee);
				ModelAndView model = new ModelAndView();
				emptHome(model,employee);
			} else {
				return new ModelAndView("error", "model", "no employee found");
			}
		}
		
		if(submit.equals("Login_Admin")) {
			request.setAttribute("type", "admin");
			String uname = request.getParameter("uname");
			String pass = request.getParameter("pass");
			if (uname.equals("vj") && pass.equals("137115")) {
				return new ModelAndView("adminHome", "model", "admin is here");
			} else {
				return new ModelAndView("home", "model", "no admin found");
			}
		}
		
		System.out.println(submit);	
	    return new ModelAndView("error");
		
	} 
	
	@RequestMapping(value = "/updateCustProfile", method = RequestMethod.POST)
	public ModelAndView custUpdate(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In Login controller");		

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mname = request.getParameter("mname");
		String phone = request.getParameter("phone");
		String altphone= request.getParameter("altphone");
		String email= request.getParameter("email");
		String address= request.getParameter("address");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");

		Customer customer = (Customer) request.getSession().getAttribute("cust");
				
		customer.setAddress(address);
		if (altphone.equals("") || altphone == null) {
			customer.setAlternatePhone(" ");
		} else {
			customer.setAlternatePhone(altphone);
		}
		customer.setEmail(email);
		customer.setFirstName(fname);
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
		customer.setUserName(uname);
		
		ModelAndView model = new ModelAndView();
		
		return custHome(model, customerService.updateCustomer(customer));
	
	}
	
	@RequestMapping(value = "/updateEmpProfile", method = RequestMethod.POST)
	public ModelAndView EmpUpdate(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In Login controller");		

		Employee employee = (Employee) request.getSession().getAttribute("emp");
		

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mname = request.getParameter("mname");
		String phone = request.getParameter("phone");
		String altphone= request.getParameter("altphone");
		String email= request.getParameter("email");
		String address= request.getParameter("address");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		employee.setAddress(address);
		if (altphone.equals("") || altphone == null) {
			employee.setAlternatePhone(" ");
		} else {
			employee.setAlternatePhone(altphone);
		}
		employee.setEmail(email);
		employee.setFirstName(fname);
		employee.setJoinDate(new Date());
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
		employee.setUserName(uname);
		
		ModelAndView model = new ModelAndView();
		
		return emptHome(model,employeeService.updateEmployee(employee));
	}
	
	public ModelAndView emptHome(ModelAndView model, Employee employee2) {
		model.addObject("empname", employee2.getFirstName() + " " + employee2.getMiddleName() + " " + employee2.getLastName());
		model.addObject("empId", employee2.getEmpID());
		model.addObject("LastLogin", employee2.getJoinDate());
		model.addObject("eaddress", employee2.getAddress());
		model.addObject("ealtphone", employee2.getAlternatePhone());
		model.addObject("edob", employee2.getDOB());
		model.addObject("eemail", employee2.getEmail());
		model.addObject("eeid", employee2.getEmpID());
		model.addObject("efname", employee2.getFirstName());
		model.addObject("elname", employee2.getLastName());
		model.addObject("emname", employee2.getMiddleName());
		model.addObject("ephone", employee2.getPhone());
		model.addObject("euname", employee2.getUserName());
		model.addObject("epass", employee2.getPassword());
		model.setViewName("home");
		return model;
	}
	
	public ModelAndView custHome(ModelAndView model, Customer customer2) {
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
