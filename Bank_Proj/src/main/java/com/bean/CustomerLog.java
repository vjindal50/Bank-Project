package com.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.LocalDate;

@Entity
@Table(name = "CustomerLog")
public class CustomerLog implements Serializable{
	
	@Id
	@Column(name = "CustLogID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CustLogID;
	
	@Column(name = "CustID")
	private int CustID;
	
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
	
	@Column(name = "DelLocalDate")
	private LocalDate DelLocalDate;
	
	@Column(name = "JoinLocalDate")
	private LocalDate JoinLocalDate;
	
	@Column(name = "DOB")
	private LocalDate DOB;
	
	public CustomerLog(){
		
	}
	
//	public CustomerLog(String FirstName,String LastName,String MiddleName, String Phone,String AlternatePhone,
//			String Email,String Address,String Password,String UserName,String Command,String Status,LocalDate DelLocalDate){
//		this.FirstName=FirstName;
//		this.LastName=LastName;
//		this.MiddleName=MiddleName;
//		this.Phone=Phone;
//		this.AlternatePhone=AlternatePhone;
//		this.Email=Email;
//		this.Address=Address;
//		this.Password=Password;
//		this.UserName=UserName;
//		this.Command=Command;
//		this.Status=Status;
//		this.DelLocalDate=DelLocalDate;
//		
//	}

	public int getCustID() {
		return CustID;
	}

	public int getCustLogID() {
		return CustLogID;
	}

	public void setCustLogID(int custLogID) {
		CustLogID = custLogID;
	}

	public void setCustID(int custID) {
		CustID = custID;
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

	public LocalDate getJoinLocalDate() {
		return JoinLocalDate;
	}

	public void setJoinLocalDate(LocalDate joinLocalDate) {
		JoinLocalDate = joinLocalDate;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
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

	public LocalDate getDelLocalDate() {
		return DelLocalDate;
	}

	public void setDelLocalDate(LocalDate delLocalDate) {
		DelLocalDate = delLocalDate;
	}
	
	
	
}
