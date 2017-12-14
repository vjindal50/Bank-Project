package com.bean;

import java.util.Date;

public class AccountsChecking {
	
	private int accNumber;
	private double balance;
	private double OverDraft;
	private double interest;
	private Date lastAccess;
	
	public AccountsChecking() {}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getOverDraft() {
		return OverDraft;
	}

	public void setOverDraft(double overDraft) {
		OverDraft = overDraft;
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
		return "Account Number : " + getAccNumber()
				+ "\nBalance : " + getBalance()
				+ "\nOver Draft Limit : " + getOverDraft()
				+ "\nGet Integers : " + getInterest();
	}

}
