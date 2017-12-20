package com.vj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vj.model.CustomerLog;

@Repository
public class CustomerLogDAOImpl implements CustomerLogDAO{
	
	 @Autowired
	 private SessionFactory sessionFactory;

	@Override
	public void insertCustomerLog(CustomerLog customerlog) {
		 sessionFactory.getCurrentSession().saveOrUpdate(customerlog);		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<CustomerLog> getAllCustomer() {
		List<CustomerLog> list = sessionFactory.getCurrentSession().createQuery("from com.vj.model.CustomerLog").list();
		System.out.println(list.size());
		return list;
	}

	@Override
	public CustomerLog getCustomerLog(int logId) {
		return (CustomerLog) sessionFactory.getCurrentSession().get(
				CustomerLog.class, logId);
	}

}
