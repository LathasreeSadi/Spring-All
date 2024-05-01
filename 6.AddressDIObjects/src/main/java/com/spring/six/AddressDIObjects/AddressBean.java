package com.spring.six.AddressDIObjects;

public class AddressBean {
		private int housenum;
		private String city;
		private String state;
		private String pincode;
		public AddressBean() {
			
		}
		public AddressBean(int housenum, String city, String state, String pincode) {
			this.housenum=housenum;
			this.city=city;
			this.state=state;
			this.pincode=pincode;
		}
		public void setHousenum(int housenum) {
			this.housenum=housenum;
		}
		public int getHousenum() {
			return this.housenum=housenum;
		}
		public void setCity(String city) {
			this.city=city;
		}
		public String getCity() {
			return this.city=city;
		}
		public void setState(String state) {
			this.state=state;
		}
		public String getState() {
			return this.state=state;
		}
		public void setPincode(String pincode) {
			this.pincode=pincode;
		}
		public String getPincode() {
			return this.pincode=pincode;
		}
		
}
