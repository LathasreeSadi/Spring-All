package com.spring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
		   @Bean("id")
		   public StudentBean getBean() 
		   {
			   StudentBean bean=new StudentBean();
			   bean.setId(101);
			   bean.setName("Latha");
			   bean.setBatch("Batch-11");
			   bean.setCourse("Java Full Stack");
			   return bean;
		   }
		   @Bean("id2")
		   public StudentBean getBean2()
		   {
			   StudentBean bean2=new StudentBean();
			   bean2.setId(102);
			   bean2.setName("Teju");
			   bean2.setBatch("Batch-11");
			   bean2.setCourse("Java Full Stack");
			   return bean2;
		   }
}
