package com.dao;

import java.util.List;

import com.bean.EmployeeLog;

public interface EmployeeLogDAO {
	
	public List<EmployeeLog> getAllEmpLog();
	public int insertIntoEmpLog(EmployeeLog custLog);
	public List<EmployeeLog> findById(int id);

}
