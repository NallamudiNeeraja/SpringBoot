package com.calculator1.services;

import java.util.Scanner;

public class subtraction 
{
	public void subtraction()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		double a = sc.nextDouble();
		System.out.println("Enter 2nd number");
		double b=sc.nextDouble();
		System.out.println("The subtraction of "+a +" and "+b + " is "+ (a-b));

	}
}
