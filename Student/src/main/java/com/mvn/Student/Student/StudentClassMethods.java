package com.mvn.Student.Student;

public class StudentClassMethods {
	int Sid;
	String Sname;
	String Scourse;
	String Doj;
	String Batch;
	public void insert(int sid, String sname, String scourse, String doj, String batch) {
		Sid=sid;
		Sname=sname;
		Scourse=scourse;
		Doj=doj;
		Batch=batch;
	}
	public void print()
	{
		System.out.println(Sid);
		System.out.println(Sname);
		System.out.println(Scourse);
		System.out.println(Doj);
		System.out.println(Batch);
	}
}
