package com.vj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.vj.dao.AccountLogDAO;
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
	 
//	 @Autowired
//	 private AccountLogDAO accountLogDAO;

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

	@Override
	public List<AccountSavings> getAllSavingsAccounts() {
		// TODO Auto-generated method stub
		return accSavDAO.getAllSaveAccounts();
	}

	@Override
	public List<AccountsChecking> getAllCheckingAccounts() {
		// TODO Auto-generated method stub
		return accChkDAO.getAllChkAccounts();
	}

	@Override
	public List<AccountsLoan> getAllLoanAccounts() {
		// TODO Auto-generated method stub
		return accLoanDAO.getAllLoanAccounts();
	}

	@Override
	public AccountSavings getSavAccount(int accountsSavNum) {
		// TODO Auto-generated method stub
		return accSavDAO.getSaveAccount(accountsSavNum);
	}

	@Override
	public AccountsChecking getChkAccount(int accountsChkNum) {
		// TODO Auto-generated method stub
		return accChkDAO.getChkAccount(accountsChkNum);
	}

	@Override
	public AccountsLoan getLoanAccount(int accountsLoanNum) {
		// TODO Auto-generated method stub
		return accLoanDAO.getLoanAccount(accountsLoanNum);
	}

	@Override
	public AccountSavings updateSavAccount(AccountSavings accounts) {
		// TODO Auto-generated method stub
		return accSavDAO.updateSavAccount(accounts);
	}

	@Override
	public AccountsChecking updateChkAccount(AccountsChecking accounts) {
		// TODO Auto-generated method stub
		return accChkDAO.updateChkAccount(accounts);
	}

	@Override
	public AccountsLoan updateLoanAccount(AccountsLoan accounts) {
		// TODO Auto-generated method stub
		return accLoanDAO.updateLoanAccount(accounts);
	}

}
