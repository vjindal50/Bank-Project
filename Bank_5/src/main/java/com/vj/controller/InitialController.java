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
import com.vj.model.AccountsChecking;
import com.vj.model.AccountsLoan;
import com.vj.model.Customer;
import com.vj.service.AccountsService;
import com.vj.service.CustomerService;
 
@Controller
public class InitialController {
	
	@Autowired
    private AccountsService accountService;
	
    @Autowired
    private CustomerService customerService;
	
    public InitialController() {
        System.out.println("CustomerController()");
    }
 
    @RequestMapping(value = "/")
    public ModelAndView listCustomer(ModelAndView model) throws IOException {
        
        model.setViewName("customerLogin");
        return model;
    }
    
    @RequestMapping(value = "/logoutEmployee", method = RequestMethod.POST)
	public ModelAndView LogoutEmployee(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In logout employee controller");	
		request.getSession().setAttribute("emp", null);
		String submit = request.getParameter("submit");
		System.out.println(submit);	
	    return new ModelAndView("employeeLogin","model","successfully logged out");
		
	}
	
	@RequestMapping(value = "/logoutCustomer", method = RequestMethod.POST)
	public ModelAndView LogoutCustomer(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In logout cutomer controller");	
		request.getSession().setAttribute("cust", null);
		String submit = request.getParameter("submit");
		System.out.println(submit);	
	    return new ModelAndView("customerLogin","model","successfully logged out");
		
	}
	
	
    
//	@RequestMapping(value = "/savingsaccount", method = RequestMethod.POST)
//	public ModelAndView Login(HttpServletRequest request, HttpServletResponse response) throws IOException 
//	{
//		System.out.println("in acc controller");
//		
//		Accounts account = new Accounts();
//		Customer customer = new Customer();
//		AccountSavings savings=new AccountSavings();
//		
//        System.out.println("In Accounts Controller");
//        String submit = request.getParameter("submit");
//        System.out.println("submit value "+submit);
//		
//			if(submit.equals("Savings_Account")) {
//				account.setType("savings");
//				
//				System.out.println("type="+account.getType());
//				String balance = request.getParameter("savingsbalance");
//				
//				customer = (Customer) request.getSession().getAttribute("cust");
//					
//				account.setCust_ID(customer.getCustID());
//				account.setOpenedOn(new Date()+"");
//				account.setStatus("active");
//				accountService.openAccount(account);
//				
//				double Balance = Double.parseDouble(balance);
//				double withdrawlimit = Balance * 0.01;
//				System.out.println(Balance + "   " + withdrawlimit);
//				
//				savings.setBalance(Balance);
//				savings.setInterest(5.00);
//				savings.setWithdrawLimit(withdrawlimit);
//				savings.setAccount_Number(account.getAccountNumber());
//				
//				accountService.openSavingsAccount(savings);
//				
//				ModelAndView model = new ModelAndView();
//				model.addObject("adminMsg", "<h1>Your Savings Account No is " + account.getAccountNumber());
//				model.addObject("custname", customer.getFirstName() + " " + customer.getMiddleName() + " " + customer.getLastName());
//				model.addObject("custId", customer.getCustID());
//				model.addObject("LastLogin", customer.getJoinDate());
//				model.addObject("caddress", customer.getAddress());
//				model.addObject("caltphone", customer.getAlternatePhone());
//				model.addObject("cdob", customer.getDOB());
//				model.addObject("acclist", customer.getAcc());
//				model.addObject("cemail", customer.getEmail());
//				model.addObject("cfname", customer.getFirstName());
//				model.addObject("clname", customer.getLastName());
//				model.addObject("cmname", customer.getMiddleName());
//				model.addObject("cphone", customer.getPhone());
//				model.addObject("cuname", customer.getUserName());
//				model.addObject("cpass", customer.getPassword());
//				model.setViewName("mycusthome");
//					
//				return model;
//			}
//			return new ModelAndView("error");
//    }
	
	
	@RequestMapping(value = "/addaccounts", method = RequestMethod.POST)
	public ModelAndView AddAccounts(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		System.out.println("in acc controller");
		
		Accounts account = new Accounts();
		Customer customer = new Customer();
		AccountSavings savings=new AccountSavings();
		AccountsChecking checking=new AccountsChecking();
		
        System.out.println("In Accounts Controller");
        String submit = request.getParameter("accounts");
        System.out.println("submit value of accounts "+submit);
		
			if(submit.equals("savings")) {
				account.setType("savings");
				
				System.out.println("type="+account.getType());
				String savingsbalance = request.getParameter("balance");
												
				customer = (Customer) request.getSession().getAttribute("cust");
					
				account.setCust_ID(customer.getCustID());
				account.setOpenedOn(new Date()+"");
				account.setStatus("active");
				accountService.openAccount(account);
				
				double Balance = Double.parseDouble(savingsbalance);
				double withdrawlimit = Balance * 0.01;
				System.out.println(Balance + "   " + withdrawlimit);
				
				savings.setBalance(Balance);
				
				
//				savings.setInterest(5.00);

				savings.setWithdrawLimit(withdrawlimit);
				savings.setAccount_Number(account.getAccountNumber());
				
				accountService.openSavingsAccount(savings);
				
				ModelAndView model = new ModelAndView();
				model.addObject("adminMsg", "<h1>Your Savings Account No is " + account.getAccountNumber());
				model.addObject("custname", customer.getFirstName() + " " + customer.getMiddleName() + " " + customer.getLastName());
				model.addObject("custId", customer.getCustID());
				model.addObject("LastLogin", customer.getJoinDate());
				model.addObject("caddress", customer.getAddress());
				model.addObject("caltphone", customer.getAlternatePhone());
				model.addObject("cdob", customer.getDOB());
				model.addObject("acclist", accountService.getAccount(savings.getAccount_Number()).toString());
				model.addObject("cemail", customer.getEmail());
				model.addObject("cfname", customer.getFirstName());
				model.addObject("clname", customer.getLastName());
				model.addObject("cmname", customer.getMiddleName());
				model.addObject("cphone", customer.getPhone());
				model.addObject("cuname", customer.getUserName());
				model.addObject("cpass", customer.getPassword());
				model.setViewName("mycusthome");
					
				return model;
			}
			
			if(submit.equals("Checking")) {
				account.setType("checking");
				
				System.out.println("type="+account.getType());
				String checkingsbalance = request.getParameter("balance");
				
				customer = (Customer) request.getSession().getAttribute("cust");
					
				account.setCust_ID(customer.getCustID());
				account.setOpenedOn(new Date()+"");
				account.setStatus("active");
				
				accountService.openAccount(account);
				
				double cBalance = Double.parseDouble(checkingsbalance);
				double overDraft = cBalance * 0.02;
				System.out.println(cBalance + "   " + overDraft);
				
				checking.setBalance(cBalance);
				//checking.setInterest(5.0);
				checking.setOverDraft(overDraft);
				checking.setLastAccess(new Date()+"");
				checking.setAccNumber(account.getAccountNumber());
				
				accountService.openCheckingAccount(checking);;
				
				ModelAndView model = new ModelAndView();
				model.addObject("adminMsg", "<h2>Account Created Successfully <br>Your Checking Account No is </h2>" + account.getAccountNumber());
//				model.addObject("model", "Savings");
//				model.setViewName("mycusthome");
				model.addObject("custname", customer.getFirstName() + " " + customer.getMiddleName() + " " + customer.getLastName());
				model.addObject("custId", customer.getCustID());
				model.addObject("LastLogin", customer.getJoinDate());
				model.addObject("caddress", customer.getAddress());
				model.addObject("caltphone", customer.getAlternatePhone());
				model.addObject("cdob", customer.getDOB());
				model.addObject("acclist", accountService.getAccount(checking.getAccNumber()).toString());
				model.addObject("cemail", customer.getEmail());
				//model.addObject("eeid", customer.getEmpID());
				model.addObject("cfname", customer.getFirstName());
				model.addObject("clname", customer.getLastName());
				model.addObject("cmname", customer.getMiddleName());
				model.addObject("cphone", customer.getPhone());
				model.addObject("cuname", customer.getUserName());
				model.addObject("cpass", customer.getPassword());
				model.setViewName("mycusthome");
					
				return model;
			}
		
			return new ModelAndView("error");
    }
		
