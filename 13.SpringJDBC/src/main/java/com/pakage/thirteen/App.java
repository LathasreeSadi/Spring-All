package com.pakage.thirteen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		Student st = (Student) context.getBean("jdbcId3");
		/*
		 * st.create(); st.insert();
		 *  st.delete(); 
		 *  */
		  //st.updateRecord();
		 
		 //st.getRecord();
		 
			st.getAllRecords();
	}
}
