package com.vj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.vj.dao.CustomerDAO;
import com.vj.model.Customer;
 
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
 
    @Autowired
    private CustomerDAO customerDAO;
 
    @Transactional
    public void addCustomer(Customer customer) {
    		customerDAO.addCustomer(customer);
    }
 
    @Transactional
    public List<Customer> getAllCustomer() {
        return customerDAO.getAllCustomer();
    }
 
    
    @Transactional
    public void deleteCustomer(int customerId) {
    	customerDAO.deleteCustomer(customerId);
    }
 
    public Customer getCustomer(int empid) {
        return customerDAO.getCustomer(empid);
    }
 
    public Customer updateCustomer(Customer customer) {
        // TODO Auto-generated method stub
        return customerDAO.updateCustomer(customer);
    }
 
    public void setEmployeeDAO(CustomerDAO employeeDAO) {
        this.customerDAO = employeeDAO;
    }

	public Customer login(String uname, String pass) {
		// TODO Auto-generated method stub
		return customerDAO.login(uname, pass);
	}
}
 
