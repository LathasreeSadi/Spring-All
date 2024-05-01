package com.mvn.Student.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    /*public static void main( String[] args )
    {
        StudentConstructor sc=new StudentConstructor(101,"Latha","Java","01-11-2023","Batch-11");
        sc.print();
    }*/
	/*public static void main(String[] args)
	{
		StudentClassMethods scm=new StudentClassMethods();
		scm.insert(101,"Latha","Java","01-11-2023","Batch-11");
		scm.print();
	}*/
	public static void main(String[] args)
	{
		StudentSetter ss=new StudentSetter();
		ss.setId(101);
		ss.setSname("Latha");
		ss.setScourse("Java");
		ss.setDoj("01-11-2023");
		ss.setBatch("Batch-11");
		System.out.println(ss.getId());
		System.out.println(ss.getSname());
		System.out.println(ss.getScourse());
		System.out.println(ss.getDoj());
		System.out.println(ss.getBatch());
	}
}
