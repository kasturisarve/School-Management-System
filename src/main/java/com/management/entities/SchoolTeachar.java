package com.management.entities;

public class SchoolTeachar {

	int tId; //Camel  Case
	String tName;
	String password;
	String tBranch;
	String tGender;
	double Salary;
	
	public SchoolTeachar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SchoolTeachar(int tId, String tName, String password, String tBranch, String tGender, double salary) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.password = password;
		this.tBranch = tBranch;
		this.tGender = tGender;
		Salary = salary;
	}
	
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String gettBranch() {
		return tBranch;
	}
	public void settBranch(String tBranch) {
		this.tBranch = tBranch;
	}
	public String gettGender() {
		return tGender;
	}
	public void settGender(String tGender) {
		this.tGender = tGender;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	
	
}
