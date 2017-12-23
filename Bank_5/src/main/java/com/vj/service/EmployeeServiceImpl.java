package com.vj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.vj.dao.EmployeeDAO;
import com.vj.dao.EmployeeLogDAO;
//import com.vj.dao.EmployeeLogDAO;
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
    public void addEmployee(Employee employee) {
    		EmployeeDAO.addEmployee(employee);
    		
    		EmployeeLog eLog =  new EmployeeLog();
    		
    		eLog.setAddress(employee.getAddress());
    		eLog.setAlternatePhone(employee.getAlternatePhone());
    		eLog.setCommand("Created new");
    		eLog.setEmpID(employee.getEmpID());
    		eLog.setDOB(employee.getDOB());;
    		eLog.setEmail(employee.getEmail());
    		eLog.setFirstName(employee.getFirstName());
    		eLog.setLastName(employee.getLastName());
    		eLog.setMiddleName(employee.getMiddleName());
    		eLog.setJoinString(employee.getJoinDate());
    		eLog.setPassword(employee.getPassword());
    		eLog.setPhone(employee.getPhone());
    		eLog.setStatus(employee.getStatus());
    		eLog.setUserName(employee.getUserName());
    		
    		employeeLogDAO.insertEmpLog(eLog);
    }
 
    @Transactional
    public List<Employee> getAllEmployee() {
        return EmployeeDAO.getAllEmployee();
    }
 
    
    @Transactional
    public void deleteEmployee(int EmployeeId) {
    	
    		Employee employee = getEmployee(EmployeeId);
    		
    		EmployeeLog eLog =  new EmployeeLog();
		
		eLog.setAddress(employee.getAddress());
		eLog.setAlternatePhone(employee.getAlternatePhone());
		eLog.setCommand("delete");
		eLog.setEmpID(employee.getEmpID());
		eLog.setDOB(employee.getDOB());;
		eLog.setEmail(employee.getEmail());
		eLog.setFirstName(employee.getFirstName());
		eLog.setLastName(employee.getLastName());
		eLog.setMiddleName(employee.getMiddleName());
		eLog.setJoinString(employee.getJoinDate());
		eLog.setPassword(employee.getPassword());
		eLog.setPhone(employee.getPhone());
		eLog.setStatus(employee.getStatus());
		eLog.setUserName(employee.getUserName());
		
		employeeLogDAO.insertEmpLog(eLog);
    		EmployeeDAO.deleteEmployee(EmployeeId);
    }
 
    public Employee getEmployee(int empid) {
        return EmployeeDAO.getEmployee(empid);
    }
 
    public Employee updateEmployee(Employee employee) {
        // TODO Auto-generated method stub
    		employee = EmployeeDAO.updateEmployee(employee);
    		
    		EmployeeLog eLog =  new EmployeeLog();
    		
    		eLog.setAddress(employee.getAddress());
    		eLog.setAlternatePhone(employee.getAlternatePhone());
    		eLog.setCommand("update");
    		eLog.setEmpID(employee.getEmpID());
    		eLog.setDOB(employee.getDOB());;
    		eLog.setEmail(employee.getEmail());
    		eLog.setFirstName(employee.getFirstName());
    		eLog.setLastName(employee.getLastName());
    		eLog.setMiddleName(employee.getMiddleName());
    		eLog.setJoinString(employee.getJoinDate());
    		eLog.setPassword(employee.getPassword());
    		eLog.setPhone(employee.getPhone());
    		eLog.setStatus(employee.getStatus());
    		eLog.setUserName(employee.getUserName());
    		
    		employeeLogDAO.insertEmpLog(eLog);
    	
        return employee;
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
	public EmployeeLog getEmployeeLog(int empLogId) {
		// TODO Auto-generated method stub
		return employeeLogDAO.getEmployeeLog(empLogId);
	}
}
 
