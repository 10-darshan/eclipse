package com.darshan.springProject3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	
    public static void main( String[] args )
    {
    	
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	//ApplicationContext context= new ClassPathXmlApplicationContext("AppConfig.xml");
        //context.register(AppConfig.class);
        //context.refresh();
        MessageService messageService=context.getBean(GmailService.class);
        messageService.setMessage("hi");
        messageService.sendMsg();
        MessageService messageService1=context.getBean(GmailService.class);
        messageService1.setMessage("hello");
        messageService.sendMsg();
        context.close();
    	
 
    	
    }
}
