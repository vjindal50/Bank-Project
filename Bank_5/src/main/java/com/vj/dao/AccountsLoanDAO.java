package com.vj.dao;

import java.util.List;

import com.vj.model.AccountsLoan;

public interface AccountsLoanDAO {
	
	public void addLoanAccount(AccountsLoan accLoan);
	public List<AccountsLoan> getAllLoanAccounts();
	public AccountsLoan getLoanAccount(int accLoanNumber);
	public AccountsLoan updateLoanAccount(AccountsLoan accLoan);

}
