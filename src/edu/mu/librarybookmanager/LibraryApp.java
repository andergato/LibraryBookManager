package edu.mu.librarybookmanager;

import edu.mu.librarybookmanager.Library;

public class LibraryApp {

	public static void main(String[] args) {
		
		/**
		 * creates a new library object from the library class
		 */
		Library library = new Library();
	
		/**
		 * adds five instances of books
		 */
		
		 Book book1 = new Book();
		 book1.setBook("my year of rest and relaxation");
		 book1.setAuthor("Ottessa Moshfegeh");
		 book1.setISBN("7383838393");
		 book1.setPrice(7.99);

		 Book book2 = new Book();
		 book2.setBook("normal people");
		 book2.setAuthor("Sally Roooney");
		 book2.setISBN("9188476526");
		 book2.setPrice(8.49);
 
		 Book book3 = new Book();
		 book3.setBook("The Sympathizer");
		 book3.setAuthor("Viet Thanh Nguyen");
		 book3.setISBN("8614536048");
		 book3.setPrice(11.99);

		 Book book4 = new Book();
		 book4.setBook("The World Almanac And Book Of Facts 2024");
		 book4.setAuthor("Sarah Janssen");
		 book4.setISBN("29143560083");
		 book4.setPrice(12.99);

		 //the book to test what would happen if two names are the same 
		 Book book5 = new Book();
		 book5.setBook("my year of rest and relaxation");
		 book5.setAuthor("Not Otessa Moshfegeh");
		 book5.setISBN("9119564730");
		 book5.setPrice(9.99);
		 
		 /**
		   * adds four books to the library class, one is left out to see if book is removed when it doesn't exist
		   */
		 library.addBook(book1);
		 library.addBook(book2);
		 library.addBook(book3);
		 library.addBook(book5);
	
		 //Searches for a book that exists by its ISBN
		 System.out.println(library.searchByISBN("29143560083"));
		 
		 //Removes a book that exists in the library
		 library.removeBook(book3);
		 
		 //Attempts to remove a book that does not exist in the library
		library.removeBook(book4);
		 
		 //displays the books
		 library.displayBooks();
	}
	
}


