package com.vj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vj.service.CustomerService;
import com.vj.model.*;

@Controller
public class customerlogController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/viewCustLog", method = RequestMethod.POST)
	public ModelAndView getCustLog(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView();
		List<CustomerLog> list = customerService.getAllCustomerLog();
		
		if (list.size() > 0) {
			String result = "<table>";
			result +="<tr>\n" + 
					"		<th>Cust Log ID</th>\n" + 
					"		<th>Cust ID</th>\n" + 
					"		<th>Email</th>\n" + 
					"		<th>Command</th>\n" + 
					"		<th>F.Name</th>\n" + 
					"	</tr>";
			for(int i = 0 ; i < list.size() ; i ++) {
				System.out.println(list.get(i).getCustLogID());
				result += "<tr>";
				result += "<td><form method=\"post\" action=\"custlogid\">\n" + 
						"	<input type=\"submit\" name=\"custintlogidz\" value=\""+ list.get(i).getCustLogID() +"\">" + 
						"</form></td>" + " <td>" + list.get(i).getCustID() + "</td> <td>" + list.get(i).getEmail()
						 + "</td> <td>" + list.get(i).getCommand() + "</td> <td>" + list.get(i).getFirstName() + "</td>";
				result += "</tr>";
//				result+= "<form method='post' action='getthiscust'></form>";
			}
			model.addObject("custlist", result);
			
		}else {
			model.addObject("custlist", "No customer log found");
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
		model.setViewName("home");
		return model;
	}

}