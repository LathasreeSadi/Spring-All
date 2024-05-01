package com.mvn.Product;

public class ProductClassMethods {
	int Pid;
	String Pname;
	String Brand;
	Double Price;
	public void insert(int id, String name, String brand, Double price)
	{
		Pid = id;
		Pname= name;
		Brand= brand;
		Price= price;
	}
	public void print()
	{
		System.out.println(Pid);
		System.out.println(Pname);
		System.out.println(Brand);
		System.out.println(Price);
	}
}
