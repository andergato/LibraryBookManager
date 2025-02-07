package edu.mu.librarybookmanager;

public class Library {
	
	private Book[] books = new Book[5];
	private int count = 0;
	
	//If there is space in Book array, add book, increase count, and return true. 
	//If there is no space, return false.
	public boolean addBook(Book book){
		if(count < 5) {
			books[count] = book;
			count++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean removeBook(Book book){
		return true;
	}
	
	public Book searchByISBN(String ISBN) {
		return books[0];
	}
	
	public void displayBooks() {
		
	}
	
}
