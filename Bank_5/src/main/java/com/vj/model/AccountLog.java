package com.vj.model;

import java.io.Serializable;

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
	private String LastAccess;
	
	@Column(name = "EMI")
	private double EMI;
	
	@Column(name = "LastEMIPayed")
	private String LastEMIPayed;
	
	@Column(name = "EMICounter")
	private int EMICounter;
	
	@Column(name = "amountPayed")
	private double amountPayed;
	
	@Column(name = "OpenedOn")
	private String OpenedOn;
	
	@Column(name = "ClosedOn")
	private String ClosedOn;
	
	@Column(name = "Cust_ID")
	private int Cust_ID;
	
	@Column(name = "Type")
	private String Type;
	
	@Column(name = "Command")
	private String Command;
	
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

	public String getLastAccess() {
		return LastAccess;
	}

	public void setLastAccess(String lastAccess) {
		LastAccess = lastAccess;
	}

	public double getEMI() {
		return EMI;
	}

	public void setEMI(double eMI) {
		EMI = eMI;
	}

	public String getLastEMIPayed() {
		return LastEMIPayed;
	}

	public void setLastEMIPayed(String lastEMIPayed) {
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

	public String getOpenedOn() {
		return OpenedOn;
	}

	public void setOpenedOn(String openedOn) {
		OpenedOn = openedOn;
	}

	public String getClosedOn() {
		return ClosedOn;
	}

	public void setClosedOn(String closedOn) {
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
	
	public String getCommand() {
		return Command;
	}

	public void setCommand(String command) {
		Command = command;
	}

	public String toString() {
		return "<div class=\"info\"><b>Log ID</b></div> : " + getAccLogID()
				+ "<br><div class=\"info\"><br>\n <b>Account Number</b></div> : " + getAnum()
				+ "<br><div class=\"info\"><br>\n <b>Balance</b></div> : " + getBalance()
				+ "<br><div class=\"info\"><br>\n <b>Withdraw Limit</b></div> : " + getWithdrawLimit()
				+ "<br><div class=\"info\"><br>\n <b>Over Draft Limit</b></div> : " + getOverDraft()
				+ "<br><div class=\"info\"><br>\n <b>Interest</b></div> : " + getInterset()
				+ "<br><div class=\"info\"><br>\n <b>Last Accessed</b></div> : " + getLastAccess()
				+ "<br><div class=\"info\"><br>\n <b>EMI</b></div> : " + getEMI()
				+ "<br><div class=\"info\"><br>\n <b>Last EMI Payed</b></div> : " + getLastEMIPayed()
				+ "<br><div class=\"info\"><br>\n <b>No. of EMI Payed</b></div> : " + getEMICounter()
				+ "<br><div class=\"info\"><br>\n <b>Amount Payed</b></div> : " + getAmountPayed()
				+ "<br><div class=\"info\"><br>\n <b>Opened On</b></div> : " + getOpenedOn()
				+ "<br><div class=\"info\"><br>\n <b>Closed On</b></div> : " + getClosedOn()
				+ "<br><div class=\"info\"><br>\n <b>Customer ID</b></div> : " + getCust_ID()
				+ "<br><div class=\"info\"><br>\n <b>Account Type</b></div> : " + getType()
				+ "<br><div class=\"info\"><br>\n <b>Command</b></div> : " + getCommand();
	}
}
