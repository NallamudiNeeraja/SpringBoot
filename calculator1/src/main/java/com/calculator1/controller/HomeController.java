package com.calculator1.controller;

import java.util.Scanner;

import org.springframework.stereotype.Controller;

import com.calculator1.config.AnnotationConfig;
import com.calculator1.services.Addition;
import com.calculator1.services.Division;
import com.calculator1.services.Multiplication;
import com.calculator1.services.subtraction;

@Controller
public class HomeController
{

    private final AnnotationConfig annotationConfig;

    HomeController(AnnotationConfig annotationConfig) {
        this.annotationConfig = annotationConfig;
    }
	public void control() 
	{
		boolean flag=true;
		while(flag)
		{
			System.out.println("=================================");
			System.out.println("Choose your option");
			System.out.println("1.Addition");
			System.out.println("2.Subtration");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			Scanner sc=new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				Addition ad=new Addition();
				ad.addition();
				break;
			case 2:
				subtraction sub=new subtraction();
				sub.subtraction();
				break;
			case 3:
				Multiplication mul=new Multiplication();
				mul.multiplication();
				break;
			case 4:
				Division div=new Division();
				div.division();
				break;
			case 5:
				flag=false;
				break;
			}
		}
		
	}



}
