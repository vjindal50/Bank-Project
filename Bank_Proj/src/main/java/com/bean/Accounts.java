package com.bean;

import java.util.Date;

public class Accounts {
	
	private int AccountNumber;
	private Date openedOn;
	private Date closedOn;
	private int Cust_ID;
	private String type;
	
	public Accounts() {}

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
	
	public String toString() {
		return "Account Number : " + getAccountNumber()
				+ "\nAccount Type : " + getType()
				+ "\nOpened On : " + getOpenedOn();
	}
}
