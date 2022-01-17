package com.darshan.springProject3;

import org.springframework.stereotype.Component;

@Component
public class FacebookService implements MessageService{
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
		System.out.println(this.message+" Facebook sending message");
	}

}
