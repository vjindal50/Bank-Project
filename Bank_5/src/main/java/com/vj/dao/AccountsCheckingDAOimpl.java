package com.vj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vj.model.AccountsChecking;
import com.vj.model.AccountsLoan;

@Repository
public class AccountsCheckingDAOimpl implements AccountsCheckingDAO {
	
	@Autowired
	 private SessionFactory sessionFactory;

	@Override
	public void addCheckAccount(AccountsChecking accChk) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(accChk);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<AccountsChecking> getAllChkAccounts() {
		List<AccountsChecking> list = sessionFactory.getCurrentSession().createQuery("from com.vj.model.AccountsChecking").list();
		System.out.println(list.size());
		return list;
	}

	@Override
	public AccountsChecking getChkAccount(int accChkNumber) {
		List<AccountsChecking> list = getAllChkAccounts();
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).getAccNumber() == accChkNumber) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public AccountsChecking updateChkAccount(AccountsChecking accChk) {
		sessionFactory.getCurrentSession().update(accChk);
        return accChk;
	}

}
