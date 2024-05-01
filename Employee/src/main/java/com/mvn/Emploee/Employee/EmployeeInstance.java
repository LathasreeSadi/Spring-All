package com.mvn.Emploee.Employee;

public class EmployeeInstance {
	int Empid;
	String Empname;
	public static void main(String[] args)
	{
		EmployeeInstance e= new EmployeeInstance();
		e.Empid=101;
		e.Empname="Latha";
		System.out.println(e.Empid);
		System.out.println(e.Empname);
	}
}
