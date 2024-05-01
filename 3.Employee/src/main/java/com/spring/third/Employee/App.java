package com.spring.third.Employee;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
	/*
	 * public static void main( String[] args ) { Resource res=new
	 * ClassPathResource("springconfig.xml"); XmlBeanFactory factory=new
	 * XmlBeanFactory(res); EmployeeClass myEmp=(EmployeeClass)
	 * factory.getBean("abc"); myEmp.print(); }
	 */
    public static void main( String[] args )
    {
        Resource res=new FileSystemResource("C:\\Users\\lathasree\\OneDrive\\Desktop\\filesytem\\springconfig.xml.txt");
        XmlBeanFactory factory=new XmlBeanFactory(res);
        EmployeeClass myEmp=(EmployeeClass) factory.getBean("abc");
        myEmp.print();
    }
    
}
