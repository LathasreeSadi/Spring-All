package com.spring.javabased;

public class StudentBean {
		private int id;
		private String name;
		private String batch;
		private String course;
		public StudentBean()
		{
			super();
		}
		public StudentBean(int id, String name, String batch, String course) {
			super();
			this.id=id;
			this.name=name;
			this.batch=batch;
			this.course=course;
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
		public void setBatch(String batch) {
			this.batch=batch;
		}
		public String getBatch() {
			return this.batch;
		}
		public void setCourse(String course) {
			this.course=course;
		}
		public String getCourse() {
			return this.course;
		}
		public void display() {
			System.out.println("\n Student Details: ");
			System.out.println("Student Id: "+ id);
			System.out.println("Student Name: "+ name);
			System.out.println("Student Batch: "+ batch);
			System.out.println("Student Course: "+course);
		}
}
