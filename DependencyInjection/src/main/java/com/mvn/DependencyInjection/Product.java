package com.mvn.DependencyInjection;

public class Product {
	private int productid;
	private String productname;
	private double productprice;
	/*public Product() {
		
	}
	public Product(int productid, String productname, double productprice) {
		this.productid=productid;
		this.productname=productname;
		this.productprice=productprice;
	}*/
	public void setProductid(int productid) {
		this.productid=productid;
	}
	public void setProductname(String productname) {
		this.productname=productname;
	}
	public void setProductprice(double productprice) {
		this.productprice=productprice;
	}
	public int getproductid() {
		return this.productid=productid;
	}
	public String getproductname() {
		return this.productname=productname;
	}
	public double getproductprice() {
		return this.productprice=productprice;
	}
	
}
