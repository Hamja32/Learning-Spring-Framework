package com.javaconfig.beans;

public class Student {
	private int roll_no;
	private String st_name;
	private int age;
	private String email;
	private String address;
	private int marks;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void display() {
		System.out.println("Student Information");
		System.out.println("Name : " + st_name);
		System.out.println("Age : " + age);
		System.out.println("Address : " + address);
		System.out.println("Roll NO : " + roll_no);
		System.out.println("Email : " + email);
		System.out.println("Marks : " + marks);
	}
}
