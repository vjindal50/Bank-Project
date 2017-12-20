package com.vj.dao;

import java.util.List;

import com.vj.model.Accounts;

public interface AccountsDAO {
	
	public void openAccount(Accounts accounts);
	public List<Accounts> getAllAccounts();
	public Accounts getAccount(int accNumber);
	public Accounts updateAccount(Accounts accounts);
}
