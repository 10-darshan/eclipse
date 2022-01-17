package com.darshan.springProject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        /*HelloWorld helloWorld=new HelloWorld();
        helloWorld.setMessage("hey world");
        System.out.println(helloWorld.getMessage());*/
    	ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationConfigruation.xml");
    	HelloWorld helloWorld= (HelloWorld)context.getBean("helloWorld");
    	//helloWorld.setMessage("hoo hoo");
    	System.out.println(helloWorld.getMessage());
    }
}
