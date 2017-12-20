package com.vj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vj.dao.AccountSavingsDAO;
import com.vj.dao.AccountsCheckingDAO;
import com.vj.dao.AccountsDAO;
import com.vj.dao.AccountsLoanDAO;
import com.vj.model.AccountSavings;
import com.vj.model.Accounts;
import com.vj.model.AccountsChecking;
import com.vj.model.AccountsLoan;

@Service
@Transactional
public class AccountsServiceImpl implements AccountsService{
	
	 @Autowired
	 private AccountsDAO accountsDAO;
	 
	 @Autowired
	 private AccountSavingsDAO accSavDAO;
	 
	 @Autowired
	 private AccountsCheckingDAO accChkDAO;
	 
	 @Autowired
	 private AccountsLoanDAO accLoanDAO;

	@Override
	@Transactional
	public void openAccount(Accounts accounts) {
		// TODO Auto-generated method stub
		accountsDAO.openAccount(accounts);
	}
	
	@Transactional
	public void openSavingsAccount(AccountSavings accSav) {
		// TODO Auto-generated method stub
		accSavDAO.addSaveAccount(accSav);
	}
	
	@Transactional
	public void openCheckingAccount(AccountsChecking accChk) {
		// TODO Auto-generated method stub
		accChkDAO.addCheckAccount(accChk);
	}
	
	@Transactional
	public void openLoanAccount(AccountsLoan accLoan) {
		// TODO Auto-generated method stub
		accLoanDAO.addLoanAccount(accLoan);
	}

	@Override
	@Transactional
	public List<Accounts> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountsDAO.getAllAccounts();
	}

	@Override
	@Transactional
	public Accounts getAccount(int accNumber) {
		// TODO Auto-generated method stub
		return accountsDAO.getAccount(accNumber);
	}

	@Override
	@Transactional
	public Accounts updateAccount(Accounts accounts) {
		// TODO Auto-generated method stub
		return accountsDAO.updateAccount(accounts);
	}

}
