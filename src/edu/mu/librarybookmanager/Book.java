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
	
	public void setbook(String book) {
		this.book = book;
	}
	
	public String getauthor() {
		return author;
		
	}
	
	public void setauthor(String author) {
		this.author = author;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public double getprice() {
		return price;
	}
	
	public void setprice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Book [book=" + book + ", author" + author + ", ISBN" + ISBN + ", price" + price;
	}
	
	//returns true if two books have same name 
	

}
