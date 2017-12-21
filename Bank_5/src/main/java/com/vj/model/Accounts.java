package com.vj.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	private String openedOn;
	
	@Column(name = "ClosedOn")
	private String closedOn;
	
	@Column(name = "Cust_ID")
	private int Cust_ID;
	
	@Column(name = "Type")
	private String type;
	
	@Column(name = "Status")
	private String Status;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "Account_Number")
	private List<AccountSavings> accSav;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "AccNumber")
	private List<AccountsChecking> accChk;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "ACC_NUM")
	private List<AccountsLoan> accLoan;
	
	public Accounts() {}
	
	public List<AccountSavings>getAccSav() {
		return accSav;
	}

	public void setAccSav(List<AccountSavings> accSav) {
		this.accSav = accSav;
	}
	
	public List<AccountsChecking> getAccChk() {
		return accChk;
	}

	public void setAccChk(List<AccountsChecking> accChk) {
		this.accChk = accChk;
	}
	
	public List<AccountsLoan> getAccLoan() {
		return accLoan;
	}

	public void setAccLoan(List<AccountsLoan> accLoan) {
		this.accLoan = accLoan;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getOpenedOn() {
		return openedOn;
	}

	public void setOpenedOn(String openedOn) {
		this.openedOn = openedOn;
	}

	public String getClosedOn() {
		return closedOn;
	}

	public void setClosedOn(String closedOn) {
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
		String result = "Account Number : " + getAccountNumber()
				+ "<br>\nAccount Type : " + getType()
				+ "<br>\nOpened On : " + getOpenedOn()
				+ "<br>\nType : " + getType()
				+ "<br>\nStatus : " + getStatus();
		
		if (getAccSav().size()>0) {
			result += "<br>\nSaving Acc Info : " + getAccSav();
		}
		if (getAccChk().size()>0) {
			result += "<br>\nChecking Acc Info : " + getAccChk();
		}
		if (getAccLoan().size()>0) {
			result += "<br>\nLoan Acc Info : " + getAccLoan();
		}
				
		return result;	
	}
}
