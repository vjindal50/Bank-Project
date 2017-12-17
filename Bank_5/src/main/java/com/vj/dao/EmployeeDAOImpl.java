package com.vj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
import com.vj.model.Employee;
 
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addEmployee(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Employee> getAllEmployee() {
    		List<Employee> list = sessionFactory.getCurrentSession().createQuery("from com.vj.model.Employee").list();
    		System.out.println(list.size());
        return list;
    }
 
    public void deleteEmployee(int empId) {
    	Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, empId);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
 
    }
 
    public Employee getEmployee(int empId) {
        return (Employee) sessionFactory.getCurrentSession().get(
        		Employee.class, empId);
    }
 
    public Employee updateEmployee(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
        return employee;
    }

	public Employee login(String uname, String pass) {
		List<Employee> list = getAllEmployee();
		for(int i = 0; i < list.size() ; i++) {
			if(list.get(i).getUserName().equals(uname) && list.get(i).getPassword().equals(pass)) {
				return list.get(i);
			}
		}
		return null;
	}
 
}