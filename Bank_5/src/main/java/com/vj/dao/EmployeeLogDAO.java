package com.vj.dao;

import java.util.List;

import com.vj.model.EmployeeLog;

public interface EmployeeLogDAO {
	
	public void insertEmpLog(EmployeeLog employeeLog);
	public List<EmployeeLog> getAllEmplog();
	public EmployeeLog getEmployeeLog(int emplogId);

}
