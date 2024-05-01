package com.spring.nine;

public class First {
	private Second second;
		public First() {
			super();
		}
		public First(Second second) {
			super();
			this.second=second;
		}
		public void setSecond(Second second){
			this.second=second;
		}
		public Second getSecond() {
			return this.second;
		}
		public void print() {
			System.out.println("\n Student Details: ");
			System.out.println("Id: "+second.getId());
			System.out.println("Name: "+second.getName());
			System.out.println("Course: "+second.getCourse());
		}
}
