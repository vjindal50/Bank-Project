package bean;

import java.util.Date;

public class AccountsLoan {
	
	private int ACC_NUM;
	private double balance;
	private double EMI;
	private Date lastEMIPayed;
	private double interest;
	private int EMIcounter;
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

	public Date getLastEMIPayed() {
		return lastEMIPayed;
	}

	public void setLastEMIPayed(Date lastEMIPayed) {
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
