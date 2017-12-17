package com.dao;

import java.util.List;

import com.bean.AccountsLoan;

public interface AccountsLoanDAO {
	
	public List<AccountsLoan> fingAccSavByAccNumber(int Anum);
	public List<AccountsLoan> fingAccSavByCustId(int CustId);
	public void saveAccountSaving(AccountsLoan accountloan);
	public List<AccountsLoan> getAllAccountsLoan();
	public void deleteAccSavingByAccNum(int Anum);
	public void deleteAccSavingByCustId(int CustId);
	public void updateAccSaving(AccountsLoan a);

}
