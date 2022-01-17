package com.darshan.springProject4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        FirstBean firstBean =context.getBean(FirstBean.class);
        firstBean.display();
        context.close();
    }
}
