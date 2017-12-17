package com.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.LocalDate;

@Entity
@Table(name = "AccountsChecking")
public class AccountsChecking implements Serializable{
	
	@Id
	@Column(name = "SNo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SNo;
	
	@Column(name = "AccNumber")
	private int accNumber;
	
	@Column(name = "Balance")
	private double balance;
	
	@Column(name = "OverDraft")
	private double OverDraft;
	
	@Column(name = "Interest")
	private double interest;
	
	@Column(name = "LastAccessed")
	private LocalDate lastAccess;
	
	public AccountsChecking() {}

	public int getSNo() {
		return SNo;
	}

	public void setSNo(int sNo) {
		SNo = sNo;
	}

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

	public LocalDate getLastAccess() {
		return lastAccess;
	}

	public void setLastAccess(LocalDate lastAccess) {
		this.lastAccess = lastAccess;
	}
	
	public String toString() {
		return "Account Number : " + getAccNumber()
				+ "\nBalance : " + getBalance()
				+ "\nOver Draft Limit : " + getOverDraft()
				+ "\nGet Integers : " + getInterest();
	}

}
