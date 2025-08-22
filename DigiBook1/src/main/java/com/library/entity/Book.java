package com.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book 
{
	@Id
private int id;
private String book_name;
private int price;
private String author_name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBook_name() {
	return book_name;
}
public void setBook_name(String book_name) {
	this.book_name = book_name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getAuthor_name() {
	return author_name;
}
public void setAuthor_name(String author_name) {
	this.author_name = author_name;
}

}
