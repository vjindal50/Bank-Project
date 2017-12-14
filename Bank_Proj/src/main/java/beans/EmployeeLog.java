package beans;

import java.util.Date;

public class EmployeeLog {

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
	private String Command; 
	private String Status;
	private String LeftDate; 
	private Date JoinDate;
	
	public EmployeeLog(){
		
	}
	
	public EmployeeLog(String FirstName,String LastName,String MiddleName,String Phone,String AlternatePhone,String Email,String Address,String Password,String UserName,String Command,String Status,
			String LeftDate,Date JoinDate){
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

	public void setLeftDate(String leftDate) {
		LeftDate = leftDate;
	}

	public Date getJoinDate() {
		return JoinDate;
	}

	public void setJoinDate(Date joinDate) {
		JoinDate = joinDate;
	}
	
}
