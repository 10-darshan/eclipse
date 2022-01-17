package com.darshan.springProject3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TwitterService implements MessageService {
	private String message;
	

	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public void sendMsg() {
	   System.out.println(this.message+" Twitter sending message");
		
	}

}
