package com.darshan.springMVCProject1.configruation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.darshan.controller")
public class AppConfig extends WebMvcConfigurerAdapter{
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver v =new InternalResourceViewResolver();
		v.setPrefix("/");
		v.setSuffix(".jsp");
		return v;
	} 
	

}
