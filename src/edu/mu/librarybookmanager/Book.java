package edu.mu.librarybookmanager;

public class Book {
	private String book;
	private String author;
	private String ISBN;
	private double price;
	
	public Book() {
		this.book = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	/**
	 * this is a parameterized constructor below (javadoc test 1) 
	 */
	
	
	public Book(String book, String author, String ISBN, double price) {
		this.book = book;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
		
			}
	
	public String getbook() {
		return book;
	}
	
	public void setbook() {
		this.book = book;
	}
	
	public String getauthor() {
		return author;
		
	}
	
	public void setauthor() {
		this.author = author;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN() {
		this.ISBN = ISBN;
	}
	
	public double getprice() {
		return price;
	}
	
	public void setprice() {
		this.price = price;
	}
	

}
