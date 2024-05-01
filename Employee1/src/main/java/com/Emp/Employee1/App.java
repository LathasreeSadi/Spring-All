package com.Emp.Employee1;

import com.Emp.Employee1.Interface.Emp1Imp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    /*{
    	//create an emp1 object using parameterized constructor
        Emp1 emp=new Emp1("Latha",21,35000.52);
        //display emp1 information 
        System.out.println("Employee Name: "+emp.getName());
        System.out.println("Employee Age: "+emp.getAge());
        System.out.println("Employee Salary: "+emp.getSalary());
        
        //Update emp1 information using setter methods
        emp.setName("Lathasree");
        emp.setAge(22);
        emp.setSalary(45000.00);
        
        //Display updated emp1 information
        System.out.println("\n Updated Emp1 Information: ");
        System.out.println("Employee Name: "+emp.getName());
        System.out.println("Employee Age: "+emp.getAge());
        System.out.println("Employee Salary: "+emp.getSalary());
    }*/
    {
    	Emp1Imp empI=new Emp1Imp("Hyndavi",20,32000.00);
    	System.out.println("Employee Name: "+empI.getName());
    	System.out.println("Employee Age: "+empI.getAge());
    	System.out.println("Employee Salary: "+empI.getSalary());
    	empI.setName("Hyndavi Sadi");
    	empI.setAge(21);
    	empI.setSalary(50000.2);
    	System.out.println("\n Updated Employee Details: ");
    	System.out.println("Employee Name: "+empI.getName());
    	System.out.println("Employee Age: "+empI.getAge());
    	System.out.println("Employee Salary: "+empI.getSalary());
    	
    }
    
}
