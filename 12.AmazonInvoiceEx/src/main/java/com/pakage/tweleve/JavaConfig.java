package com.pakage.tweleve;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
		public ProductBean getBean() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Your Product Id: ");
			int pid=scan.nextInt();
			System.out.println("Enter Your Product Name: ");
			String pname=scan.next();
			System.out.println("Enter Product Quantity: ");
			int pquantity=scan.nextInt();
			System.out.println("Enter Product Price: ");
			double pprice=scan.nextDouble();
			ProductBean pb=new ProductBean(pid,pname,pquantity,pprice);
			return pb;
		}
}
