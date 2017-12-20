package com.vj.service;

import java.util.List;
import com.vj.model.Customer;
import com.vj.model.CustomerLog;

public interface CustomerService {

	public void addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public List<CustomerLog> getAllCustomerLog();
	public void deleteCustomer(int custId);
	public Customer getCustomer(int custId);
	public CustomerLog getCustomerLog(int custLogId);
	public Customer updateCustomer(Customer customer);
	public Customer login(String uname, String pass);
}
