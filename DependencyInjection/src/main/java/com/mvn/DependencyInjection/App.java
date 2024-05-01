package com.mvn.DependencyInjection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    /*{
    	//Product p =new Product(1,"IPhone",149999.00);
        //Order o=new Order(1,"mobile",p);
    	Product p=new Product();
    	Order o=new Order();
        p.setProductid(101);
        p.setProductname("HP");
        p.setProductprice(75000.00);
        o.setOrderid(102);
        o.setOrdername("Laptop");
        o.setProduct(p);
        o.print();
        
    } */
    {
    	/*{//Marks m=new Marks(48,45,50);
    	//Student s=new Student("Latha","10th",m);
    	//School sl=new School("St.Theresa's Girls High Scholl",s);
    	//sl.print();}*/
    
    	Marks m=new Marks();
    	m.setMaths(90);
    	m.setPhysics(85);
    	m.setChemistry(92);
    	
    	Student s=new Student();
    	s.setSname("LathaSree");
    	s.setSclass("10th");
    	s.setMarks(m);
    	
    	School sl=new School();
    	sl.setSlname("NRI");
    	sl.setStudent(s);
    	sl.print();
    }
}
