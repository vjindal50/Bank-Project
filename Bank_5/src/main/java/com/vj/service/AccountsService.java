package com.vj.service;

import java.util.List;

import com.vj.model.AccountLog;
import com.vj.model.AccountSavings;
import com.vj.model.Accounts;
import com.vj.model.AccountsChecking;
import com.vj.model.AccountsLoan;

public interface AccountsService {
	
	public void openAccount(Accounts accounts);
	public List<Accounts> getAllAccounts();
	public List<AccountSavings> getAllSavingsAccounts();
	public List<AccountsChecking> getAllCheckingAccounts();
	public List<AccountsLoan> getAllLoanAccounts();
	public List<AccountLog> getAllAccountsLogs();
	public Accounts getAccount(int accountsNum);
	public AccountSavings getSavAccount(int accountsSavNum);
	public AccountsChecking getChkAccount(int accountsChkNum);
	public AccountsLoan getLoanAccount(int accountsLoanNum);
	public AccountLog getAccLog(int accLogId);
//	public Accounts updateAccount(Accounts accounts);
	public AccountSavings updateSavAccount(AccountSavings accounts);
	public AccountsChecking updateChkAccount(AccountsChecking accounts);
	public AccountsLoan updateLoanAccount(AccountsLoan accounts);
	public void openSavingsAccount(AccountSavings accSav);
	public void openCheckingAccount(AccountsChecking accChk);
	public void openLoanAccount(AccountsLoan accLoan);
}
