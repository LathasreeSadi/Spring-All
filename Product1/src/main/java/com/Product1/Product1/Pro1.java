package com.Product1.Product1;

public class Pro1 {
	int pid;
	String pname;
	double pprice;
	String pbrand;
	public Pro1() {
		
	}
	public Pro1(int pid, String pname, double pprice, String pbrand) {
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;
		this.pbrand=pbrand;
	}
	public void setPid(int pid) {
		this.pid=pid;
	}
	public void setPname(String pname) {
		this.pname=pname;
	}
	public void setPprice(double pprice) {
		this.pprice=pprice;
	}
	public void setPbrand(String pbrand) {
		this.pbrand=pbrand;
	}
	public int getpid() {
		return this.pid;
	}
	public String getpname() {
		return this.pname;
	}
	public double getpprice() {
		return this.pprice;
	}
	public String getpbrand() {
		return this.pbrand;
	}
}
