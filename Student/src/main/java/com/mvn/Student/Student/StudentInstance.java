package com.mvn.Student.Student;

public class StudentInstance {
	int Sid;
	String Sname;
	String Scourse;
	String Doj;
	String Batch;
	public static void main(String[] args)
	{
		StudentInstance s=new StudentInstance();
		s.Sid=101;
		s.Sname="Latha";
		s.Scourse="Java";
		s.Doj="01-11-2023";
		s.Batch="Batch-11";
		System.out.println("Student Id:"+s.Sid);
		System.out.println("Student Name:"+s.Sname);
		System.out.println("Student Course:"+s.Scourse);
		System.out.println("Student DateOfJoin:"+s.Doj);
		System.out.println("Student Batch:"+s.Batch);
	}
}
