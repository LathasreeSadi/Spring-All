package com.mvn.Student.Student;

public class StudentConstructor {
	int Sid;
	String Sname;
	String Scourse;
	String Doj;
	String Batch;
	public StudentConstructor(int Sid, String Sname, String Scourse, String Doj, String Batch) {
		this.Sid=Sid;
		this.Sname=Sname;
		this.Scourse=Scourse;
		this.Doj=Doj;
		this.Batch=Batch;
	}
	public void print() {
		System.out.println(Sid);
		System.out.println(Sname);
		System.out.println(Scourse);
		System.out.println(Doj);
		System.out.println(Batch);
	}
}
