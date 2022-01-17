package com.darshan.springProject2;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationConfigruation.xml");
        HelloWorld helloWorld=context.getBean(HelloWorld.class);
        helloWorld.setMessage("hello");
        System.out.println(helloWorld.getMessage());
        //context.close();
    }
}
