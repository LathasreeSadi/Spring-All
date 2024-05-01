package com.pakage.fourteen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("Springconfig.xml");
        Employee em=(Employee) context.getBean("emp");
       // em.create();
        //em.insert();
        //em.delete();
       // em.updateRecord();
       // em.getRecord();
        em.getAllRecords();
    }
}
