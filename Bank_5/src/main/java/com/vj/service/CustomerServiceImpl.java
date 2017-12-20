package com.vj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.vj.dao.CustomerDAO;
import com.vj.dao.CustomerLogDAO;
import com.vj.model.Customer;
import com.vj.model.CustomerLog;
 
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
 
    @Autowired
    private CustomerDAO customerDAO;
    
    @Autowired
    private CustomerLogDAO customerLogDAO;
 
    @Transactional
    public void addCustomer(Customer customer) {
    		
    		customerDAO.addCustomer(customer);
    		
    		CustomerLog cLog = new CustomerLog();
    		
    		cLog.setAddress(customer.getAddress());
    		cLog.setAlternatePhone(customer.getAlternatePhone());
    		cLog.setCommand("Created new");
    		cLog.setCustID(customer.getCustID());
    		cLog.setDOB(customer.getDOB());
    		cLog.setEmail(customer.getEmail());
    		cLog.setFirstName(customer.getFirstName());
    		cLog.setLastName(customer.getLastName());
    		cLog.setMiddleName(customer.getMiddleName());
    		cLog.setJoinDate(customer.getJoinDate());
    		cLog.setCustID(customer.getCustID());
    		cLog.setPassword(customer.getPassword());
    		cLog.setPhone(customer.getPhone());
    		cLog.setStatus(customer.getStatus());
    		cLog.setUserName(customer.getUserName());

    		customerLogDAO.insertCustomerLog(cLog);
    }
 
    @Transactional
    public List<Customer> getAllCustomer() {
        return customerDAO.getAllCustomer();
    }
 
    
    @Transactional
    public void deleteCustomer(int customerId) {
    		Customer customer = getCustomer(customerId);
    		
    		CustomerLog cLog = new CustomerLog();
    		
    		cLog.setAddress(customer.getAddress());
    		cLog.setAlternatePhone(customer.getAlternatePhone());
    		cLog.setCommand("delete");
    		cLog.setCustID(customer.getCustID());
    		cLog.setDOB(customer.getDOB());
    		cLog.setEmail(customer.getEmail());
    		cLog.setFirstName(customer.getFirstName());
    		cLog.setLastName(customer.getLastName());
    		cLog.setMiddleName(customer.getMiddleName());
    		cLog.setJoinDate(customer.getJoinDate());
    		cLog.setCustID(customer.getCustID());
    		cLog.setPassword(customer.getPassword());
    		cLog.setPhone(customer.getPhone());
    		cLog.setStatus(customer.getStatus());
    		cLog.setUserName(customer.getUserName());

    		customerLogDAO.insertCustomerLog(cLog);
    		customerDAO.deleteCustomer(customerId);
    }
 
    public Customer getCustomer(int empid) {
        return customerDAO.getCustomer(empid);
    }
 
    public Customer updateCustomer(Customer customer2) {
    		Customer customer = customerDAO.updateCustomer(customer2);
    		
    		CustomerLog cLog = new CustomerLog();
    		
    		cLog.setAddress(customer.getAddress());
    		cLog.setAlternatePhone(customer.getAlternatePhone());
    		cLog.setCommand("update");
    		cLog.setCustID(customer.getCustID());
    		cLog.setDOB(customer.getDOB());
    		cLog.setEmail(customer.getEmail());
    		cLog.setFirstName(customer.getFirstName());
    		cLog.setLastName(customer.getLastName());
    		cLog.setMiddleName(customer.getMiddleName());
    		cLog.setJoinDate(customer.getJoinDate());
    		cLog.setCustID(customer.getCustID());
    		cLog.setPassword(customer.getPassword());
    		cLog.setPhone(customer.getPhone());
    		cLog.setStatus(customer.getStatus());
    		cLog.setUserName(customer.getUserName());

    		customerLogDAO.insertCustomerLog(cLog);
    		
        return customer;
    }
 
    public void setEmployeeDAO(CustomerDAO employeeDAO) {
        this.customerDAO = employeeDAO;
    }

	public Customer login(String uname, String pass) {
		// TODO Auto-generated method stub
		return customerDAO.login(uname, pass);
	}
}
 
