package com.mvn.DependencyInjection;

public class Order {
	private int orderid;
	private String ordername;
	private Product product;
	public void setOrderid(int orderid) {
		this.orderid=orderid;
	}

	
	  public int getorderid() { 
		  return this.orderid; 
		  } 
	  public void setOrdername(String ordername) { 
		  this.ordername=ordername;
		  }
	  public String getordername(){ return this.ordername; }
	 
	public void setProduct(Product product) {
		this.product=product;
	}
	public Product getproduct() {
		return this.product=product;
	}
	public void print()
	{
	System.out.println("Order Id: "+orderid);
	System.out.println("Order Name: "+ordername);
	System.out.println("Product details: "+product);
	System.out.println("\n Product Details: ");
	System.out.println("Product Id: "+product.getproductid());
	System.out.println("Product Name: "+product.getproductname());
	System.out.println("Product Price: "+product.getproductprice());
	}
}