	@RequestMapping(value = "/loanaccount", method = RequestMethod.POST)
	public ModelAndView LoanAccounts(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		Accounts account = new Accounts();
		Customer customer = new Customer();
		
		AccountsLoan loan=new AccountsLoan();
		
		account.setType("loan");
		
		System.out.println("type="+account.getType());
		String loanamt = request.getParameter("loanbalance");
		
		customer = (Customer) request.getSession().getAttribute("cust");
			
		account.setCust_ID(customer.getCustID());
		account.setOpenedOn(new Date()+"");
		account.setStatus("active");
		
		accountService.openAccount(account);
		
		double loanAmount = Double.parseDouble(loanamt);
		int loanemi = (int) (loanAmount /20);
		System.out.println(loanAmount+ "   " +loanemi);
		
		loan.setACC_NUM(account.getAccountNumber());
		loan.setBalance(loanAmount);
		loan.setEMI(loanemi);
		loan.setAmountPayed(0.0);
//		loan.setLastEMIPayed(new Date()+"");
//		loan.setInterest(5.0);
		loan.setEMIcounter(0);
					
		accountService.openLoanAccount(loan);;
		
		ModelAndView model = new ModelAndView();
		model.addObject("adminMsg", "<h1>Your loan Account No is " + account.getAccountNumber());
		
		
		AccountsLoan acc = accountService.getLoanAccount(loan.getACC_NUM());
		String str = acc.toString();

		model.addObject("accloanno", loan.getACC_NUM());
		model.addObject("emi",loan.getEMI());
		model.addObject("interest",loan.getInterest());
		
		
		model.addObject("custname", customer.getFirstName() + " " + customer.getMiddleName() + " " + customer.getLastName());
		model.addObject("custId", customer.getCustID());
		model.addObject("LastLogin", customer.getJoinDate());
		model.addObject("caddress", customer.getAddress());
		model.addObject("caltphone", customer.getAlternatePhone());
		model.addObject("cdob", customer.getDOB());
		model.addObject("acclist", accountService.getAccount(acc.getACC_NUM()).toString());
		model.addObject("cemail", customer.getEmail());
		model.addObject("cfname", customer.getFirstName());
		model.addObject("clname", customer.getLastName());
		model.addObject("cmname", customer.getMiddleName());
		model.addObject("cphone", customer.getPhone());
		model.addObject("cuname", customer.getUserName());
		model.addObject("cpass", customer.getPassword());
		model.setViewName("mycusthome");
			
		return model;
	
		
	}
	
}
