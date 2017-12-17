package com.vj.service;

import java.util.List;
import com.vj.model.Customer;

public interface CustomerService {

	public void addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public void deleteCustomer(int custId);
	public Customer getCustomer(int custId);
	public Customer updateCustomer(Customer customer);
	public Customer login(String uname, String pass);
}
