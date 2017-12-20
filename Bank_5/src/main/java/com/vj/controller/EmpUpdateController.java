package com.vj.controller;

import java.text.DateFormat;
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

import com.vj.model.Employee;
import com.vj.service.EmployeeService;

@Controller
public class EmpUpdateController {
	
	@Autowired
    private EmployeeService employeeService;
		
	@RequestMapping(value = "/updateEmpProfile", method = RequestMethod.POST)
	public ModelAndView EmpUpdate(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In Login controller");		
		String submit = request.getParameter("submit");
		Employee employee = new Employee();
		
		String empid = request.getParameter("empid");
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
		
		employee.setEmpID(Integer.parseInt(empid));
		employee.setAddress(address);
		if (altphone.equals("") || altphone == null) {
			employee.setAlternatePhone(" ");
		} else {
			employee.setAlternatePhone(altphone);
		}
		employee.setDOB(employeeService.getEmployee(Integer.parseInt(empid)).getDOB());
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
		employee.setStatus("current");
		employee.setUserName(uname);
		
		Employee employee2 = employeeService.updateEmployee(employee);
		System.out.println(submit);
		
		ModelAndView model = new ModelAndView();
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
}
