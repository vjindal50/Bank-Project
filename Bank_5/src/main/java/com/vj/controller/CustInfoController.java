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
import com.vj.service.AccountsService;
import com.vj.service.CustomerService;

@Controller
public class CustInfoController {
	
	@Autowired
	CustomerService customerService;
	
	
	@Autowired
	AccountsService accountService;
	
	
	@RequestMapping(value = "/getthiscust", method = RequestMethod.POST)
	public ModelAndView getCust(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView model = new ModelAndView();
		int custId = Integer.parseInt(request.getParameter("custid"));
		Customer c = customerService.getCustomer(custId);
		request.getSession().setAttribute("custemp", c);
	
		model = setCustValues(model, c);
		
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
	
	@RequestMapping(value = "/backtocustprof", method = RequestMethod.POST)
	public ModelAndView getCustonBack(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView model = new ModelAndView();
		
		Customer c = (Customer) request.getSession().getAttribute("custemp");
		
		model = setCustValues(model, c);
		
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

	
	
	@RequestMapping(value = "/viewAccounts", method = RequestMethod.POST)
	public ModelAndView AccDelete(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In Accounts Delete controller");	

		String submit = request.getParameter("submit");
		System.out.println(submit);	
		String res = "";
		Customer customer =	(Customer) request.getSession().getAttribute("cust");
		List<Accounts> list = customer.getAcc();
		System.out.println(list);
		ModelAndView model = new ModelAndView();
		
		if(list.size() > 0 ) {
			res += "<div><center><h2>List of Accounts</h2></center></div><br><table><tr><th>Account Number</th><th>Balance</th></tr><br>\n";
			for(int i = 0 ; i < list.size() ; i++) {
				res += "<tr><td><form method=\"post\" action=\"fetchAccInfo\"><input type=\"Submit\" name=\"accId\" value=" +
						list.get(i).getAccountNumber()+"></form></td>";
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
			model.addObject("acclist", res);
			
		}	else {
			model.addObject("acclist", "You have no accounts with us.");
		}
		
		model.addObject("acclist", res);
		
		model = setCustValues(model, customer);
		
		model.setViewName("customerHome");
		
		return model;
	
	}
	
	@RequestMapping(value = "/fetchAccInfo", method = RequestMethod.POST)
	public ModelAndView AccountInfo(HttpServletRequest request, HttpServletResponse response) {	
		
		Customer customer =	(Customer) request.getSession().getAttribute("cust");
		System.out.println("in accounts controller");
		int accountId = Integer.parseInt(request.getParameter("accId"));
		System.out.println(accountId);
		
		ModelAndView model = new ModelAndView();
		
		model = setCustValues(model, customer);
		
		Accounts account  = accountService.getAccount(accountId);
		
		request.getSession().setAttribute("acc", account);
		
		String str = "";
		str +="<div><center><h2>Account</h2></center></div>";
		str +="<div style=\"text-align: right\"><form action=\"viewAccounts\" method=\"post\">\n" + 
				"  <input id=\"logout\" type=\"submit\" name=\"submit\" value=\"Back\">\n" + 
				"  </form></div>";		
		str+= account.toString();		
		str +="<br><div><br><form method=\"post\" action=\"transaction\">&nbsp&nbsp&nbsp&nbsp<b>If you want to do any transaction, Please fill out the following</b><br><br>&nbsp&nbsp&nbsp     "
				+ "Enter Amount : <input class=\"getfield\" type=\"number\" name=\"amount\" value=\"Amount\">"
				+ "<br><br>&nbsp&nbsp&nbsp&nbspSelect Transaction Type : <select style=\"width: 100px;\" name=\"type\">\n" + 
				"  <option value=\"none\"></option>\n" + 
				"  <option value=\"Widthdraw\">Widthdraw</option>\n" + 
				"  <option value=\"Deposit\">Deposit</option>\n" + 	
				"</select>"
				+ "<br><br><center><input type=\"submit\" name=\"submit\" value=\"Submit\"></center>"
				+ "</fom><br><br><br></div>";
		
		model.addObject("acclist", str);
		model.setViewName("customerHome");

		
		return model;
	}
	
	public ModelAndView setCustValues(ModelAndView model, Customer c) {
		
		model.addObject("custname",c.getFirstName() + " " + c.getMiddleName() + " " + c.getLastName());
		model.addObject("custId",c.getCustID());
		model.addObject("LastLogin",c.getJoinDate());
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
		
		return model;
	}
}
