package com.spring.fourth.StudentConstructorInjection;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
        StudentBean stuBean=(StudentBean) context.getBean("stud");
        stuBean.print();
    }
}
