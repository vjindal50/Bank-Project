package com.vj.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "EmpID")
	private int EmpID;
	
	@Column(name = "FirstName")
	private String FirstName;
	
	@Column(name = "LastName")
	private String LastName;
	
	@Column(name = "MiddleName")
	private String MiddleName;
	
	@Column(name = "Phone")
	private String Phone;
	
	@Column(name = "AlternatePhone")
	private String AlternatePhone;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Address")
	private String Address;
	
	@Column(name = "Password")
	private String Password;
	
	@Column(name = "UserName")
	private String UserName;
	
	@Column(name = "JoinDate")
	private String JoinDate;
	
	@Column(name = "DOB")
	private String DOB;
	
	@Column(name = "Status")
	private String Status;
	
	public Employee() {}

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		EmpID = empID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAlternatePhone() {
		return AlternatePhone;
	}

	public void setAlternatePhone(String alternatePhone) {
		AlternatePhone = alternatePhone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getJoinDate() {
		return JoinDate;
	}

	public void setJoinDate(String joinDate) {
		JoinDate = joinDate;
	}
	
	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String toString() {
		return "Employee ID : " + getEmpID()
				+ "\n Employee Name : " + getFirstName() + " " + getMiddleName() + " " + getLastName()
				+"\n Phone Number : " + getPhone()
				+"\n Alternate Phone : " + getAlternatePhone()
				+"\n Email : " + getEmail()
				+"\n DOB : " + getDOB()
				+"\n Address : " + getAddress()
				+"\n User Name : " + getUserName()
				+"\n Password : " + getPassword()
				+"\n JoinString : " + getJoinDate()
				+"\n Status : " + getStatus();
	}
}
