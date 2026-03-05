package com.javaconfig.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javabasedDI.beans.Address;
import com.javabasedDI.beans.Student;

@Configuration
public class AppConfig {
	
	@Bean
	public Address address1() {
	Address add1 = new Address(901,"Sardarpura B-Road","55/Gt",343009,"Jodhpur","Rajasthan");
		return add1;
	}
	
	@Bean
	public Student student1() {
		Student st = new Student(1,"Sameer",23,"sameer@gmail.com",87,address1());
		return st;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
// Dependency Injection using Setter methods
	
//	@Bean
//	public Address address1() {
//		Address add1 = new Address();
//		add1.setAdd_id(1);
//		add1.setFull_add("DPS Circle");
//		add1.setCity("Jodhpur");
//		add1.setPincode(342008);
//		add1.setPlotNo("34/B");
//		add1.setState("Rajasthan");
//		
//		return add1;
//	}
//	
//	@Bean
//	public Student student1() {
//		Student st = new Student();
//		st.setRoll_no(3);
//		st.setSt_name("Rohit");
//		st.setAge(23);
//		st.setEmail("Rohit@gmail.com");
//		st.setMarks(98);
//		st.setAddress(address1());
//		return st;
//	}
}
