package com.dao;

import java.util.List;

import com.bean.AccountsChecking;

public interface AccountsCheckingDAO {
	
	public List<AccountsChecking> fingAccCheckByAccNumber(int Anum);
	public List<AccountsChecking> fingAccCheckByCustId(int CustId);
	public void saveAccountChecking(AccountsChecking accountsaving);
	public List<AccountsChecking> getAllAccountsChecking();
	public void deleteAccCheckingByAccNum(int Anum);
	public void deleteAccCheckingByCustId(int CustId);
	public void updateAccSaving(AccountsChecking a);

}
