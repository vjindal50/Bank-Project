package com.vj.dao;

import java.util.List;

import com.vj.model.Customer;

public interface CustomerDAO {
		
	public void addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public void deleteCustomer(int customerId);
	public Customer updateCustomer(Customer customer);
<<<<<<< HEAD
	public Customer getCustomer(int empid);
=======
	public Customer getCustomer(int customerId);
>>>>>>> master
	public Customer login(String uname, String pass);

}
