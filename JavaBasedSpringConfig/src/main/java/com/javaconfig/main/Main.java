package com.javaconfig.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javaconfig.beans.Student;
import com.javaconfig.config.AppConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student s1 = (Student) context.getBean("student1");
		s1.display();
	}
}
