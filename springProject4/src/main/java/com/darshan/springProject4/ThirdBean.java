package com.darshan.springProject4;

import org.springframework.stereotype.Component;

@Component
public class ThirdBean {
	 public ThirdBean() {
	    	System.out.println("ThirdBean initialized via constructor");
	    }
	    public void display() {
	    	System.out.println("ThirdBean method called");
	    }

}
