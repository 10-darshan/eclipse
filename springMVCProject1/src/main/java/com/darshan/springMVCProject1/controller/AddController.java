package com.darshan.springMVCProject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/add")
	public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		//ModelAndView mv=new ModelAndView("result.jsp");
		//mv.addObject("result",num1+num2);
		//return mv;
		System.out.println("hoo");
		return "result.jsp";
	}

}
