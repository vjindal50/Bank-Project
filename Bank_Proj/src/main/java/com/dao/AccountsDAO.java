package com.dao;

import java.util.List;

import com.bean.Accounts;

public interface AccountsDAO {
	
	public List<Accounts> getAllAccounts();
	public List<Accounts> getAccountsByType(String type);
	public List<Accounts> getAccountsByStatus(String status);
	public List<Accounts> getAccountsByCustId(int custID);
	public void updateAccSaving(Accounts a);
	

}
