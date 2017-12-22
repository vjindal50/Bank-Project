package com.vj.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.servlet.ModelAndView;

import com.vj.model.AccountLog;
import com.vj.model.Accounts;
import com.vj.model.Customer;
import com.vj.model.CustomerLog;
import com.vj.model.Employee;
import com.vj.model.EmployeeLog;
import com.vj.service.AccountsService;
import com.vj.service.CustomerService;
import com.vj.service.EmployeeService;

@Controller
public class LoginController {
	
	@Autowired
    private CustomerService customerService;
	
	@Autowired
    private EmployeeService employeeService;
	
	@Autowired
    private AccountsService accountsService;
	
	@RequestMapping(value = "/loginCutomer", method = RequestMethod.POST)
	public ModelAndView customerLogin(HttpServletRequest request, HttpServletResponse response) {		
		
		System.out.println("In new Login controller");		
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		Customer customer=new Customer();
		customer=customerService.login(uname, pass);
		System.out.println("---------------------------------"+customer);
		if (customer != null) {
			
			request.getSession().setAttribute("cust",customer);
			ModelAndView model = new ModelAndView();		
			return custHome(model, customer);
				
		} else {
			return new ModelAndView("customerLogin", "model", "no customer found");
		}		
	} 
		
	@RequestMapping(value = "/loginEmployee", method = RequestMethod.POST)
	public ModelAndView employeeLogin(HttpServletRequest request, HttpServletResponse response) {		
		
		System.out.println("In new employee Login controller");		
			
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		Employee employee = new Employee();
		employee = employeeService.login(uname, pass);
		System.out.println("employee sis : " + employee);
		if (employee != null) {
			request.getSession().setAttribute("emp", employee);
			ModelAndView model = new ModelAndView();
			return emptHome(model,employee);
		} else {
			return new ModelAndView("employeeLogin", "model", "no employee found");
		}
		
	} 
	
	public ModelAndView employeeLogin(HttpServletRequest request, HttpServletResponse response, String uname, String pass) {		
			
			System.out.println("In new employee Login controller");		
				
			Employee employee = new Employee();
			employee = employeeService.login(uname, pass);
			System.out.println("employee sis : " + employee);
			if (employee != null) {
				request.getSession().setAttribute("emp", employee);
				ModelAndView model = new ModelAndView();
				return emptHome(model,employee);
			} else {
				return new ModelAndView("employeeLogin", "model", "no employee found");
			}
			
		} 
	
	@RequestMapping(value = "/goemphome", method = RequestMethod.POST)
	public ModelAndView employeeHomeRedt(HttpServletRequest request, HttpServletResponse response) {
		Employee e  = (Employee) request.getSession().getAttribute("emp");
	
		return employeeLogin(request,response,e.getUserName(),e.getPassword());
	}
	
	@RequestMapping(value = "/updateCustProfile", method = RequestMethod.POST)
	public ModelAndView custUpdate(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In Login controller");		

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mname = request.getParameter("mname");
		String phone = request.getParameter("phone");
		String altphone= request.getParameter("altphone");
		String email= request.getParameter("email");
		String address= request.getParameter("address");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");

		Customer customer = (Customer) request.getSession().getAttribute("cust");
				
		customer.setAddress(address);
		if (altphone.equals("") || altphone == null) {
			customer.setAlternatePhone(" ");
		} else {
			customer.setAlternatePhone(altphone);
		}
		customer.setEmail(email);
		customer.setFirstName(fname);
		if (lname.equals("") || lname == null) {
			customer.setLastName(" ");
		} else {
			customer.setLastName(lname);
		}
		if (lname.equals("") || lname == null) {
			customer.setMiddleName(" ");
		} else {
			customer.setMiddleName(mname);
		}
		customer.setPassword(pass);
		customer.setPhone(phone);
		customer.setUserName(uname);
		
		ModelAndView model = new ModelAndView();
		
		return custHome(model, customerService.updateCustomer(customer));
	
	}
	
	@RequestMapping(value = "/updateCustProfileEmp", method = RequestMethod.POST)
	public ModelAndView custUpdateEmp(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In Login controller");		

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mname = request.getParameter("mname");
		String phone = request.getParameter("phone");
		String altphone= request.getParameter("altphone");
		String email= request.getParameter("email");
		String address= request.getParameter("address");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");

		Customer customer = (Customer) request.getSession().getAttribute("custemp");
		Employee employee = (Employee) request.getSession().getAttribute("emp");
				
		customer.setAddress(address);
		if (altphone.equals("") || altphone == null) {
			customer.setAlternatePhone(" ");
		} else {
			customer.setAlternatePhone(altphone);
		}
		customer.setEmail(email);
		customer.setFirstName(fname);
		if (lname.equals("") || lname == null) {
			customer.setLastName(" ");
		} else {
			customer.setLastName(lname);
		}
		if (lname.equals("") || lname == null) {
			customer.setMiddleName(" ");
		} else {
			customer.setMiddleName(mname);
		}
		customer.setPassword(pass);
		customer.setPhone(phone);
		customer.setUserName(uname);
		
		ModelAndView model = new ModelAndView();
		model = custHome(model,customerService.updateCustomer(customer));
		String str = customer.toString();
		str += "<div><center><br><br><button onclick=\"updateCustProfile()\">UPDATE PROFILE</button></center></div><br><br>";
	
		model.addObject("custlist", str);
		model.setViewName("employeeHome");
		return emptHome(model,employee);
	}
	
