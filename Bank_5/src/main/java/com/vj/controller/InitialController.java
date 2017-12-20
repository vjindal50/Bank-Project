package com.vj.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vj.model.AccountSavings;
import com.vj.model.Accounts;
import com.vj.model.Customer;
import com.vj.service.AccountsService;
import com.vj.service.CustomerService;
 
@Controller
public class InitialController {
	
    public InitialController() {
        System.out.println("CustomerController()");
    }
 
    @RequestMapping(value = "/")
    public ModelAndView listCustomer(ModelAndView model) throws IOException {
        
        model.setViewName("welcomPage");
        return model;
    }
    
    @Autowired
    private AccountsService accountService;
	
    @Autowired
    private CustomerService customerService;
	
	@RequestMapping(value = "/savingsaccount", method = RequestMethod.POST)
	public ModelAndView Login(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		System.out.println("in acc controller");
		
		Accounts account = new Accounts();
		Customer customer = new Customer();
		AccountSavings savings=new AccountSavings();
		
        System.out.println("In Accounts Controller");
        String submit = request.getParameter("submit");
        System.out.println("submit value "+submit);
		
			if(submit.equals("Savings_Account")) {
				account.setType("savings");
				
				System.out.println("type="+account.getType());
				String balance = request.getParameter("savingsbalance");
				
				customer = (Customer) request.getSession().getAttribute("cust");
					
				account.setCust_ID(customer.getCustID());
				account.setOpenedOn(new Date());
				account.setStatus("active");
	//			account.setType("Savings");
				accountService.openAccount(account);
				
				double Balance = Double.parseDouble(balance);
				double withdrawlimit = Balance*0.1;
				System.out.println(Balance + "   " + withdrawlimit);
				
				savings.setBalance(Balance);
//				savings.setInterest(5.00);
				savings.setWithdrawLimit(withdrawlimit);
				savings.setAccount_Number(account.getAccountNumber());
				
				accountService.openSavingsAccount(savings);
				
				ModelAndView model = new ModelAndView();
				model.addObject("adminMsg", "<h1>Your Savings Account No is " + account.getAccountNumber());
//				model.addObject("model", "Savings");
//				model.setViewName("customerhome");
				model.addObject("custname", customer.getFirstName() + " " + customer.getMiddleName() + " " + customer.getLastName());
				model.addObject("custId", customer.getCustID());
				model.addObject("LastLogin", customer.getJoinDate());
				model.addObject("caddress", customer.getAddress());
				model.addObject("caltphone", customer.getAlternatePhone());
				model.addObject("cdob", customer.getDOB());
				model.addObject("cemail", customer.getEmail());
				//model.addObject("eeid", customer.getEmpID());
				model.addObject("cfname", customer.getFirstName());
				model.addObject("clname", customer.getLastName());
				model.addObject("cmname", customer.getMiddleName());
				model.addObject("cphone", customer.getPhone());
				model.addObject("cuname", customer.getUserName());
				model.addObject("cpass", customer.getPassword());
				model.setViewName("customerhome");
					
				return model;
			}
			return new ModelAndView("error");
    }
	
}
