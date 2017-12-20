package com.vj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vj.model.Accounts;


@Repository
public class AccountsDaoImpl implements AccountsDao  {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addAccount(Accounts account) {
		sessionFactory.getCurrentSession().saveOrUpdate(account);
		 
		
	}

	@SuppressWarnings("unchecked")
	public List<Accounts> getAllAccounts() {
		List<Accounts> list = sessionFactory.getCurrentSession().createQuery("from com.vj.model.Accounts").list();
		System.out.println(list.size());
		return list;
		
	}

	
	public void deleteAccount(int AccountNumber) {
		Accounts account = (Accounts) sessionFactory.getCurrentSession().load(
				Accounts.class, AccountNumber);
        if (null != account) {
            this.sessionFactory.getCurrentSession().delete(account);
        }
 
		
	}

	
	public Accounts updateAccount(Accounts account) {
		sessionFactory.getCurrentSession().update(account);
        return account;
	}

	
	public Accounts getAccount(int AccountNumber) {
		return (Accounts) sessionFactory.getCurrentSession().get(
				Accounts.class, AccountNumber);
	}

	
	
	
	
}
