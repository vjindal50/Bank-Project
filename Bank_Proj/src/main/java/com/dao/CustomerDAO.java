package com.dao;

import java.util.List;

import com.bean.Customer;

public interface CustomerDAO {
	
	public List<Customer> getAllCustomer();
	public Customer findById(int id);
	public Customer findByUnamePass(String uname, String pass);
	public List<Customer> findByName(String name);
	public void deleteCustById(int id);
	public List<Customer> getByStatus(String status);

}
