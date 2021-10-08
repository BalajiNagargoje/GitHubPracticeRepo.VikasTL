package com.javaboys.controller;

import org.springframework.stereotype.Controller;

import com.javaboys.service.EmployeeServiceI;

@Controller
public class HomeController {
	
	private EmployeeServiceI employeeServiceI;
	
	public void showmsg () {
		
		System.out.println(" Hello Vikas Sir");
	}
	

}
