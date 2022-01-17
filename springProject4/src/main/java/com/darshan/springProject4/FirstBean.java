package com.darshan.springProject4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class FirstBean {
	@Autowired
	private SecondBean secondBean;
	@Autowired
	private ThirdBean thirdBean;
	public FirstBean() {
		System.out.println("First Bean initialized via constructor");
	}
	public void display() {
		secondBean.display();
		thirdBean.display();
	}

}
