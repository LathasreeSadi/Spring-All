package com.spring.eight;

import java.util.Map;

public class AmeerpetTechnologies {
		private Map<String,String>StudentCourses;
		public AmeerpetTechnologies() {
			super();
		}
		public AmeerpetTechnologies(Map<String,String> StudentCourses) {
			super();
			this.StudentCourses=StudentCourses;
		}
		public void setStudentCourses(Map<String,String> StudentCourses) {
			this.StudentCourses=StudentCourses;
		}
		public Map<String,String> getStudentCourses(){
			return this.StudentCourses;
		}
		public void print() {
			System.out.println("\n Map of Student Courses: ");
			for(Map.Entry<String,String>entry:StudentCourses.entrySet())
			{
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
				
		}
}

