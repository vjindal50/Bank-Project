package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CustomerStatus")
public class CustomerStatus {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CustID")
	private int CustID; 
	
	@Column(name = "Status")
	private String Status;
	
	public int getCustID() {
		return CustID;
	}
	public void setCustID(int custID) {
		CustID = custID;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	public CustomerStatus(){}
	
	public String toString() {
		return "Customer ID : " + getCustID()
				+ "\nStatus : " + getStatus();
				
	}
}
