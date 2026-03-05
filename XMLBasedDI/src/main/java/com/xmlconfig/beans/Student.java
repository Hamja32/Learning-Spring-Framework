package com.xmlconfig.beans;
public class Student {
	private int roll_no;
	private String st_name;
	private String email;
	private Address address;
	
	
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	
//	public int getRoll_no() {
//		return roll_no;
//	}
//	public void setRoll_no(int roll_no) {
//		this.roll_no = roll_no;
//	}
//	public String getSt_name() {
//		return st_name;
//	}
//	public void setSt_name(String st_name) {
//		this.st_name = st_name;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
	
	public void display() {
		System.out.println("Student Information");
		System.out.println("Name : " + st_name);
		System.out.println("Roll No : " + roll_no);
		System.out.println("Email : " + email);
		System.out.println("Address : " + address);
		System.out.println("-----------------------------");
	}


public Student(int roll_no, String st_name, String email, Address address) {
	super();
	this.roll_no = roll_no;
	this.st_name = st_name;
	this.email = email;
	this.address = address;
}
	
	
}
