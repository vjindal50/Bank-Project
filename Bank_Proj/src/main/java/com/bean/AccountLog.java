package com.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "AccountLog")
public class AccountLog implements Serializable {
	
	private int Anum;
	private Double Balance;
	private Double WithdrawLimit;
	private Double OverDraft;
	private Double Interset;
	private Date LastAccess;
	
	public AccountLog(){
		
	}
	
	public AccountLog(Double Balance,  Double WithdrawLimit,Double OverDraft,Double Interest,Date LastAccess ){
		this.Balance=Balance;
		this.WithdrawLimit=WithdrawLimit;
		this.OverDraft=OverDraft;
		this.Interset=Interest;
		this.LastAccess=LastAccess;
	}

	public int getAnum() {
		return Anum;
	}

	public void setAnum(int anum) {
		Anum = anum;
	}

	public Double getBalance() {
		return Balance;
	}

	public void setBalance(Double balance) {
		Balance = balance;
	}

	public Double getWithdrawLimit() {
		return WithdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		WithdrawLimit = withdrawLimit;
	}

	public Double getOverDraft() {
		return OverDraft;
	}

	public void setOverDraft(Double overDraft) {
		OverDraft = overDraft;
	}

	public Double getInterset() {
		return Interset;
	}

	public void setInterset(Double interset) {
		Interset = interset;
	}

	public Date getLastAccess() {
		return LastAccess;
	}

	public void setLastAccess(Date lastAccess) {
		LastAccess = lastAccess;
	}
	
	public String toString() {
		return "AccountNumber : " + getAnum() 
				+ " <br>\nBalance : " + getBalance()
				+ " <br>\nWithdrawLimit : " + getWithdrawLimit()
				+ " <br>\nOverDraft: " + getOverDraft()
				+ " <br>\nInterset : " + getInterset()
				+ " <br>\nLastAccess : " + getLastAccess();
	}
}
