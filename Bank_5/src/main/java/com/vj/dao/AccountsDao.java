package com.vj.dao;

import java.util.List;

import com.vj.model.Accounts;


public interface AccountsDao {

	public void addAccount(Accounts account);
	public List<Accounts> getAllAccounts();
	public void deleteAccount(int AccountNumber);
	public Accounts updateAccount(Accounts account);
	public Accounts getAccount(int AccountNumber);
	
	
	
}
