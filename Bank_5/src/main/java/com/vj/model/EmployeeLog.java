package com.vj.model;

import java.io.Serializable;

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
	private String LeftDate; 
	
	@Column(name = "JoinDate")
	private String JoinDate;
	
	@Column(name = "DOB")
	private String DOB;
	
	public EmployeeLog(){
		
	}
	
//	public EmployeeLog(String FirstName,String LastName,String MiddleName,String Phone,String AlternatePhone,String Email,String Address,String Password,String UserName,String Command,String Status,
//			String LeftString,String JoinString){
//		this.FirstName=FirstName;
//		this.LastName=LastName;
//		this.MiddleName=MiddleName;
//		this.Phone=Phone;
//		this.AlternatePhone=AlternatePhone;
//		this.Email=Email;
//		this.Address=Address ;
//		this.Password=Password;
//		this.UserName=UserName;
//		this.Command=Command;
//		this.Status=Status;
//		this.LeftDate=LeftDate;
//		this.JoinDate=JoinDate;
//		
//				
//	}
	
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

	public String getLeftDate() {
		return LeftDate;
	}

	public void setLeftString(String leftDate) {
		LeftDate = leftDate;
	}

	public String getJoinDate() {
		return JoinDate;
	}

	public void setJoinString(String joinDate) {
		JoinDate = joinDate;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public void setLeftDate(String leftDate) {
		LeftDate = leftDate;
	}

	public void setJoinDate(String joinDate) {
		JoinDate = joinDate;
	}

	public String toString() {
		return "<br><div class=\"info\"><b>Log ID</b></div> : " + getEmpLogID()
				+ "<br><br><div class=\"info\"><b>Employee ID</b></div> : " + getEmpID()
				+ "<br><br><div class=\"info\"><b>Full Name</b></div> : " + getFirstName() + " " + getMiddleName() + " " + getLastName()
				+ "<br><br><div class=\"info\"><b>Phone</b></div> : " + getPhone()
				+ "<br><br><div class=\"info\"><b>Alt Phone</b></div> : " + getAlternatePhone()
				+ "<br><br><div class=\"info\"><b>Email</b></div> : " + getEmail()
				+ "<br><br><div class=\"info\"><b>Address</b></div> : " + getAddress()
				+ "<br><br><div class=\"info\"><b>Password</b></div> : " + getPassword()
				+ "<br><br><div class=\"info\"><b>User Name</b></div> : " + getUserName()
				+ "<br><br><div class=\"info\"><b>Command</b></div> : " + getCommand()
				+ "<br><br><div class=\"info\"><b>Status</b></div> : " + getStatus()
				+ "<br><br><div class=\"info\"><b>LeftDate</b></div> : " + getLeftDate()
				+ "<br><br><div class=\"info\"><b>Join Date</b></div> : " + getJoinDate();
	}
	
}
