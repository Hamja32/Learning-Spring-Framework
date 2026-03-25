package com.javaconfig.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javabasedDI.beans.Student;
import com.javaconfig.config.AppConfig;
import com.javaconfig.config.SpringConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student std = context.getBean(Student.class);
		std.show();
	}
}
