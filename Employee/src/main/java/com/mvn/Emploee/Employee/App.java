package com.mvn.Emploee.Employee;
public class App 
{
    public static void main( String[] args )
   /* {
        EmployeeClassMehods ecm=new EmployeeClassMehods();
        ecm.insert(101,"Latha");
        ecm.print();
    }*/
    /*{
    EmployeeConstructor ec= new EmployeeConstructor(101,"Latha");
    ec.print();
    }*/
    {
    	EmployeeSetter es=new EmployeeSetter();
    	es.setEmpid(101);
    	es.setEmpname("Latha");
    	System.out.println(es.getEmpid());
    	System.out.println(es.getEmpname());
    }
}
