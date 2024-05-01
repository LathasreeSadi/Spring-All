package com.pakage.tweleve;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("101")
	private int id;
	@Value("LathaSree")
	private String name;
	@Value("Developer")
	private String job;
	@Value("45000.23")
	private double salary;
	public Employee() {
		super();
	}
	public Employee( int id, String name, String job, double salary) {
		super();
		this.id=id;
		this.name=name;
		this.job=job;
		this.salary=salary;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public String getJob() {
		return this.job;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return this.salary;
	}
	public void print() {
		System.out.println("\n Employee Details: ");
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Job: "+job);
		System.out.println("Employee Salary: "+salary);
	}
}
