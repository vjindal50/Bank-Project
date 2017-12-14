package com.bean;

import java.util.Date;

public class AccountSavings {
	
	private int Account_Number;
	private double balance;
	private double withdrawLimit;
	private double interest;
	private Date lastAccess;

	public AccountSavings() {}

	public int getAccount_Number() {
		return Account_Number;
	}

	public void setAccount_Number(int account_Number) {
		Account_Number = account_Number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public Date getLastAccess() {
		return lastAccess;
	}

	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}
	
	public String toString() {
		return "Account Number : " + getAccount_Number()
				+ "\nBalance : " + getBalance()
				+ "\nWithdraw Limit : " + getWithdrawLimit()
				+ "\nInterest  : " + getInterest();
	}
	
}
