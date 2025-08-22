package com.library.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.library.users.Admin;
import com.library.users.User;

@Controller
public class HomeController {
	
	@Autowired
	private Admin a;
	@Autowired
	private User u;
	
	public void userLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Login as:-");
		System.out.println("1: Admin");
		System.out.println("2: User");
		int choice = sc.nextInt();
		sc.nextLine();
		
		if(choice==1) {
			System.out.println("Please enter your Admin Id");
			String a_id = sc.nextLine();
			System.out.println("Please enter your password");
			String a_pass = sc.nextLine();
			
			if(a_id.equals("admin")&& a_pass.equals("password")) {
				a.adminCRUD();
			}
			else {
				System.out.println("Wrong credentials, Application terminated");
			}
		}
		else if(choice==2) {
			System.out.println("Please enter your user Id");
			String u_id = sc.nextLine();
			System.out.println("Please enter your password");
			String u_pass = sc.nextLine();
			
			if(u_id.equals("user")&& u_pass.equals("password"))
			{
				u.readbook();
				
			}
			else {
				System.out.println("Wrong credentials, Application terminated");
			}
		}
		else {
			System.out.println("Wrong choice, Application terminated");
		}
	}
}
