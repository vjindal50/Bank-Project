package com.vj.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Accounts")
public class Accounts implements Serializable{
	
	@Id
	@Column(name = "AccountNumber")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int AccountNumber;
	
	@Column(name = "OpenedOn")
	private Date openedOn;
	
	@Column(name = "ClosedOn")
	private Date closedOn;
	
	@Column(name = "Cust_ID")
	private int Cust_ID;
	
	@Column(name = "Type")
	private String type;
	
	@Column(name = "Status")
	private String Status;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "Account_Number")
	private AccountSavings accSav;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "AccNumber")
	private AccountsChecking accChk;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "ACC_NUM")
	private AccountsLoan accLoan;
	
	public Accounts() {}
	
	public AccountSavings getAccSav() {
		return accSav;
	}

	public void setAccSav(AccountSavings accSav) {
		this.accSav = accSav;
	}
	
	public AccountsChecking getAccChk() {
		return accChk;
	}

	public void setAccChk(AccountsChecking accChk) {
		this.accChk = accChk;
	}
	
	public AccountsLoan getAccLoan() {
		return accLoan;
	}

	public void setAccLoan(AccountsLoan accLoan) {
		this.accLoan = accLoan;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public Date getOpenedOn() {
		return openedOn;
	}

	public void setOpenedOn(Date openedOn) {
		this.openedOn = openedOn;
	}

	public Date getClosedOn() {
		return closedOn;
	}

	public void setClosedOn(Date closedOn) {
		this.closedOn = closedOn;
	}

	public int getCust_ID() {
		return Cust_ID;
	}

	public void setCust_ID(int cust_ID) {
		Cust_ID = cust_ID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String toString() {
		return "Account Number : " + getAccountNumber()
				+ "\nAccount Type : " + getType()
				+ "\nOpened On : " + getOpenedOn()
				+ "\nType : " + getType()
				+ "\nStatus : " + getStatus()
				+ "\nSaving Acc Info : " + getAccSav()
				+ "\nSaving Acc Info : " + getAccChk()
				+ "\nSaving Acc Info : " + getAccLoan();
	}
}
