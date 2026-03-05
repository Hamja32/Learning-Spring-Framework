package com.xmlconfig.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xmlconfig.beans.Student;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
		Student st = (Student) context.getBean("std1");
		st.display();
	}
}
