package com.vj.service;

import java.util.List;

import com.vj.model.Accounts;

public interface AccountService {

	public void addAccount(Accounts account);
	public List<Accounts> getAllAccounts();
	//public void deleteAccount(int custId);
	public Accounts getAccount(int accountNo);
	public Accounts updateAccount(Accounts account);
	//public Customer login(String uname, String pass);
	
	
}
