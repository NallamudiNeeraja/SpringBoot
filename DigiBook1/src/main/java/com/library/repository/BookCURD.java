package com.library.repository;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.library.entity.Book;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaQuery;

@Repository
public class BookCURD<CriteriaBuilder> 
{
	public static SessionFactory connection() {
		Configuration cfg = new Configuration();
		cfg.configure("/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}
	
	public void addBook()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name of Book");
		String name=sc.nextLine();
		System.out.println("Enter Name of Author");
		String author=sc.nextLine();
		System.out.println("Enter price of Book");
		int price=sc.nextInt();
		
		Book b=new Book();
		b.setId(id);
		b.setBook_name(name);
		b.setAuthor_name(author);
		b.setPrice(price);
		//SessionFactory sf = connection();
		Session session=connection().openSession();
		Transaction tx = session.beginTransaction();
		session.save(b);
		tx.commit();
		
		session.close();
	}
	public void update()
	{
		System.out.println("Enter ID of Book That you want to update");
		Scanner sc=new Scanner(System.in);
		int b_id=sc.nextInt();
		Session s=connection().openSession();
		String b_name,b_author;
		int price;
		Book b=s.get(Book.class, b_id);
		if(b==null)
		{
			System.out.println("The Book with id"+b_id+"is not available");
		}
		else
		{
			b_name=b.getBook_name();
			b_author=b.getAuthor_name();
			price=b.getPrice();
			boolean temp = true;
			
			System.out.println("What do u want to update ?");
			System.out.println("1: Book Name");
			System.out.println("2: Author name");
			System.out.println("3: Price");
		    System.out.println("4:exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice==1) {
			System.out.println("Enter Name of Book");
			b_name=sc.nextLine();
			}
			else if(choice==2) {
			System.out.println("Enter Author Name");
			b_author=sc.nextLine();
			}
			else if(choice==3)
			{
				System.out.println("Enter price of Book");
				price=sc.nextInt();
			}
			else if(choice==4)
			{
				System.out.println("Thanks for update");
				temp=false;
			}
			b.setId(b_id);
			b.setBook_name(b_name);
			b.setAuthor_name(b_author);
			b.setPrice(price);
			
			s.update(b);
			Transaction tx = s.beginTransaction();
			tx.commit();
			s.close();
		}}
	
	
	public void delete()
	{
		Session session=connection().openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("Enter Book Id That you want to delete");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		Book b = session.get(Book.class, id);
		if(b==null) {
			System.out.println("The book with id: "+id+ " is not available");
		}
		
		else {
			
			session.delete(b);
			tx.commit();
			System.out.println("The book with Id: "+id+" is deleted successfully");
		}
	}
	public void readBook()
	{
		Session session=connection().openSession();
		String hql="FROM Book";
		Query  q=session.createQuery(hql);
		List<Book>books=((org.hibernate.query.Query) q).list();
		System.out.println("==========================");
		for(Book b:books)
		{
			System.out.println("Book Id::"+b.getId()+"||wirtten By::"+b.getAuthor_name()+"||Book Name::"+b.getBook_name());
		}
		System.out.println("==============================");
	}
public void readBookByUser()
{
	Session session=connection().openSession();
	String hql="FROM Book";
	Query  q=session.createQuery(hql);
	List<Book>books=((org.hibernate.query.Query) q).list();
	System.out.println("==========================");
	for(Book b:books)
	{
		System.out.println("Book Id::"+b.getId()+"||wirtten By::"+b.getAuthor_name()+"||Book Name::"+b.getBook_name());
	}
	System.out.println("==============================");
	
}
	
	
	}

