package com.mvn.DI.DependencyInjection1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Chocolates c=new Chocolates("Almond Dairymilk","Oreo FiveStar","Munch","Perk");
        Snacks s= new Snacks("Good day","Lays",c);
        Food f= new Food("ChickenBiryani","Panipuri",s);
        f.print();
    }
}
