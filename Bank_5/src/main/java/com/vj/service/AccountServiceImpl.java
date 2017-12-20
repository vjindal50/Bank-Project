package com.vj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vj.dao.AccountsDao;
import com.vj.model.Accounts;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	 @Autowired
	 private AccountsDao accountsDao;
	
	
	 @Transactional
	public void addAccount(Accounts account) {
		accountsDao.addAccount(account);
		
	}

	 @Transactional
	public List<Accounts> getAllAccounts() {
		
		return accountsDao.getAllAccounts();
	}

	
	public Accounts getAccount(int accountNo) {
		// TODO Auto-generated method stub
		return accountsDao.getAccount(accountNo);
	}

	
	public Accounts updateAccount(Accounts account) {
		// TODO Auto-generated method stub
		return accountsDao.updateAccount(account);
	}

}
