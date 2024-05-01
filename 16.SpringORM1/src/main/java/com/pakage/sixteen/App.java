package com.pakage.sixteen;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pakage.sixteen.dao.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig1.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("empDao");
		EmployeeBean emp = new EmployeeBean();

		/*
		 * emp.setId(104); emp.setName("LathaSree"); emp.setSalary(45000.50);
		 * 
		 * 
		 * emp.setId(105); emp.setName("Tejaswi"); emp.setSalary(48000.56);
		 * 
		 * emp.setId(106); emp.setName("Hyndu"); emp.setSalary(50000.86);
		 * 
		 * dao.saveEmployee(emp);
		 */
		
		/*
		 * EmployeeBean i= dao.viewEmployee(101); System.out.println(i);
		 */
		
		//dao.deleteEmployee(101);
		/*
		 * dao.deleteEmployee(103); System.out.println("Deleted Successfully");
		 */
		/*
		 * EmployeeBean employee=dao.viewEmployee(106); employee.setName("Hyndavi");
		 * employee.setSalary(550000.86); dao.updateEmployee(employee);
		 * System.out.println("Updated Successfully");
		 */
		List<EmployeeBean> emp1=dao.EmployeeAll();
		System.out.println(emp1);
	}
}
