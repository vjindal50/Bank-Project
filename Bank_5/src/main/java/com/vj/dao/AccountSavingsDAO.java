package com.vj.dao;

import java.util.List;

import com.vj.model.AccountSavings;

public interface AccountSavingsDAO {
	
	public void addSaveAccount(AccountSavings accSav);
	public List<AccountSavings> getAllSaveAccounts();
	public AccountSavings getSaveAccount(int accNumber);
	public AccountSavings updateSavAccount(AccountSavings accSav);

}
