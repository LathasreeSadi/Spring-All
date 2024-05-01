package com.mvn.Emploee.Employee;

public class EmployeeClassMehods {
	int Empid;
	String Empname;
	public void insert(int empid,String empname)
	{
		 Empid=empid;
		 Empname=empname;
	}
	public void print()
	{
		System.out.println(Empid);
		System.out.println(Empname);
	}
}
