package com.spring.javabased;

public class Employee {
		private int id;
		private String name;
		private Address address;
		public Employee() {
			super();
		}
		public Employee(int id, String name, Address address) {
			super();
			this.id=id;
			this.name=name;
			this.address=address;
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
		public void setAddress(Address address) {
			this.address=address;
		}
		public Address getAddress() {
			return this.address;
		}
		public void display() {
			System.out.println("\n Employee Details: ");
			System.out.println("Employee Id: "+ id);
			System.out.println("Employee Name: "+ name);
			System.out.println("\n Address: ");
			System.out.println("Employee City: "+address.getCity());
			System.out.println("Employee Colony: "+address.getColony());
			System.out.println("Employee State: "+address.getState());
			System.out.println("Employee Pincode: "+address.getPincode());
		}
}
