package com.vj.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vj.model.Customer;
import com.vj.model.Employee;
import com.vj.service.CustomerService;

@Controller
public class CustSearchController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/searchCust", method = RequestMethod.POST)
	public ModelAndView EmpUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String fname = request.getParameter("fname1");
		String lname = request.getParameter("lname1");
		String mname = request.getParameter("mname1");
		String phone = request.getParameter("phone1");
		String altphone= request.getParameter("altphone1");
		String email= request.getParameter("email1");
		String address= request.getParameter("address1");
		String uname = request.getParameter("uname1");

		
		ModelAndView model = new ModelAndView();
		
		
			List<Customer> list = customerService.getAllCustomer();

			List<Customer> temp = list;

			if (fname != "" && fname != null) {
				for(int i = 0 ; i < list.size(); i++) {
					if(!list.get(i).getFirstName().equals(fname)) {
						System.out.print(list.get(i).getFirstName() + " ");
						System.out.println(!list.get(i).equals(fname));
						temp.remove(i);
					}
				}
			}
	
			list = temp;
		
			if(lname != "" && lname != null) {
				for(int i = 0 ; i < list.size(); i++) {
					if(!list.get(i).getLastName().equals(lname)) {
						temp.remove(i);
					}
				}
			}
			list = temp;
	//		System.out.println(list.size());
	//		
			if(mname != "" && mname != null) {
				for(int i = 0 ; i < list.size(); i++) {	
					if(!list.get(i).getMiddleName().equals(mname)) {
						temp.remove(i);
					}
				}
			}
			list = temp;
			System.out.println(list.size());
	//		
			if(phone != "" && phone != null) {
				for(int i = 0 ; i < list.size(); i++) {
					if(!list.get(i).getPhone().equals(phone)) {
						temp.remove(i);
					}
				}
			}
			list = temp;
	//		System.out.println(list.size());
	//		
			if(altphone != "" && altphone != null) {
				for(int i = 0 ; i < list.size(); i++) {			
					if(!list.get(i).getAlternatePhone().equals(altphone)) {
						temp.remove(i);
					}
				}
			}
			list = temp;
	//		System.out.println(list.size());
	//		
			if(email != "" && email != null) {
				for(int i = 0 ; i < list.size(); i++) {			
					if(!list.get(i).getEmail().equals(email)) {
						temp.remove(i);
					}
				}
			}
			list = temp;
	//		System.out.println(list.size());
	//		
			if(address != "" && address != null) {
				for(int i = 0 ; i < list.size(); i++) {			
					if(!list.get(i).getAddress().equals(address)) {
						list.remove(i);
					}
				}
			}
			list = temp;
	//		System.out.println(list.size());
	//		
			if(uname != "" && uname != null) {
				for(int i = 0 ; i < list.size(); i++) {			
					if(!list.get(i).getUserName().equals(uname)) {
						list.remove(i);
					}
				}
			}
			list = temp;
	//		System.out.println(list.size());
			
			if (list.size() > 0) {
				String result = "<table>";
				result +="<tr>\n" + 
						"		<th>CustId\n</th>\n" + 
						"		<th>F.Name</th>\n" + 
						"		<th>M.Name</th>\n" + 
						"		<th>L.Name</th>\n" + 
						"		<th>Email</th>\n" + 
						"	</tr>";
				for(int i = 0 ; i < list.size() ; i ++) {
					result += "<tr>";
					result += "<td><form method=\"post\" action=\"getthiscust\">\n" + 
							"	<input type=\"submit\" name=\"custid\" value=\""+ list.get(i).getCustID() +"\">" + 
							"</form></td>" + " <td>" + list.get(i).getFirstName() + "</td> <td>" + list.get(i).getMiddleName()
							 + "</td> <td>" + list.get(i).getLastName() + "</td> <td>" + list.get(i).getEmail() + "</td>";
					result += "</tr>";

				}
				model.addObject("custlist", result);
				
			}else {
				model.addObject("custlist", "No customer found");
			}

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