	@RequestMapping(value = "/updateEmpProfile", method = RequestMethod.POST)
	public ModelAndView EmpUpdate(HttpServletRequest request, HttpServletResponse response) {		
		System.out.println("In Login controller");		

		Employee employee = (Employee) request.getSession().getAttribute("emp");
		

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mname = request.getParameter("mname");
		String phone = request.getParameter("phone");
		String altphone= request.getParameter("altphone");
		String email= request.getParameter("email");
		String address= request.getParameter("address");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		employee.setAddress(address);
		if (altphone.equals("") || altphone == null) {
			employee.setAlternatePhone(" ");
		} else {
			employee.setAlternatePhone(altphone);
		}
		employee.setEmail(email);
		employee.setFirstName(fname);
		employee.setJoinDate(new Date() +"");
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
		employee.setUserName(uname);
		
		ModelAndView model = new ModelAndView();
		
		return emptHome(model,employeeService.updateEmployee(employee));
	}
	
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

			}
			model.addObject("custlist", result);
			
		}else {
			model.addObject("custlist", "No customer log found" );
		}
		Employee employee = (Employee) request.getSession().getAttribute("emp");
		
		return emptHome(model, employee);
	}
	//---------------view acc log----------------------
	@RequestMapping(value = "/viewAccLog", method = RequestMethod.POST)
	public ModelAndView getAccLog(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView();
		List<AccountLog> list = accountsService.getAllAccountsLogs();
		
		if (list.size() > 0) {
			String result = "<table>";
			result +="<tr>\n" + 
					"		<th>Acc Log ID</th>\n" + 
					"		<th>Acc Num</th>\n" + 
					"		<th>Cust Id</th>\n" + 
					"		<th>Type</th>\n" + 
					"		<th>Command</th>\n" + 
					"	</tr>";
			for(int i = 0 ; i < list.size() ; i ++) {

				result += "<tr>";
				result += "<td><form method=\"post\" action=\"acclogid\">\n" + 
						"	<input type=\"submit\" name=\"custintlogidz\" value=\""+ list.get(i).getAccLogID() +"\">" + 
						"</form></td>" + " <td>" + list.get(i).getAnum() + "</td> <td>" + list.get(i).getCust_ID()
						 + "</td> <td>" + list.get(i).getType() + "</td> <td>" + list.get(i).getCommand() + "</td>";
				result += "</tr>";

			}
			model.addObject("custlist", result);
			
		}else {
			model.addObject("custlist", "No account log found");
		}
		Employee employee = (Employee) request.getSession().getAttribute("emp");
		
		return emptHome(model, employee);
	}
	
	//---------------view emp log----------------------
		@RequestMapping(value = "/viewEmpLog", method = RequestMethod.POST)
		public ModelAndView getEmpLog(HttpServletRequest request, HttpServletResponse response) {
			ModelAndView model = new ModelAndView();
			List<EmployeeLog> list = employeeService.getAllEmployeeLog();
			
			if ( list != null && list.size() > 0) {
				String result = "<table>";
				result +="<tr>\n" + 
						"		<th>Log ID</th>\n" + 
						"		<th>EMP ID</th>\n" + 
						"		<th>F. Name</th>\n" + 
						"		<th>Email</th>\n" + 
						"		<th>Command</th>\n" + 
						"	</tr>";
				for(int i = 0 ; i < list.size() ; i ++) {

					result += "<tr>";
					result += "<td><form method=\"post\" action=\"emplogid\">\n" + 
							"	<input type=\"submit\" name=\"emplogid\" value=\""+ list.get(i).getEmpLogID() +"\">" + 
							"</form></td>" + " <td>" + list.get(i).getEmpID() + "</td> <td>" + list.get(i).getFirstName()
							 + "</td> <td>" + list.get(i).getEmail() + "</td> <td>" + list.get(i).getCommand() + "</td>";
					result += "</tr>";

				}
				model.addObject("custlist", result);
				
			}else {
				model.addObject("custlist", "No employee log found");
			}
			Employee employee = (Employee) request.getSession().getAttribute("emp");
			
			return emptHome(model, employee);
		}
	
	public ModelAndView emptHome(ModelAndView model, Employee employee2) {
		model.addObject("empname", employee2.getFirstName() + " " + employee2.getMiddleName() + " " + employee2.getLastName());
		model.addObject("empId", employee2.getEmpID());
		model.addObject("LastLogin", employee2.getJoinDate());
		model.addObject("eaddress", employee2.getAddress());
		model.addObject("ealtphone", employee2.getAlternatePhone());
		model.addObject("edob", employee2.getDOB());
		model.addObject("eemail", employee2.getEmail());
//		model.addObject("eeid", employee2.getEmpID());
		model.addObject("efname", employee2.getFirstName());
		model.addObject("elname", employee2.getLastName());
		model.addObject("emname", employee2.getMiddleName());
		model.addObject("ephone", employee2.getPhone());
		model.addObject("euname", employee2.getUserName());
		model.addObject("epass", employee2.getPassword());
		model.setViewName("employeeHome");
		return model;
	}
	
	public ModelAndView custHome(ModelAndView model, Customer customer2) {
		List<Accounts> list = customer2.getAcc();
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
		model.addObject("custname",customer2.getFirstName() + " " + customer2.getMiddleName() + " " + customer2.getLastName());
		model.addObject("custId",customer2.getCustID());
		model.addObject("LastLogin",customer2.getJoinDate());
		model.addObject("acclist", res);
		model.addObject("caddress",customer2.getAddress());
		model.addObject("caltphone",customer2.getAlternatePhone());
		model.addObject("cdob",customer2.getDOB());
		model.addObject("cemail",customer2.getEmail());
		model.addObject("cfname",customer2.getFirstName());
		model.addObject("clname",customer2.getLastName());
		model.addObject("cmname",customer2.getMiddleName());
		model.addObject("cphone",customer2.getPhone());
		model.addObject("cuname",customer2.getUserName());
		model.addObject("cpass",customer2.getPassword());
		model.setViewName("customerhome");
		return model;
	}

}
