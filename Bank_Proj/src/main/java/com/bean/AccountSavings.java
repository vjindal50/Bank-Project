package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.LocalDate;

@Entity
@Table(name = "AccountSavings")
public class AccountSavings {
	
	@Id
	@Column(name = "SNo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SNo;
	
	@Column(name = "Account_Number")
	private int Account_Number;
	
	@Column(name = "Balance")
	private double balance;
	
	@Column(name = "WithdrawLimit")
	private double withdrawLimit;
	
	@Column(name = "Interset")
	private double interest;
	
	@Column(name = "LastAccess")
	private LocalDate lastAccess;

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

	public LocalDate getLastAccess() {
		return lastAccess;
	}

	public void setLastAccess(LocalDate lastAccess) {
		this.lastAccess = lastAccess;
	}
	
	public int getSNo() {
		return SNo;
	}

	public void setSNo(int sNo) {
		SNo = sNo;
	}

	public String toString() {
		return "Account Number : " + getAccount_Number()
				+ "\nBalance : " + getBalance()
				+ "\nWithdraw Limit : " + getWithdrawLimit()
				+ "\nInterest  : " + getInterest();
	}
	
}
