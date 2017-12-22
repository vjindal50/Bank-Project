package com.vj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vj.model.Accounts;
import com.vj.model.Customer;
import com.vj.model.Employee;
import com.vj.service.CustomerService;

@Controller
public class CustInfoController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/getthiscust", method = RequestMethod.POST)
	public ModelAndView getCust(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView model = new ModelAndView();
		int custId = Integer.parseInt(request.getParameter("custid"));
		Customer c = customerService.getCustomer(custId);
		request.getSession().setAttribute("custemp", c);
		
		List<Accounts> list = c.getAcc();
		String res = "";
		if(list.size() > 0 ) {
			res += "<table><tr><th>Account Number</th><th>Balance</th></tr><br>\n";
			for(int i = 0 ; i < list.size() ; i++) {
				res += "<tr><td><form method=\"post\" action=\"fetchAccInfo\"><input type=\"Submit\" name=\"accId\" value=" +list.get(i).getAccountNumber()+"></form></td>";
				res += "<td>";
				
				System.out.println(list.get(i).getType());
				
				if (list.get(i).getType().equals("savings") && list.get(i).getAccSav().size() > 0) {
				 	res += list.get(i).getAccSav().get(0).getBalance();
				}
				
				if (list.get(i).getType().equals("checking") && list.get(i).getAccChk().size() > 0 ) {
					res += list.get(i).getAccChk().get(0).getBalance();
				} 
				
				if (list.get(i).getType().equals("loan") && list.get(i).getAccLoan().size() > 0 ) {
					res += list.get(i).getAccLoan().get(0).getBalance();
				}
				
				res +="</td></tr>";
			}
			res += "</table>";
			System.out.println(res);
		}	else {
			res = "No account associated with this user account";
		}	
		model.addObject("custname",c.getFirstName() + " " + c.getMiddleName() + " " + c.getLastName());
		model.addObject("custId",c.getCustID());
		model.addObject("LastLogin",c.getJoinDate());
		model.addObject("acclist", res);
		model.addObject("caddress",c.getAddress());
		model.addObject("caltphone",c.getAlternatePhone());
		model.addObject("cdob",c.getDOB());
		model.addObject("cemail",c.getEmail());
		model.addObject("cfname",c.getFirstName());
		model.addObject("clname",c.getLastName());
		model.addObject("cmname",c.getMiddleName());
		model.addObject("cphone",c.getPhone());
		model.addObject("cuname",c.getUserName());
		model.addObject("cpass",c.getPassword());
		
		String str = c.toString();
		str += "<div><center><br><br><button onclick=\"updateCustProfile()\">UPDATE PROFILE</button></center></div><br><br>";
	
		model.addObject("custlist", str);
		
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
