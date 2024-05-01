package com.mvn.Product;

/**
 * Hello world!
 *
 */
public class App 
{
   /* public static void main( String[] args )
    {
        ProductConstructor pc=new ProductConstructor(101,"Lipstick","Lakme",500.23);
        pc.print();
    }*/
	/*public static void main(String[] args)
	{
		ProductClassMethods pcm=new ProductClassMethods();
		pcm.insert(101,"Lipstick","Lakme",536.23);
		pcm.print();
	}*/
	public static void main(String[] args)
	{
		ProductSetter ps=new ProductSetter();
		ps.setId(101);
		ps.setPname("Lipstick");
		ps.setBrand("Lakme");
		ps.setPrice(563.23);
		System.out.println(ps.getId());
		System.out.println(ps.getPname());
		System.out.println(ps.getBrand());
		System.out.println(ps.getPrice());
				
	}
}
