package com.cjc.main.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.demo.model.Student;

@Controller
public class HomeController {
@RequestMapping("/")
	public String prelogin()
	{	
	return"index";		
	}
    @RequestMapping("/log")
	public String loginpage(@RequestParam("uname")String un,@RequestParam("pass")String ps)
	{
    	System.out.println("this is log action");
    	System.out.println(un);
    	System.out.println(ps);
		return"success";
	}
	@RequestMapping("/register")
	public String preregister()
	{
		return "register";
	}
	@RequestMapping("reg")
   public String registerdata(@ModelAttribute("stu")Student s)
   {
	System.out.println("username"+s.getUname());
    return"index";

	
  }
  }
