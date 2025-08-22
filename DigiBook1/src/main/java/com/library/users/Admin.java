package com.library.users;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.library.repository.BookCURD;

@Component
public class Admin {
	
	@Autowired
	private BookCURD bcrud;
	
		public void adminCRUD() {
			Scanner sc = new Scanner(System.in);
			boolean temp = true;
			
			while(temp) {
				System.out.println("Welcome Admin");
				System.out.println("1: Add a new book");
				System.out.println("2: Update an existing book");
				System.out.println("3: Delete a book");
				System.out.println("4: Read the book");
				System.out.println("5: Exit");
				
				int choice = sc.nextInt();
				
				if(choice==1) {
					bcrud.addBook();
				}
				else if(choice==2) {
					bcrud.update();
				}
				else if(choice==3) {
					bcrud.delete();
				}
				else if(choice ==4) 
				{
					bcrud.readBook();
				}
				else if(choice==5) {
					System.out.println("Bye Admin");
					temp=false;
				}
				else {
					System.out.println("Wrong Input");
				}
			}
		}
}


