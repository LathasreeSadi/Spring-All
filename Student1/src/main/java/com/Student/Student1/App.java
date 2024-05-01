package com.Student.Student1;

import com.Student.Student1.Interface.Stu1Imp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    /*{
        Stu1 stu=new Stu1(101,"Latha","Java","Batch-11","01-11-2023","Hyderabad");
        System.out.println("Student Rollno: "+stu.getrollno());
        System.out.println("Student Name: "+stu.getname());
        System.out.println("Student Course: "+stu.getcourse());
        System.out.println("Student Batch: "+stu.getbatch());
        System.out.println("Student DOJ: "+stu.getdoj());
        System.out.println("Student Location: "+stu.getlocation());
        stu.setRollno(11);
        stu.setName("Latha sree");
        stu.setLocation("Bangalore");
        System.out.println("\n Updated Details of Student: ");
        System.out.println("Student Rollno: "+stu.getrollno());
        System.out.println("Student Name: "+stu.getname());
        System.out.println("Student Location: "+stu.getlocation());
    }*/
    {
    	Stu1Imp stuI=new Stu1Imp(102,"Hyndavi","Python","Batch-12","01-02-2026","Mumbai");
    	System.out.println("Student Rollno: "+stuI.getrollno());
    	System.out.println("Student Name: "+stuI.getname());
    	System.out.println("Student Course: "+stuI.getcourse());
    	System.out.println("Student Batch: "+stuI.getbatch());
    	System.out.println("Student DOJ: "+stuI.getdoj());
    	System.out.println("Student Location: "+stuI.getlocation());
    	stuI.setrollno(12);
    	stuI.setname("Hyndavi Sadi");
    	stuI.setlocation("USA");
    	System.out.println("\n Updated Details Of Student:  ");
    	System.out.println("Student Rollno: "+stuI.getrollno());
    	System.out.println("Student Name: "+stuI.getname());
    	System.out.println("Student Location: "+stuI.getlocation());
    }
}