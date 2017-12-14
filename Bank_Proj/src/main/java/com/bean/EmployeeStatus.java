package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeStatus")
public class EmployeeStatus {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int EmpID; 
	
	@Column(name = "Status")
	private String Status;
	
	
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	public EmployeeStatus(){}
	
	public String toString() {
		return "Employee ID : " + getEmpID()
				+ "\nStatus : " + getStatus();
				
	}
	
}
