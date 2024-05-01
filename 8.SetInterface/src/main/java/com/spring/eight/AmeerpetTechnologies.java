package com.spring.eight;

import java.util.Set;

public class AmeerpetTechnologies {
		private Set<Integer>StudentRollNumbers;
		public AmeerpetTechnologies() {
			super();
		}
		public AmeerpetTechnologies(Set<Integer> StudentRollNumbers)
		{
			super();
			this.StudentRollNumbers=StudentRollNumbers;
		}
		public void setStudentRollNumbers(Set<Integer> StudentRollNumbers) {
			this.StudentRollNumbers=StudentRollNumbers;
		}
		public Set<Integer> getStudentRollNumbers(){
			return this.StudentRollNumbers;
		}
		public void print() {
			System.out.println("\n Set of Student Roll Numbers:  ");
			for(int stdnum:StudentRollNumbers) {
				System.out.println(stdnum);
			}
		}
		
}
