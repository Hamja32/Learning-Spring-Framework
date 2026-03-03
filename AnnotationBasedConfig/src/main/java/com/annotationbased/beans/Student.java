package com.annotationbased.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Hamza")
	private String st_name;

	@Value("504")
	private int roll_no;

	@Value("96.5f")
	private float marks;

	public void display() {
		System.out.println("Student Information using Annotation Based Configuration");
		System.out.println("Name : " + st_name);
		System.out.println("Roll No : " + roll_no);
		System.out.println("Marks : " + marks);
		System.out.println("--------------------------");
	}

	public String getSt_name() {
		return st_name;
	}

	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

}
