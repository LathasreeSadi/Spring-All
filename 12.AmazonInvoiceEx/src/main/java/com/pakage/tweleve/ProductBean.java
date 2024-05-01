package com.pakage.tweleve;

public class ProductBean {
		private int pid;
		private String pname;
		private int pquantity;
		private double pprice;
		public ProductBean() {
			super();
		}
		public ProductBean(int pid, String pname, int pquantity, double pprice) {
			super();
			this.pid=pid;
			this.pname=pname;
			this.pquantity=pquantity;
			this.pprice=pprice;
		}
		public void setPId(int pid) {
			this.pid=pid;
		}
		public int getPId() {
			return this.pid;
		}
		public void setPName(String pname) {
			this.pname=pname;
		}
		public String getPName() {
			return this.pname;
		}
		public void setPQuantity(int pquantity) {
			this.pquantity=pquantity;
		}
		public int getPQuantity() {
			return this.pquantity;
		}
		public void setPPrice(double pprice) {
			this.pprice=pprice;
		}
		public double getPPrice() {
			return this.pprice;
		}
		public void print() {
			double total=pprice*pquantity;
			System.out.println("Total: "+total);
			double discount=0.0;
			if(total<3000) {
				discount=(total*10)/100;
			}
			else if(total<=3000 && total>10000) {
				discount=(total*15)/100;
			}
			else
			{
				discount=(total*20)/100;
			}
			System.out.println("Discount:: "+discount);
			double invoice=total-discount;
			System.out.println("Invoice::"+invoice);
				}
}
