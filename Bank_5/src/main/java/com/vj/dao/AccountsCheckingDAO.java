package com.vj.dao;

import java.util.List;

import com.vj.model.AccountsChecking;

public interface AccountsCheckingDAO {
	
	public void addCheckAccount(AccountsChecking accChk);
	public List<AccountsChecking> getAllChkAccounts();
	public AccountsChecking getChkAccount(int accChkNumber);
	public AccountsChecking updateChkAccount(AccountsChecking accChk);

}
