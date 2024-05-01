package com.spring.six.AddressDIObjects;

public class StudentBean {
		private int studentid;
		private String studentname;
		private AddressBean myAddress;
		
		public StudentBean() {
			super();
			// TODO Auto-generated constructor stub
		}

		public StudentBean(int studentid, String studentname, AddressBean myAddress) {
			super();
			this.studentid = studentid;
			this.studentname = studentname;
			this.myAddress = myAddress;
		}

		public int getStudentid() {
			return studentid;
		}

		public void setStudentid(int studentid) {
			this.studentid = studentid;
		}

		public String getStudentname() {
			return studentname;
		}

		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}

		public AddressBean getMyAddress() {
			return myAddress;
		}

		public void setMyAddress(AddressBean myAddress) {
			this.myAddress = myAddress;
		}

		public void print() {
			System.out.println("\n Student Details:  ");
			System.out.println("Student Id: "+studentid);
			System.out.println("Student Name: "+studentname);
			System.out.println("\n Address of the Student: "+studentname);
			System.out.println("House Number: "+myAddress.getHousenum());
			System.out.println("City: "+myAddress.getCity());
			System.out.println("State: "+myAddress.getState());
			System.out.println("Pincode: "+myAddress.getPincode());
		}
}
