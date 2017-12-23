package com.vj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vj.dao.AccountLogDAO;
//import com.vj.dao.AccountLogDAO;
import com.vj.dao.AccountSavingsDAO;
import com.vj.dao.AccountsCheckingDAO;
import com.vj.dao.AccountsDAO;
import com.vj.dao.AccountsLoanDAO;
import com.vj.model.AccountLog;
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
	 
	 @Autowired
	 private AccountLogDAO accountLogDAO;

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
		Accounts accounts = getAccount(accSav.getAccount_Number());
		
		AccountLog accLog = new AccountLog();
		
		accLog.setAnum(accounts.getAccountNumber());
		accLog.setClosedOn(accounts.getClosedOn());
		accLog.setCust_ID(accounts.getCust_ID());
		accLog.setType(accounts.getType());
		accLog.setCommand("Created");
		accLog.setOpenedOn(accounts.getOpenedOn());
		accLog.setWithdrawLimit((double)accounts.getAccSav().get(0).getWithdrawLimit());
		accLog.setBalance(accounts.getAccSav().get(0).getBalance());
		accLog.setInterset(accounts.getAccSav().get(0).getInterest());

	}
	
	@Transactional
	public void openCheckingAccount(AccountsChecking accChk) {
		// TODO Auto-generated method stub
		accChkDAO.addCheckAccount(accChk);
		
		Accounts accounts = getAccount(accChk.getAccNumber());
		AccountLog accLog = new AccountLog();
		
		accLog.setAnum(accounts.getAccountNumber());
		accLog.setClosedOn(accounts.getClosedOn());
		accLog.setCust_ID(accounts.getCust_ID());
		accLog.setType(accounts.getType());
		accLog.setCommand("Created");
		accLog.setOpenedOn(accounts.getOpenedOn());
		accLog.setBalance(accounts.getAccChk().get(0).getBalance());
		accLog.setOverDraft(accounts.getAccChk().get(0).getOverDraft());
		accLog.setInterset(accounts.getAccChk().get(0).getInterest());

	}
	
	@Transactional
	public void openLoanAccount(AccountsLoan accLoan) {
		// TODO Auto-generated method stub
		accLoanDAO.addLoanAccount(accLoan);
		
		Accounts accounts = getAccount(accLoan.getACC_NUM());
		AccountLog accLog = new AccountLog();
		
		accLog.setAnum(accounts.getAccountNumber());
		accLog.setClosedOn(accounts.getClosedOn());
		accLog.setCust_ID(accounts.getCust_ID());
		accLog.setType(accounts.getType());
		accLog.setCommand("Created");
		accLog.setOpenedOn(accounts.getOpenedOn());
		accLog.setEMI(accounts.getAccLoan().get(0).getEMI());
		accLog.setEMICounter(accounts.getAccLoan().get(0).getEMIcounter());
		accLog.setBalance(accounts.getAccLoan().get(0).getBalance());
		accLog.setInterset(accounts.getAccLoan().get(0).getInterest());
		accLog.setLastEMIPayed(accounts.getAccLoan().get(0).getLastEMIPayed());
		accLog.setAmountPayed(accounts.getAccLoan().get(0).getAmountPayed());

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

//	@Override
//	@Transactional
//	public Accounts updateAccount(Accounts accounts) {
//		// TODO Auto-generated method stub
//		accounts = accountsDAO.updateAccount(accounts);
//		
//		return accounts;
//	}

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
	public AccountSavings updateSavAccount(AccountSavings accounts3) {
		// TODO Auto-generated method stub
		AccountSavings accounts2 = accSavDAO.updateSavAccount(accounts3);
		Accounts accounts = getAccount(accounts2.getAccount_Number());
		
		AccountLog accLog = new AccountLog();
		
		accLog.setAnum(accounts.getAccountNumber());
		accLog.setClosedOn(accounts.getClosedOn());
		accLog.setCust_ID(accounts.getCust_ID());
		accLog.setType(accounts.getType());
		accLog.setCommand("update");
		accLog.setOpenedOn(accounts.getOpenedOn());
		
		accLog.setWithdrawLimit((double)accounts.getAccSav().get(0).getWithdrawLimit());
		accLog.setBalance(accounts.getAccSav().get(0).getBalance());
//		accLog.setInterset(accounts.getAccSav().get(0).getInterest());
		
		accountLogDAO.insertAccLog(accLog);
		
		return accounts2;
	}

	@Override
	public AccountsChecking updateChkAccount(AccountsChecking accounts3) {
		// TODO Auto-generated method stub
		accounts3 = accChkDAO.updateChkAccount(accounts3);
		
		Accounts accounts = getAccount(accounts3.getAccNumber());
		
		AccountLog accLog = new AccountLog();
		
		accLog.setAnum(accounts.getAccountNumber());
		accLog.setClosedOn(accounts.getClosedOn());
		accLog.setCust_ID(accounts.getCust_ID());
		accLog.setType(accounts.getType());
		accLog.setCommand("update");
		
		accLog.setBalance(accounts.getAccChk().get(0).getBalance());
		accLog.setOverDraft(accounts.getAccChk().get(0).getOverDraft());
		accLog.setInterset(accounts.getAccChk().get(0).getInterest());
		
		accountLogDAO.insertAccLog(accLog);
		
		return accounts3;
	}

	@Override
	public AccountsLoan updateLoanAccount(AccountsLoan accounts2) {
		// TODO Auto-generated method stub
		accounts2 = accLoanDAO.updateLoanAccount(accounts2);
		
		Accounts accounts = getAccount(accounts2.getACC_NUM());
		
		AccountLog accLog = new AccountLog();
		
		accLog.setAnum(accounts.getAccountNumber());
		accLog.setClosedOn(accounts.getClosedOn());
		accLog.setCust_ID(accounts.getCust_ID());
		accLog.setType(accounts.getType());
		accLog.setCommand("update");
		
		accLog.setEMI(accounts.getAccLoan().get(0).getEMI());
		accLog.setEMICounter(accounts.getAccLoan().get(0).getEMIcounter());
		accLog.setBalance(accounts.getAccLoan().get(0).getBalance());
		accLog.setInterset(accounts.getAccLoan().get(0).getInterest());
		accLog.setLastEMIPayed(accounts.getAccLoan().get(0).getLastEMIPayed());
		accLog.setAmountPayed(accounts.getAccLoan().get(0).getAmountPayed());

		accountLogDAO.insertAccLog(accLog);
		
		return accounts2;
	}

	@Override
	public List<AccountLog> getAllAccountsLogs() {
		// TODO Auto-generated method stub
		return accountLogDAO.getAllAcclog();
	}

	@Override
	public AccountLog getAccLog(int accLogId) {
		// TODO Auto-generated method stub
		return accountLogDAO.getAccLog(accLogId);
	}

}
