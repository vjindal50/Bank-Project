package com.vj.service;

import java.util.List;

import com.vj.model.AccountSavings;
import com.vj.model.Accounts;
import com.vj.model.AccountsChecking;
import com.vj.model.AccountsLoan;

public interface AccountsService {
	
	public void openAccount(Accounts accounts);
	public List<Accounts> getAllAccounts();
	public Accounts getAccount(int accountsNum);
	public Accounts updateAccount(Accounts accounts);
	public void openSavingsAccount(AccountSavings accSav);
	public void openCheckingAccount(AccountsChecking accChk);
	public void openLoanAccount(AccountsLoan accLoan);
}
