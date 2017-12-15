package com.dao;

import java.util.List;

import com.bean.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmployee();
	public Employee findById(int id);
	public Employee findByUnamePass(String uname, String pass);
	public List<Employee> findByName(String name);
	public List<Employee> getByStatus(String status);
	public Employee updateCust(Employee cust);

}
