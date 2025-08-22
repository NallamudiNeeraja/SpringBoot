package com.calculator1.services;

import java.util.Scanner;

public class Division 
{
	public void division()
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1st number");
			double a = sc.nextDouble();
			System.out.println("Enter 2nd number");
			double b=sc.nextDouble();
			System.out.println("The Multiplication of "+a +" and "+b + " is "+ (a/b));

		}
}
