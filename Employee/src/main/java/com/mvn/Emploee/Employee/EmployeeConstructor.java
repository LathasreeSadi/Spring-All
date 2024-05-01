package com.mvn.Emploee.Employee;

public class EmployeeConstructor {
	int empId;
	String empName;
	public EmployeeConstructor(int empId, String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	public void print()
	{
	System.out.println(empId);
	System.out.println(empName);
}
}
