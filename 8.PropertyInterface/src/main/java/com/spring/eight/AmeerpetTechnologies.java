package com.spring.eight;
import java.util.*;
public class AmeerpetTechnologies {
		private Properties StudentBatches;
		public AmeerpetTechnologies() {
			super();
		}
		public AmeerpetTechnologies(Properties StudentBatches) {
			super();
			this.StudentBatches=StudentBatches;
		}
		public void setStudentBatches(Properties StudentBatches) {
			this.StudentBatches=StudentBatches;
		}
		public Properties getStudentBatches() {
			return this.StudentBatches;
		}
		public void print() {
			System.out.println("\n Student Batches:  ");
			Set<String>keys=StudentBatches.stringPropertyNames();{
				for(String key: keys) {
					System.out.println(key+" : "+StudentBatches.getProperty(key));
				}
			}
		}
}
