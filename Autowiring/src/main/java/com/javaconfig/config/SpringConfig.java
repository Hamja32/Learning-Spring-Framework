package com.javaconfig.config;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.javabasedDI.beans.Address;
import com.javabasedDI.beans.Student;
import com.javabasedDI.beans.Subjects;

@Configuration
public class SpringConfig {
	@Bean
	public Address createAddressObj() {
		Address add = new Address();
		add.setPincode(3200);
		add.setCity("Jodhpur");
		add.setHouseno(12);
		return add;
	}
	@Bean
	public Address createAddressObj1() {
		Address add = new Address();
		add.setPincode(4100);
		add.setCity("Jaipur");
		add.setHouseno(03);
		return add;
	}
	
	@Bean
	public Student createStudentObj() {
		Student st = new Student();
		st.setName("Hamza");
		st.setRollno(123);
		return st;
	}
	@Bean
	public Subjects createSubjectObj() {
		Subjects sub = new Subjects();
		List<String> sub_list = new ArrayList<String>();
		sub_list.add("Mobile App Development");
		sub_list.add("Data Science with R");
		sub_list.add("Software Engineering");
		sub_list.add("Analysis and Design of Algorithm");
		sub.setSubjects(sub_list);
		return sub;
	}
}
