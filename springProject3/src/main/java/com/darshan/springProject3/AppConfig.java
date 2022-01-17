package com.darshan.springProject3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.darshan.springProject3")
public class AppConfig {
	/*@Bean
	public FacebookService facebookService() {
		return new FacebookService();
	}
	
	@Bean
	public TwitterService twitterService() {
		return new TwitterService();
	}
	
	@Bean(name="gmailService")
	public GmailService gmailService() {
		return new GmailService();
	}*/
}
