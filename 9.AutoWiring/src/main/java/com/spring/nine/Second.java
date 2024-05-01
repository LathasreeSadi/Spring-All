package com.spring.nine;

public class Second {
		private int id;
		private String name;
		private String course;
		public Second() {
			super();
		}
		public Second(int id, String name, String course) {
			super();
			this.id=id;
			this.name=name;
			this.course=course;
			System.out.println("I am Construntor");
		}
		public void setId(int id) {
			System.out.println("I am Setter Method");
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
}
