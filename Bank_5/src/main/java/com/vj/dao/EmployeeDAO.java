package com.vj.dao;

import java.util.List;

import com.vj.model.Employee;

public interface EmployeeDAO {
	
	public void addEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public void deleteEmployee(int employeeId);
	public Employee updateEmployee(Employee employee);
	public Employee getEmployee(int employeeid);
	public Employee login(String uname, String pass);

}
