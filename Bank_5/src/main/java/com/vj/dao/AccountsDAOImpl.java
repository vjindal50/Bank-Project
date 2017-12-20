package com.vj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vj.model.Accounts;

@Repository
public class AccountsDAOImpl implements AccountsDAO{
	
	 @Autowired
	 private SessionFactory sessionFactory;

	@Override
	public void openAccount(Accounts accounts) {
		 sessionFactory.getCurrentSession().saveOrUpdate(accounts);	
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Accounts> getAllAccounts() {
		List<Accounts> list = sessionFactory.getCurrentSession().createQuery("from com.vj.model.Accounts").list();
		System.out.println(list.size());
		return list;
	}

	@Override
	public Accounts getAccount(int accNumber) {
		return (Accounts) sessionFactory.getCurrentSession().get(
				Accounts.class, accNumber);
	}

	@Override
	public Accounts updateAccount(Accounts accounts) {
		sessionFactory.getCurrentSession().update(accounts);
        return accounts;
	}

}
