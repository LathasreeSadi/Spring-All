package com.spring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Employee getBean() {
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("LathaSree");
		emp.setAddress(getBean1());
		return emp;
	}
	@Bean
	public Address getBean1() {
		Address add= new Address();
		add.setCity("Hyderabad");
		add.setColony("Punjagutta Officer's Colony");
		add.setState("Telangana");
		add.setPincode(500016);
		return add;
	}
}
