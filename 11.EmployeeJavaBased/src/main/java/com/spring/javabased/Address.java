package com.spring.javabased;

public class Address {
		private String city;
		private String colony;
		private String state;
		private int pincode;
		public Address() {
			super();
		}
		public Address(String city, String colony, String state, int pincode) {
			super();
			this.city=city;
			this.colony=colony;
			this.state=state;
			this.pincode=pincode;
		}
		public void setCity(String city) {
			this.city=city;
		}
		public String getCity() {
			return this.city;
		}
		public void setColony(String colony) {
			this.colony=colony;
		}
		public String getColony() {
			return this.colony;
		}
		public void setState(String state) {
			this.state=state;
		}
		public String getState() {
			return this.state;
		}
		public void setPincode(int pincode) {
			this.pincode=pincode;
		}
		public int getPincode() {
			return this.pincode;
		}
}
