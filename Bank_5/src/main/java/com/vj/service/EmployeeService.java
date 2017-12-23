package com.vj.service;

import java.util.List;

import com.vj.model.Employee;
import com.vj.model.EmployeeLog;

public interface EmployeeService {

	public void addEmployee(Employee Employee);
	public List<Employee> getAllEmployee();
	public List<EmployeeLog> getAllEmployeeLog();
	public void deleteEmployee(int empId);
	public Employee getEmployee(int empId);
	public EmployeeLog getEmployeeLog(int empLogId);
	public Employee updateEmployee(Employee Employee);
	public Employee login(String uname, String pass);
}
