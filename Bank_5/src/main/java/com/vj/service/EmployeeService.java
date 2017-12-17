package com.vj.service;

import java.util.List;
import com.vj.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee Employee);
	public List<Employee> getAllEmployee();
	public void deleteEmployee(int custId);
	public Employee getEmployee(int custId);
	public Employee updateEmployee(Employee Employee);
	public Employee login(String uname, String pass);
}
