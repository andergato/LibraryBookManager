package edu.mu.librarybookmanager;
import java.util.Arrays;


public class Library {
	
	private Book[] books = new Book[5];
	private int count = 0;
	
	/**
	 * If there is space in Book array, add book, increase count, and return true. 
	 * If there is no space, return false.
	 * 
	 * @param book
	 * The Book you would like to add to the library
	 * 
	 * @return If the book is added successfully, returns true, otherwise
	 * will return false.
	 */
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
	
	
	/**
	 * Removes a book from the library by creating a new array with one less
	 * 
	 * @param book
	 * The Book you would like to remove from the library
	 * @return
	 * If the book is removed successfully, returns true, otherwise
	 * will return false.
	 */
	public boolean removeBook(Book book){
		if(searchByISBN(book.getISBN()) == null) {
			return false;
		}
		Book[] books2 = new Book[count-1];
		int books2Index = 0;
		
		for(int i = 0; i < count; i++) {
			if(books[i] != book) {
				books2[books2Index] = books[i];
				books2Index++;
			}
		}
		count--;
		books = books2;
		
		return true;
	}
	
	/**
	 * Simple search method for finding a book by its ISBN. 
	   Searches from array start to finish and returns the book once it is found.
	 * @param ISBN
	 * The ISBN of the book you are searching for
	 * @return
	 * Will return the book you are looking for if it is found,
	 * otherwise will return null. 
	 */
	public Book searchByISBN(String ISBN) {
		for(int i = 0; i < 5; i++) {
			if(books[i].getISBN() == ISBN) {
				return books[i];
			}
		}
		return null;
	}
	
	/**
	 * Uses toString for each book in the library to display information about each.
	 */
	public void displayBooks() {
		for(int i = 0; i < count; i++) {
			System.out.println(books[i]);
		}
	}
	
}
