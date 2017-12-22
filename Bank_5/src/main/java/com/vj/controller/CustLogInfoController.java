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

import com.vj.model.AccountLog;
import com.vj.model.CustomerLog;
import com.vj.model.Employee;
import com.vj.model.EmployeeLog;
import com.vj.service.AccountsService;
import com.vj.service.CustomerService;
import com.vj.service.EmployeeService;

@Controller
public class CustLogInfoController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	AccountsService accountService;
	
	@RequestMapping(value = "/custlogid", method = RequestMethod.POST)
	public ModelAndView GetCustLogInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		System.out.println("in cust log info controller");
		System.out.println(request.getParameter("custintlogidz"));
		
		ModelAndView model = new ModelAndView();
		
		int custLogId = Integer.parseInt(request.getParameter("custintlogidz"));
		System.out.println(custLogId);
		
		CustomerLog log = customerService.getCustomerLog(custLogId);
		String str = log.toString();
		str += "<br><br><div><center><form action=\"viewCustLog\" method=\"post\">\n" + 
				"  <input id=\"logout\" type=\"submit\" name=\"submit\" value=\"Back\"></form></center></div><br><br>";
		
		model.addObject("custlist", str);
		
		return empHome(request, model);
	}
	
	@RequestMapping(value = "/acclogid", method = RequestMethod.POST)
	public ModelAndView GetAccLogInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		System.out.println("in acc log info controller");
		System.out.println(request.getParameter("custintlogidz"));
		
		ModelAndView model = new ModelAndView();
		
		int accLogId = Integer.parseInt(request.getParameter("custintlogidz"));
		System.out.println(accLogId);
		
		AccountLog log = accountService.getAccLog(accLogId);
		String str = log.toString();
		str += "<br><br><div><center><form action=\"viewAccLog\" method=\"post\">\n" + 
				"  <input id=\"logout\" type=\"submit\" name=\"submit\" value=\"Back\"></form></center></div><br><br>";
		
		model.addObject("custlist", str);
		
		return empHome(request, model);
	}
	
	@RequestMapping(value = "/emplogid", method = RequestMethod.POST)
	public ModelAndView GetEmpLogInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		System.out.println("in emp log info controller");
		System.out.println(request.getParameter("emplogid"));
		
		ModelAndView model = new ModelAndView();
		
		int empLogId = Integer.parseInt(request.getParameter("emplogid"));
		System.out.println(empLogId);
		
		EmployeeLog log = employeeService.getEmployeeLog(empLogId);
		String str = log.toString();
		str += "<br><br><div><center><form action=\"viewEmpLog\" method=\"post\">\n" + 
				"  <input id=\"logout\" type=\"submit\" name=\"submit\" value=\"Back\"></form></center></div><br><br>";
		
		model.addObject("custlist", str);

		return empHome(request, model);
	}
	
	public ModelAndView empHome(HttpServletRequest request, ModelAndView model) {
		
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
		
		model.setViewName("employeeHome");
		
		return model;
		
	}

}
