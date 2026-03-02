package com.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javaconfig.beans.Student;

@Configuration
public class AppConfig {

	
	@Bean
	public Student student1() {
		Student st = new Student();
		st.setRoll_no(3);
		st.setSt_name("Rohit");
		st.setAge(23);
		st.setEmail("Rohit@gmail.com");
		st.setMarks(98);
		st.setAddress("Dev Nagar Jodhpur");
		return st;
	}
}
