package com.darshan.springProject4;

import org.springframework.stereotype.Component;

@Component
public class SecondBean {
    public SecondBean() {
    	System.out.println("SecondBean initialized via constructor");
    }
    public void display() {
    	System.out.println("SecondBean method called");
    }
}
