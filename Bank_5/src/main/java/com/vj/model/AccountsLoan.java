package com.vj.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AccountsLoan")
public class AccountsLoan implements Serializable{
	
	@Id
	//@Column(name = "SNo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SNo;
	
	@Column(name = "ACC_NUM")
	private int ACC_NUM;
	
	@Column(name = "Balance")
	private double balance;
	
	@Column(name = "EMI")
	private double EMI;
	
	@Column(name = "LastEMIPayed")
	private String lastEMIPayed;
	
	@Column(name = "Interset")
	private double interest;
	
	@Column(name = "EMICounter")
	private int EMIcounter;
	
	@Column(name = "amountPayed")
	private double amountPayed;
	
	public AccountsLoan() {}

	public int getACC_NUM() {
		return ACC_NUM;
	}

	public void setACC_NUM(int aCC_NUM) {
		ACC_NUM = aCC_NUM;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getEMI() {
		return EMI;
	}

	public void setEMI(double eMI) {
		EMI = eMI;
	}

	public String getLastEMIPayed() {
		return lastEMIPayed;
	}

	public void setLastEMIPayed(String lastEMIPayed) {
		this.lastEMIPayed = lastEMIPayed;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public int getEMIcounter() {
		return EMIcounter;
	}

	public void setEMIcounter(int eMIcounter) {
		EMIcounter = eMIcounter;
	}

	public double getAmountPayed() {
		return amountPayed;
	}

	public void setAmountPayed(double amountPayed) {
		this.amountPayed = amountPayed;
	}
	
	public int getSNo() {
		return SNo;
	}

	public void setSNo(int sNo) {
		SNo = sNo;
	}

	public String toString() {
		return "Account Number : " + getACC_NUM()
				+ "\nBalance : " + getBalance()
				+ "\nEMI : " + getEMI()
				+ "\nInterest : " + getInterest()
				+ "\nEMI counter : " + getEMIcounter()
				+ "\nAmount Payed : " + getAmountPayed()
				+ "\nLast EMI payed on : " + getLastEMIPayed();
	}

}
