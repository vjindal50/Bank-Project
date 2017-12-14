package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.LocalDate;

@Entity
@Table(name = "Accounts")
public class Accounts {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int AccountNumber;
	
	@Column(name = "OpenedOn")
	private LocalDate openedOn;
	
	@Column(name = "ClosedOn")
	private LocalDate closedOn;
	
	@Column(name = "Cust_ID")
	private int Cust_ID;
	
	@Column(name = "Type")
	private String type;
	
	public Accounts() {}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public LocalDate getOpenedOn() {
		return openedOn;
	}

	public void setOpenedOn(LocalDate openedOn) {
		this.openedOn = openedOn;
	}

	public LocalDate getClosedOn() {
		return closedOn;
	}

	public void setClosedOn(LocalDate closedOn) {
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
				+ "\nOpened On : " + getOpenedOn()
				+ "\nType : " + getType();
	}
}
