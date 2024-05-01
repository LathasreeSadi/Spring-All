package com.mvn.DependencyInjection;

public class School {
	private String Slname;
	private Student Student;
	/*public School() {
		
	}
	public School(String slname, Student student) {
		this.Slname=slname;
		this.Student=student;
	}*/
	public void setSlname(String Slname) {
		this.Slname=Slname;
	}
	public String getSlname() {
		return this.Slname=Slname;
	}
	public void setStudent(Student Student) {
		this.Student=Student;
	}
	public Student getStudent() {
		return this.Student=Student;
	}
	public void print() {
		System.out.println("School Name: "+Slname);
		System.out.println("Student Detais: ");
		System.out.println("Student Name: "+Student.getSname());
		System.out.println("Student Class: "+Student.getSclass());
		System.out.println("\n Marks of the Student: "+Student.getSname());
		System.out.println("Marks in Maths: "+Student.getMarks().getMaths());
		System.out.println("Marks in Physics: "+Student.getMarks().getPhysics());
		System.out.println("Marks in Chemistry: "+Student.getMarks().getChemistry());
		
	}
}
