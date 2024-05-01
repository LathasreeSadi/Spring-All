package com.mvn.Product;

public class ProductSetter {
	int Pid;
	String Pname;
	String Brand;
	Double Price;
	public void setId(int Pid)
	{
		this.Pid=Pid;
	}
	public void setPname(String Pname)
	{
		this.Pname=Pname;
	}
	public void setBrand(String Brand)
	{
		this.Brand=Brand;
	}
	public void setPrice(Double Price)
	{
		this.Price=Price;
	}
	public int getId()
	{
		return Pid;
	}
	public String getPname()
	{
		return Pname;
	}
	public String getBrand()
	{
		return Brand;
	}
	public Double getPrice()
	{
		return Price;
	}
}
