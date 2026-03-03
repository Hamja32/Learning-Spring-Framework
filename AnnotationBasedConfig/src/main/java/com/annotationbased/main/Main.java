package com.annotationbased.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotationbased.beans.Student;
import com.annotationbased.config.AppConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student st = (Student) context.getBean("student");
		st.display();
	}
}
