package com.vj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vj.model.EmployeeLog;

@Repository
public class EmployeeLogDAOImpl implements EmployeeLogDAO {
	
	@Autowired
	 private SessionFactory sessionFactory;

	@Override
	public void insertEmpLog(EmployeeLog employeeLog) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(employeeLog);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<EmployeeLog> getAllEmplog() {
		List<EmployeeLog> list = sessionFactory.getCurrentSession().createQuery("from com.vj.model.EmployeeLog").list();
		System.out.println(list.size());
		return list;
	}

	@Override
	public EmployeeLog getEmployeeLog(int emplogId) {
		return (EmployeeLog) sessionFactory.getCurrentSession().get(
				EmployeeLog.class, emplogId);
	}

}
