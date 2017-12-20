package com.vj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vj.model.AccountLog;
import com.vj.model.CustomerLog;

@Repository
public class AccountLogDAOImpl implements AccountLogDAO{
	
	@Autowired
	 private SessionFactory sessionFactory;

	@Override
	public void insertAccLog(AccountLog accountsLog) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession().saveOrUpdate(accountsLog);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<AccountLog> getAllAcclog() {
		List<AccountLog> list = sessionFactory.getCurrentSession().createQuery("from com.vj.model.AccountLog").list();
		System.out.println(list.size());
		return list;
	}

	@Override
	public AccountLog getCustomerLog(int acclogId) {
		return (AccountLog) sessionFactory.getCurrentSession().get(
				AccountLog.class, acclogId);
	}

}
