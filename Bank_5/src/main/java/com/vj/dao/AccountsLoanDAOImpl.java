package com.vj.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vj.model.AccountsLoan;

@Repository
public class AccountsLoanDAOImpl implements AccountsLoanDAO {
	
	@Autowired
	 private SessionFactory sessionFactory;

	@Override
	public void addLoanAccount(AccountsLoan accLoan) {
		sessionFactory.getCurrentSession().saveOrUpdate(accLoan);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<AccountsLoan> getAllLoanAccounts() {
		List<AccountsLoan> list = sessionFactory.getCurrentSession().createQuery("from com.vj.model.AccountsLoan").list();
		System.out.println(list.size());
		return list;
	}

	@Override
	public AccountsLoan updateLoanAccount(AccountsLoan accLoan) {
		sessionFactory.getCurrentSession().update(accLoan);
        return accLoan;
	}

	@Override
	public AccountsLoan getLoanAccount(int accLoanNumber) {
		List<AccountsLoan> list = getAllLoanAccounts();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getACC_NUM() == accLoanNumber) {
				return list.get(i);
			}
		}
		return null;
	}

}
