package com.vj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.vj.dao.EmployeeDAO;
import com.vj.dao.EmployeeLogDAO;
import com.vj.model.Employee;
import com.vj.model.EmployeeLog;
 
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
 
    @Autowired
    private EmployeeDAO EmployeeDAO;
    
    @Autowired
    private EmployeeLogDAO employeeLogDAO;
 
    @Transactional
    public void addEmployee(Employee Employee) {
    		EmployeeDAO.addEmployee(Employee);
    }
 
    @Transactional
    public List<Employee> getAllEmployee() {
        return EmployeeDAO.getAllEmployee();
    }
 
    
    @Transactional
    public void deleteEmployee(int EmployeeId) {
    	EmployeeDAO.deleteEmployee(EmployeeId);
    }
 
    public Employee getEmployee(int empid) {
        return EmployeeDAO.getEmployee(empid);
    }
 
    public Employee updateEmployee(Employee Employee) {
        // TODO Auto-generated method stub
        return EmployeeDAO.updateEmployee(Employee);
    }
 
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.EmployeeDAO = employeeDAO;
    }

	public Employee login(String uname, String pass) {
		// TODO Auto-generated method stub
		return EmployeeDAO.login(uname, pass);
	}

	@Override
	public List<EmployeeLog> getAllEmployeeLog() {
		// TODO Auto-generated method stub
		return employeeLogDAO.getAllEmplog();
	}

	@Override
	public EmployeeLog getCustomerLog(int empLogId) {
		// TODO Auto-generated method stub
		return employeeLogDAO.getEmployeeLog(empLogId);
	}
}
 
