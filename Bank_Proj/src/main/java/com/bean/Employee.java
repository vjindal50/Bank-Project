package com.bean;

import java.util.Date;

public class Employee {
	
	private int EmpID;
	private String FirstName;
	private String LastName;
	private String MiddleName;
	private String Phone;
	private String AlternatePhone;
	private String Email;
	private String Address;
	private String Password;
	private String UserName;
	private Date JoinDate;
	private Date DOB;
	
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

	public Date getJoinDate() {
		return JoinDate;
	}

	public void setJoinDate(Date joinDate) {
		JoinDate = joinDate;
	}
	
	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String toString() {
		return "Emp ID : " + getEmpID()
				+ "\n Employee Name : " + getFirstName() + " " + getMiddleName() + " " + getLastName()
				+"\n Phone Number : " + getPhone()
				+"\n Alternate Phone : " + getAlternatePhone()
				+"\n Email : " + getEmail()
				+"\n DOB : " + getDOB()
				+"\n Address : " + getAddress()
				+"\n User Name : " + getUserName();
	}
}
