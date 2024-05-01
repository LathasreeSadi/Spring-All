package com.mvn.Product;

public class ProductConstructor {
	int Pid;
	String Pname;
	String Brand;
	Double Price;
	public ProductConstructor(int Pid,String Pname, String Brand, Double Price) {
		this.Pid=Pid;
		this.Pname=Pname;
		this.Brand=Brand;
		this.Price=Price;
	}
	public void print() {
		System.out.println(Pid);
		System.out.println(Pname);
		System.out.println(Brand);
		System.out.println(Price);
	}
}
