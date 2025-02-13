package edu.mu.librarybookmanager;

/**
 * adds a public class called book with private attributes book, author, isbn and price
 */
public class Book {
	private String book;
	private String author;
	private String ISBN;
	private double price;
	
	/**
	 * adds a parameterized constructor with current instances of objects with the string attributes as "unknown" and the current instance of the double attribute set at 0.0 
	 */
	
	public Book() {
		this.book = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	/**
	 * this is a parameterized constructor below, it sets the current instance of the reference variable to the current instance of the book object
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
		
		/**
		 * these are getter and setter methods below that returns and sets the private attributes 
		 */
	}
	
	public String getBook() {
		return book;
	}
	
	public void setBook(String book) {
		this.book = book;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * string statement for when we display each book in the library class   
	 */
	
	@Override
	public String toString() {
		return "Book [book=" + book + ", author" + author + ", ISBN" + ISBN + ", price" + price + "]";
	}
	/**
	 * @param obj
	 * conditional statement comparing two books with the same ISBN by comparing current book input to our parameters of what a book can be
	 * @return
	 *  returns true if book has a isbn that exists, returns false if 
	 */
	
	@Override
	public boolean equals(Object obj) {
		Book book = (Book)obj;
		if(this.ISBN.equals(book.getISBN())) 
				{
			return true;
		}
		 return false;
	}
}
	


