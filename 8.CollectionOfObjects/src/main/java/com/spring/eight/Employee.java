package com.spring.eight;
import java.util.*;
public class Employee {
		private List<String> empname;
		private Set<Integer> empnum;
		private Map<String,Integer> empdeptno;
		private Properties empsalary;
		public Employee() {
			super();
		}
		public Employee(List<String> empname, Set<Integer> empnum, Map<String,Integer> empdeptno, Properties empsalary) {
			super();
			this.empname=empname;
			this.empnum=empnum;
			this.empdeptno=empdeptno;
			this.empsalary=empsalary;
		}
		public void setEmpname(List<String> empname) {
			this.empname=empname;
		}
		public List<String> getEmpname(){
			return this.empname;
		}
		public void setEmpnum(Set<Integer> empnum) {
			this.empnum=empnum;
		}
		public Set<Integer> getEmpnum(){
			return this.empnum;
		}
		public void setEmpdeptno(Map<String,Integer> empdeptno) {
			this.empdeptno=empdeptno;
		}
		public Map<String,Integer> getEmpdeptno(){
			return this.empdeptno;
		}
		public void setEmpsalary(Properties empsalary) {
			this.empsalary=empsalary;
		}
		public Properties getEmpsalary() {
			return this.empsalary;
		}
		public void print() {
			System.out.println("\n Employee Names: ");
			for(String names: empname) {
				System.out.println(names);
			}
			System.out.println("\n Employee Numbers: ");
			for(int nums: empnum) {
				System.out.println(nums);
			}
			System.out.println("\n Employee Department Numebers: ");
			for(Map.Entry<String,Integer>entry:empdeptno.entrySet()) {
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
			System.out.println("\n Employee Salary Department: ");
			Set<String>keys=empsalary.stringPropertyNames();{
				for(String key: keys) {
					System.out.println(key+" : "+empsalary.getProperty(key));
				}
			}
		}
}
