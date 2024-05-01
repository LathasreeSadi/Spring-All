package com.Product1.Product1;

import com.Product.Product1.Interface.Pro1Imp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*Pro1 pro=new Pro1(101,"Lipstick",869.23,"Sugar");
        System.out.println(pro.getpid());
        System.out.println(pro.getpname());
        System.out.println(pro.getpprice());
        System.out.println(pro.getpbrand());
        pro.setPid(102);
        pro.setPname("Maskara");
        pro.setPprice(950.00);
        pro.setPbrand("Lakme");
        System.out.println("\n Updated details: ");
        System.out.println("Product id: "+pro.getpid());
        System.out.println("Product Name: "+pro.getpname());
        System.out.println("Product Price: "+pro.getpprice());
        System.out.println("Product Brand: "+pro.getpbrand());
    }*/
    	Pro1Imp proI=new Pro1Imp(101,"Eyelash",599.00,"DOT&kEY");
    	System.out.println("Product Id: "+proI.getpid());
        System.out.println("Product Name: "+proI.getpname());
        System.out.println("Product Price: "+proI.getpprice());
        System.out.println("Product Brand: "+proI.getpbrand());
    	proI.setPid(102);
    	proI.setPname("Toner");
    	proI.setPprice(799.00);
    	proI.setPbrand("Nivea");
    	System.out.println("\n Updated details: ");
        System.out.println("Product id: "+proI.getpid());
        System.out.println("Product Name: "+proI.getpname());
        System.out.println("Product Price: "+proI.getpprice());
        System.out.println("Product Brand: "+proI.getpbrand());
    }
}
