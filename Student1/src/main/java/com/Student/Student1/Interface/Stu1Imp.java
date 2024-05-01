package com.Student.Student1.Interface;

public class Stu1Imp implements Stu1Interface {
	private int rollno;
	private String name;
	private String course;
	private String batch;
	private String doj;
	private String location;

	public Stu1Imp() {
		
	}
	public Stu1Imp(int rollno, String name, String course, String batch, String doj, String location) {
		this.rollno=rollno;
		this.name=name;
		this.course=course;
		this.batch=batch;
		this.doj=doj;
		this.location=location;
	}

	@Override
	public void setrollno(int rollno) {
		this.rollno=rollno;

	}

	@Override
	public void setname(String name) {
		this.name=name;

	}

	@Override
	public void setcourse(String course) {
		this.course=course;

	}

	@Override
	public void setbatch(String batch) {
		this.batch=batch;

	}

	@Override
	public void setdoj(String doj) {
		this.doj=doj;

	}

	@Override
	public void setlocation(String location) {
		this.location=location;

	}

	@Override
	public int getrollno() {
		return this.rollno;
	}

	@Override
	public String getname() {
		
		return this.name;
	}

	@Override
	public String getcourse() {
		return this.course;
	}

	@Override
	public String getbatch() {
		return this.batch;
	}

	@Override
	public String getdoj() {
		return this.doj;
	}

	@Override
	public String getlocation() {
		return this.location;
	}

}
