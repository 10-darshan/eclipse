package com.darshan.springProject3;

import org.springframework.stereotype.Component;

@Component
public class GmailService implements MessageService{
private String message;
	

	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println(this.message+" Gmail sending message");
	}

}
