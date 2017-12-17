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
@Table(name = "EmployeeLog")
public class EmployeeLog implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "EmpLogID")
	private int EmpLogID;
	
	@Column(name = "EmpID")
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
	
	@Column(name = "Command")
	private String Command; 
	
	@Column(name = "Status")
	private String Status;
	
	@Column(name = "LeftDate")
	private Date LeftDate; 
	
	@Column(name = "JoinDate")
	private Date JoinDate;
	
	public EmployeeLog(){
		
	}
	
	public EmployeeLog(String FirstName,String LastName,String MiddleName,String Phone,String AlternatePhone,String Email,String Address,String Password,String UserName,String Command,String Status,
			Date LeftDate,Date JoinDate){
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.MiddleName=MiddleName;
		this.Phone=Phone;
		this.AlternatePhone=AlternatePhone;
		this.Email=Email;
		this.Address=Address ;
		this.Password=Password;
		this.UserName=UserName;
		this.Command=Command;
		this.Status=Status;
		this.LeftDate=LeftDate;
		this.JoinDate=JoinDate;
		
				
	}
	
	public int getEmpLogID() {
		return EmpLogID;
	}

	public void setEmpLogID(int empLogID) {
		EmpLogID = empLogID;
	}

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

	public String getCommand() {
		return Command;
	}

	public void setCommand(String command) {
		Command = command;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Date getLeftDate() {
		return LeftDate;
	}

	public void setLeftDate(Date leftDate) {
		LeftDate = leftDate;
	}

	public Date getJoinDate() {
		return JoinDate;
	}

	public void setJoinDate(Date joinDate) {
		JoinDate = joinDate;
	}
	
	

	public String toString() {
		return "Employee Log ID : " + getEmpLogID()
				+ "\nEmployee ID : " + getEmpID()
				+ "Employee Name : " + getFirstName() + " " + getMiddleName() + " " + getLastName()
				+ "\nPhone : " + getPhone()
				+ "\nAlternate Phone : " + getAlternatePhone()
				+ "\nEmail : " + getEmail()
				+ "\nAddress : " + getAddress()
				+ "\nPassword" + getPassword()
				+ "\nUser Name : " + getUserName()
				+ "\nCommand : " + getCommand()
				+ "\nStatus : " + getStatus()
				+ "\nLeft Date : " + getLeftDate()
				+ "\nJoin Date : " + getJoinDate();
	}
	
}
