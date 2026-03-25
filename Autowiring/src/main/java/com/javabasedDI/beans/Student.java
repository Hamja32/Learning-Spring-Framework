package com.javabasedDI.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int rollno;
	private String name;
	
	@Autowired
	@Qualifier("createAddressObj1")
	private Address address;
	
	@Autowired
	private Subjects subjects;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("Name : " + name + "\nRoll No : " + rollno + "\nAddress : " + address + "\nSubjects : " + subjects);
	}
}

