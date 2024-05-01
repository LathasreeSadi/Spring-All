package com.pakage.fifteen.SpringORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pakage.fifteen.SpringORM.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("springconfig.xml");
		StudentDao dao=(StudentDao) context.getBean("stDao");
		StudentBean std=new StudentBean();
		
		/*
		 * std.setId(101); std.setName("Latha"); std.setCourse("Java Full Stack");
		 * std.setId(102); std.setName("Tejaswi"); std.setCourse("Java Full Stack"); 
		 * std.setId(103); std.setName("Amar"); std.setCourse("Java Full Stack");
		 * 
		 * dao.saveStudent(std);
		 */
		/*
		 * StudentBean i=dao.viewStudent(101); System.out.println(i);
		 */
		/*
		 * dao.deleteStudent(103); System.out.println("Deleted");
		 */
		/*
		 * List<StudentBean>st=dao.StudentAll(); System.out.println(st);
		 */
		
		  StudentBean student=dao.viewStudent(101);
		  //student.setId(103);
		  student.setName("LathaSree");
		  student.setCourse("Python Full Stack");
		  dao.updateStudent(student); 
		  System.out.println("Updated Successfully");
		 
    }
}
