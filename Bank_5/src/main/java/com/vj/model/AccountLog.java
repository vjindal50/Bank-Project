package com.vj.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AccountLog")
public class AccountLog implements Serializable {
	
	
	@Id
	//@Column(name = "AccLogID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AccLogID;
	
	@Column(name = "Anum")
	private int Anum;
	
	@Column(name = "Balance")
	private double Balance;
	
	@Column(name = "WithdrawLimit")
	private double WithdrawLimit;
	
	@Column(name = "OverDraft")
	private double OverDraft;
	
	@Column(name = "Interset")
	private double Interset;
	
	@Column(name = "LastAccess")
	private Date LastAccess;
	
	@Column(name = "EMI")
	private double EMI;
	
	@Column(name = "LastEMIPayed")
	private Date LastEMIPayed;
	
	@Column(name = "EMICounter")
	private int EMICounter;
	
	@Column(name = "amountPayed")
	private double amountPayed;
	
	@Column(name = "OpenedOn")
	private Date OpenedOn;
	
	@Column(name = "ClosedOn")
	private Date ClosedOn;
	
	@Column(name = "Cust_ID")
	private int Cust_ID;
	
	@Column(name = "Type")
	private String Type;
	
	public AccountLog() {}

	public int getAccLogID() {
		return AccLogID;
	}

	public void setAccLogID(int accLogID) {
		AccLogID = accLogID;
	}

	public int getAnum() {
		return Anum;
	}

	public void setAnum(int anum) {
		Anum = anum;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public double getWithdrawLimit() {
		return WithdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		WithdrawLimit = withdrawLimit;
	}

	public double getOverDraft() {
		return OverDraft;
	}

	public void setOverDraft(double overDraft) {
		OverDraft = overDraft;
	}

	public double getInterset() {
		return Interset;
	}

	public void setInterset(double interset) {
		Interset = interset;
	}

	public Date getLastAccess() {
		return LastAccess;
	}

	public void setLastAccess(Date lastAccess) {
		LastAccess = lastAccess;
	}

	public double getEMI() {
		return EMI;
	}

	public void setEMI(double eMI) {
		EMI = eMI;
	}

	public Date getLastEMIPayed() {
		return LastEMIPayed;
	}

	public void setLastEMIPayed(Date lastEMIPayed) {
		LastEMIPayed = lastEMIPayed;
	}

	public int getEMICounter() {
		return EMICounter;
	}

	public void setEMICounter(int eMICounter) {
		EMICounter = eMICounter;
	}

	public double getAmountPayed() {
		return amountPayed;
	}

	public void setAmountPayed(double amountPayed) {
		this.amountPayed = amountPayed;
	}

	public Date getOpenedOn() {
		return OpenedOn;
	}

	public void setOpenedOn(Date openedOn) {
		OpenedOn = openedOn;
	}

	public Date getClosedOn() {
		return ClosedOn;
	}

	public void setClosedOn(Date closedOn) {
		ClosedOn = closedOn;
	}

	public int getCust_ID() {
		return Cust_ID;
	}

	public void setCust_ID(int cust_ID) {
		Cust_ID = cust_ID;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	
	public String toString() {
		return "Log ID : " + getAccLogID()
				+ "\nAccount Number : " + getAnum()
				+ "\nBalance : " + getBalance()
				+ "\nWithdraw Limit : " + getWithdrawLimit()
				+ "\nOver Draft : " + getOverDraft()
				+ "\nInterest : " + getInterset()
				+ "\nLast Access : " + getLastAccess()
				+ "\nEMI : " + getEMI()
				+ "\nLast EMI payed : " + getLastEMIPayed()
				+ "\nEMI counter : " + getEMICounter()
				+ "\nAmount Payed : " + getAmountPayed()
				+ "\nOpened On : " + getOpenedOn()
				+ "\nClosed On : " + getClosedOn()
				+ "\nCustomer ID : " + getCust_ID()
				+ "\nAccount type : " + getType();
	}
}