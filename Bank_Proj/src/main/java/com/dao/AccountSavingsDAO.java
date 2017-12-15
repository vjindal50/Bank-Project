package com.dao;

import java.util.List;

import com.bean.AccountSavings;

public interface AccountSavingsDAO {
		
	public List<AccountSavings> fingAccSavByAccNumber(int Anum);
	public List<AccountSavings> fingAccSavByCustId(int CustId);
	public void saveAccountSaving(AccountSavings accountsaving);
	public List<AccountSavings> getAllAccountSavings();
	public void deleteAccSavingByAccNum(int Anum);
	public void deleteAccSavingByCustId(int CustId);
	public void updateAccSaving(AccountSavings a);
//	public void updateAccSaving(int ANum, int CustId , AccountSavings a);

}
