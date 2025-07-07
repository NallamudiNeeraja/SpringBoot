package com.result.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.result.repo.AdminRepo;
@Controller
public class AdminLoginController 
{
	@Autowired
	private AdminRepo ar;
@GetMapping("/adminlogin")
public String adminlogin()
{
	return "admin-login";
}
@PostMapping("/validateAdmin")
public String validateAdmin(@RequestParam("email") String email,@RequestParam("password") String password)
{
	if(email.equals("nallamudineeraja@gmail.com")&& password.equals("1234")) 
	{
		return "welcomeAdmin";
	}
	else {
		return "Not-Found";
	}
	
}
}
