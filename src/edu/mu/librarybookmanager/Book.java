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
	 * this is a parameterized constructor below 
	 */
	
	public Book(String book, String author, String ISBN, double price) {
		this.book = book;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
		
			}
	/**
	 * this is a copy constructor that creates a new book object from an existing book
	 * @return
	 */
	
	public Book (Book book) {
		this.book = book.book;
		this.author = book.author;
		this.ISBN = book.ISBN;
		this.price = book.price;
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
	
	@Override
	public String toString() {
		return "Book [book=" + book + ", author" + author + ", ISBN" + ISBN + ", price" + price + "]";
	}
	/**
	 * conditional statement comparing two books with the same name by comparing current book input to our parameters of what a book can be 
	 */
	
	@Override
	public boolean equals(Object obj) {
		Book book = (Book)obj;
		if(this.book.equals(book.getbook())) 
				{
			return true;
		}
		 return false;
	}
}
	


