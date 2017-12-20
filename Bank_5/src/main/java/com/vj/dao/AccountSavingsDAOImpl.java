package com.vj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vj.model.AccountSavings;

@Repository
public class AccountSavingsDAOImpl implements AccountSavingsDAO {
	
	@Autowired
	 private SessionFactory sessionFactory;

	@Override
	public void addSaveAccount(AccountSavings accSav) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession().saveOrUpdate(accSav);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<AccountSavings> getAllSaveAccounts() {
		List<AccountSavings> list = sessionFactory.getCurrentSession().createQuery("from com.vj.model.AccountSavings").list();
		System.out.println(list.size());
		return list;
	}

	@Override
	public AccountSavings getSaveAccount(int accNumber) {
		List<AccountSavings> list = getAllSaveAccounts();
		for(int i = 0 ; i< list.size() ; i++) {
			if(list.get(i).getAccount_Number() == accNumber) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public AccountSavings updateSavAccount(AccountSavings accSav) {
		sessionFactory.getCurrentSession().update(accSav);
        return accSav;
	}

}
