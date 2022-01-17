package com.darshan.springProject4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@ComponentScan("com.darshan.springProject4")
public class AppConfig {
  @Bean("firstBean")
  @DependsOn(value = {"secondBean","thirdBean"})
  public FirstBean firstBean() {
	  return new FirstBean();
  }
	  
	  @Bean("secondBean")
	  public SecondBean secondBean() {
		  return new SecondBean();
	  }
		  
		  @Bean("firstBean")
		  public ThirdBean thirdBean() {
			  return new ThirdBean();
		  }
	  
  
}
