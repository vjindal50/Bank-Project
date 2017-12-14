package com.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AccountStatus {
	
	@Id
	@Column(name = "SNo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SNo;
	
	@Column(name = "AccountNumber")
	private int AccountNumber; 
	
	@Column(name = "Status")
	private String Status;
	
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getSNo() {
		return SNo;
	}
	public void setSNo(int sNo) {
		SNo = sNo;
	}
	
}
