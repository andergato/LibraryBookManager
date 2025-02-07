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
	
	//Simple search method for finding a book by its ISBN. 
	//Searches from array start to finish and returns the book once it is found.
	//If the book is not found, returns NULL
	public Book searchByISBN(String ISBN) {
		for(int i = 0; i < 5; i++) {
			if(books[i].getISBN() == ISBN) {
				return books[i];
			}
		}
		return null;
	}
	
	//Uses toString for each book in the library to display information about each.
	public void displayBooks() {
		for(int i = 0; i < 5; i++) {
			books[i].toString();
		}
	}
	
}
