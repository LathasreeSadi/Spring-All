package com.spring.six.AddressDIObject6;


public class StudentBean {
	private int studentid;
	private String studentname;
	private AddressBean address;
	public StudentBean() {
		
	}
	public StudentBean(int studentid, String studentname, AddressBean address) {
		this.studentid=studentid;
		this.studentname=studentname;
		this.address=address;
	}
	public void setStudentid(int studentid) {
		this.studentid=studentid;
	}
	public int getStudentid() {
		return this.studentid;
	}
	public void setStudentname(String studentname) {
		this.studentname=studentname;
	}
	public String getStudentname() {
		return this.studentname;
	}
	public void setAddressBean(AddressBean address ) {
		this.address=address;
	}
	public AddressBean getAddressBean() {
		return this.address;
	}
	public void print() {
		System.out.println("\n Student Details:  ");
		System.out.println("Student Id: "+studentid);
		System.out.println("Student Name: "+studentname);
		System.out.println("\n Address of the Student: "+studentname);
		System.out.println("House Number: "+address.getHousenum());
		System.out.println("City: "+address.getCity());
		System.out.println("State: "+address.getState());
		System.out.println("Pincode: "+address.getPincode());
	}
}
