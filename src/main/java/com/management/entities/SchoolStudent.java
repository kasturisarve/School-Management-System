package com.management.entities;

public class SchoolStudent {

	
	 String sName;
	
	 String Password;
	 long Phone;
	 String Email;
	 String Gender;
	 String sAddress;
	 String  Branch;
	 long sId;
	 long timeTable;
	 
	 
	public SchoolStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SchoolStudent(String sName, String password, long phone, String email, String gender, String sAddress,
			String branch, long sId) {
		super();
		this.sName = sName;
		Password = password;
		Phone = phone;
		Email = email;
		Gender = gender;
		this.sAddress = sAddress;
		Branch = branch;
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public long getsId() {
		return sId;
	}
	public void setsId(long sId) {
		this.sId = sId;
	}
	 
	 
	 
	

}
