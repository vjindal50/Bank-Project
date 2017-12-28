package com.vj.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		String idstr = request.getParameter("ID1");
		String fname = request.getParameter("fname1");
		String lname = request.getParameter("lname1");
		String mname = request.getParameter("mname1");
		String phone = request.getParameter("phone1");
		String altphone= request.getParameter("altphone1");
		String email= request.getParameter("email1");
		String address= request.getParameter("address1");
		String uname = request.getParameter("uname1");
		
		Map<String, String> map = new HashMap<String, String>();
		
		if(fname != "" && fname != null) {
			map.put("fname", fname);
		}
		if(lname != "" && lname != null) {
			map.put("lname", lname);
		}
		if(mname != "" && mname != null) {
			map.put("mname", mname);
		}
		if(phone != "" && phone != null) {
			map.put("phone", phone);
		}
		if(altphone != "" && altphone != null) {
			map.put("altphone", altphone);
		}
		if(email != "" && email != null) {
			map.put("email", email);
		}
		if(address != "" && address != null) {
			map.put("address", address);
		}
		if(uname != "" && uname != null) {
			map.put("uname", uname);
		}
		if(idstr != "" && idstr != null) {
			map.put("idstr", idstr);
		}
		
		System.out.println("map is " + map);
		
		int flag = 0;
		
		ModelAndView model = new ModelAndView();
		
		
			List<Customer> list = customerService.getAllCustomer();
			List<Customer> temp = new ArrayList<Customer>();
			
			Set<String> set = map.keySet();
			
			for (int i = 0 ; i < list.size(); i++) {
				flag = 0;
					if(set.contains("fname")) {
						if(list.get(i).getFirstName().toLowerCase().equals(map.get("fname").toLowerCase())) {
							flag++;
						}
					}
					if(set.contains("lname")) {
						if(list.get(i).getLastName().toLowerCase().equals(map.get("lname").toLowerCase())) {
							flag++;
						}
					}
					if(set.contains("mname")) {
						if(list.get(i).getMiddleName().toLowerCase().equals(map.get("mname").toLowerCase())) {
							flag++;
						}
					}
					if(set.contains("phone")) {
						if(list.get(i).getPhone().equals(map.get("phone"))) {
							flag++;
						}
					}
					if(set.contains("altphone")) {
						if(list.get(i).getAlternatePhone().equals(map.get("altphone"))) {
							flag++;
						}
					}
					if(set.contains("email")) {
						if(list.get(i).getEmail().toLowerCase().equals(map.get("email").toLowerCase())) {
							flag++;
						}
					}
					if(set.contains("address")) {
						if(list.get(i).getAddress().toLowerCase().equals(map.get("address").toLowerCase())) {
							flag++;
						}
					}
					if(set.contains("uname")) {
						if(list.get(i).getUserName().toLowerCase().equals(map.get("uname").toLowerCase())) {
							flag++;
						}
					}
					if(set.contains("idstr")) {
						if (list.get(i).getCustID() == Integer.parseInt(map.get("idstr"))) {
							flag++;
						}
					}
					
					if(flag == set.size()) {
						temp.add(list.get(i));
					}
					
			}
			
			list = temp;		
			
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


