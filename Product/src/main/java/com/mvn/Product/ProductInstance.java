package com.mvn.Product;

public class ProductInstance {
	int Pid;
	String Pname;
	String Brand;
	Double Price;
	public static void main(String[] args)
	{
		ProductInstance p=new ProductInstance();
		p.Pid=101;
		p.Pname="Lipstick";
		p.Brand="Lakme";
		p.Price=799.23;
		System.out.println("ProductId:" +p.Pid);
		System.out.println("ProductName:"+p.Pname);
		System.out.println("Price:"+p.Price);
		System.out.println("Brand:"+p.Brand);
	}
}
