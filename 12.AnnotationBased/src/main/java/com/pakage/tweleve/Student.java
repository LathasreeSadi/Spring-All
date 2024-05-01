package com.pakage.tweleve;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("101")
		private int id;
	@Value("LathaSree")
		private String name;
	@Value("Java Full Stack")
		private String course;
	@Value("Batch-11")
		private String batch;
		public Student() {
			super();
		}
		public Student(int id, String name, String course, String batch) {
			super();
			this.id=id;
			this.name=name;
			this.course=course;
			this.batch=batch;
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
		public void setCourse(String course) {
			this.course=course;
		}
		public String getCourse() {
			return this.course;
		}
		public void setBatch(String batch) {
			this.batch=batch;
		}
		public String getBatch() {
			return this.batch;
		}
		public void print() {
			System.out.println("Student Id: "+id);
			System.out.println("Student Name: "+name);
			System.out.println("Student Course: "+course);
			System.out.println("Student Batch: "+batch);
		}
}
