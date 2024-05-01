package com.spring.third.Employee;

public class EmployeeClass {
	private String name;
	private int id;
	private double salary;
	private int deptno;
	private String doj;
	public EmployeeClass() {
		super();
	}
	public EmployeeClass(String name, int id, double salary, int deptno, String doj) {
		super();
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.deptno=deptno;
		this.doj=doj;
	}
	public void setName(String Name) {
		this.name=Name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int Id) {
		this.id=Id;
	}
	public int getId() {
		return this.id;
	}
	public void setSalary(double Salary) {
		this.salary=Salary;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setDeptno(int Deptno) {
		this.deptno=Deptno;
	}
	public int getDeptno() {
		return this.deptno;
	}
	public void setDoj(String Doj) {
		this.doj=Doj;
	}
	public String getDoj() {
		return this.doj;
	}
	public void print() {
		System.out.println("\n Employee Details: ");
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee Depno: "+deptno);
		System.out.println("Employee Doj: "+doj);
	}
}
