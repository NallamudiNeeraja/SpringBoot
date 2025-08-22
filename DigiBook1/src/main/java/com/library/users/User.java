package com.library.users;

import java.util.Scanner;

import org.springframework.stereotype.Component;
import com.library.repository.BookCURD;

@Component
public class User 
{
public void readbook()
{
	BookCURD bcrud = new BookCURD();
	Scanner sc=new Scanner(System.in);
	boolean temp=true;
	while(temp) {
	System.out.println("WELCOME USER");
	System.out.println("1:Read The Book");
	System.out.println("2:Exit");
	int choice=sc.nextInt();
	if(choice==1)
	{
		bcrud.readBookByUser();
	}
	else if(choice==2)
	{
		System.out.println("Hope You Have Enjoyed The Reading Session Thank you ");
		temp=false;
	}
	else {
		System.out.println("Wrong Input");
	}
}
}
}
