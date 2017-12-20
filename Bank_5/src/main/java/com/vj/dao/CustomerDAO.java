package com.vj.dao;

import java.util.List;

import com.vj.model.Customer;

public interface CustomerDAO {
	
//	public List<Customer> getAllCustomer();
//	public Customer findById(int id);
//	public Customer findByUnamePass(String uname, String pass);
//	public List<Customer> findByName(String name);
//	public List<Customer> getByStatus(String status);
//	public Customer updateCust(Customer cust);
	
	public void addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public void deleteCustomer(int customerId);
	public Customer updateCustomer(Customer customer);
	public Customer getCustomer(int empid);
	public Customer login(String uname, String pass);

}
