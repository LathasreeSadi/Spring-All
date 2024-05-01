package com.mvn.DependencyInjection;

public class Student {
	private String Sname;
	private String Sclass;
	private Marks Marks;
	/*public Student() {
		
	}
	public Student(String sname, String sclass, Marks marks) {
		this.Sname=sname;
		this.Sclass=sclass;
		this.Marks=marks;
	}*/
	
	public void setSname(String sname) {
		this.Sname=sname;
	}
	public String getSname() {
		return this.Sname=Sname;
	}
	public void setSclass(String sclass) {
		this.Sclass=sclass;
	}
	public String getSclass() {
		return this.Sclass=Sclass;
	}
	public void setMarks(Marks Marks) {
		this.Marks=Marks;
	}
	public Marks getMarks() {
		return this.Marks=Marks;
	}
}
