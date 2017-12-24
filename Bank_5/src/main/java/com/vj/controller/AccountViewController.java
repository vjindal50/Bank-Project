package com.vj.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vj.model.Accounts;
import com.vj.model.Customer;
import com.vj.model.CustomerLog;
import com.vj.model.Employee;
import com.vj.service.AccountsService;
import com.vj.service.CustomerService;

//New Controller


@Controller
public class AccountViewController {

	@Autowired
    private AccountsService accountService;
	
    @Autowired
    private CustomerService customerService;
    
//	@RequestMapping(value = "/viewAccounts", method = RequestMethod.POST)
//	public ModelAndView AccDelete(HttpServletRequest request, HttpServletResponse response) {		
//		System.out.println("In Accounts Delete controller");	
//		
//		Accounts account = new Accounts();
//		Customer customer = new Customer();
//		String submit = request.getParameter("submit");
//		System.out.println(submit);	
//		String res = "";
//		if(submit.equals("View Accounts"))
//		{
//			customer =	(Customer) request.getSession().getAttribute("cust");
//		List<Accounts> list = customer.getAcc();
//		System.out.println(list);
//		
//		if(list.size() > 0 ) {
//			res += "<table><tr><th>Account Number</th><th>Balance</th></tr><br>\n";
//			for(int i = 0 ; i < list.size() ; i++) {
//				res += "<tr><td><form method=\"post\" action=\"fetchAccInfo\"><input type=\"Submit\" name=\"accId\" value=" +list.get(i).getAccountNumber()+"></form></td>";
//				res += "<td>";
//				
//				System.out.println(list.get(i).getType());
//				
//				if (list.get(i).getType().equals("savings") && list.get(i).getAccSav().size() > 0) {
//				 	res += list.get(i).getAccSav().get(0).getBalance();
//				}
//				
//				if (list.get(i).getType().equals("checking") && list.get(i).getAccChk().size() > 0 ) {
//					res += list.get(i).getAccChk().get(0).getBalance();
//				} 
//				
//				if (list.get(i).getType().equals("loan") && list.get(i).getAccLoan().size() > 0 ) {
//					res += list.get(i).getAccLoan().get(0).getBalance();
//				}
//				
//				res +="</td></tr>";
//			}
//			res += "</table>";
//			System.out.println(res);
//		}	
//		
//		}
//		ModelAndView model = new ModelAndView();
//		model.addObject("acclist", res);
////		model.addObject("accNo", account.getAccountNumber());
////		model.addObject("acccustId", account.getCust_ID());
////		model.addObject("accopenDate", account.getOpenedOn());
////		model.addObject("accstatus", account.getStatus());
////		model.addObject("acctype", account.getType());
//		model.setViewName("customerhome");
//		
//		return model;
//	
//}
	

	
//	@RequestMapping(value = "/fetchAccInfo", method = RequestMethod.POST)
//	public ModelAndView AccountInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
//		
////		Accounts account = new Accounts();
//		Customer customer = new Customer();
//		
//		System.out.println("in accounts controller");
//		int accountId = Integer.parseInt(request.getParameter("accId"));
//		System.out.println(accountId);
//		
//		ModelAndView model = new ModelAndView();
//		
//		Accounts account  = accountService.getAccount(accountId);
//		model.addObject("acclist", account.toString());
//		model.setViewName("customerhome");
//
//		
//		return model;
//	}	

	
}
