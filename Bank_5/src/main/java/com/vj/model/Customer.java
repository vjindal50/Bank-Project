package com.vj.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer implements Serializable{
	
	 @Id
	//@Column(name = "CustID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@Column(name = "JoinDate")
	private String JoinDate;
	
	@Column(name = "DOB")
	private String DOB;
	
	@Column(name = "Status")
	private String Status;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "Cust_ID", updatable = false)
	private List<Accounts> acc;
	
	public Customer() {}

	public int getCustID() {
		return CustID;
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

	public List<Accounts> getAcc() {
		return acc;
	}

	public void setAcc(List<Accounts> acc) {
		this.acc = acc;
	}

	public String toString() {
		return "<div class=\"info\"><b>Cust ID</b></div> : " + getCustID()
				+ "<br><div class=\"info\"><br>\n <b>Cust Name</b></div> : " + getFirstName() + " " + getMiddleName() + " " + getLastName()
				+"<br><div class=\"info\"><br>\n <b>Phone Number</b></div> : " + getPhone()
				+"<br><div class=\"info\"><br>\n <b>Alternate Phone </b></div> : " + getAlternatePhone()
				+"<br><div class=\"info\"><br>\n <b>Email </b></div> : " + getEmail()
				+"<br><div class=\"info\"><br>\n <b>DOB </b></div> : " + getDOB()
				+"<br><div class=\"info\"><br>\n <b>Address </b></div> : " + getAddress()
				+"<br><div class=\"info\"><br>\n <b>User Name </b></div> : " + getUserName()
				+"<br><div class=\"info\"><br>\n <b>Status </b></div> : " + getStatus() ;
	}

}
