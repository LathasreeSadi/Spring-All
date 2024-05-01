package com.Product.Product1.Interface;

public class Pro1Imp implements Pro1Interface {
	int pid;
	String pname;
	double pprice;
	String pbrand;
	public Pro1Imp() {
		
	}
	public Pro1Imp(int pid, String pname, double pprice, String pbrand) {
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;
		this.pbrand=pbrand;
	}

	@Override
	public void setPid(int pid) {
		this.pid=pid;

	}

	@Override
	public void setPname(String pname) {
		this.pname=pname;

	}

	@Override
	public void setPprice(double pprice) {
		this.pprice=pprice;

	}

	@Override
	public void setPbrand(String pbrand) {
		this.pbrand=pbrand;

	}

	@Override
	public int getpid() {
		
		return this.pid;
	}

	@Override
	public String getpname() {
		
		return this.pname;
	}

	@Override
	public double getpprice() {
		
		return this.pprice;
	}

	@Override
	public String getpbrand() {
		
		return this.pbrand;
	}

}
