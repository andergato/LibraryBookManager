package edu.mu.librarybookmanager;

import edu.mu.librarybookmanager.Library;

public class LibraryApp {

	public static void main(String[] args) {
		
		/*
		 * creates a library object 
		 */
		Library library = new Library();
		
		
		// TODO Auto-generated method stub
		
		/*
		 * Added five instances of books
		 */
		
		 Book book1 = new Book();
		 book1.setBook("my year of rest and relaxation");
		 book1.setAuthor("Ottessa Moshfegeh");
		 book1.setISBN("7383838393");
		 book1.setPrice(7.99);
//		 System.out.println("book info" + book1);
		 
		 Book book2 = new Book();
		 book2.setBook("normal people");
		 book2.setAuthor("Sally Roooney");
		 book2.setISBN("9188476526");
		 book2.setPrice(8.49);
//		 System.out.println("book info" + book2);
		 
		 Book book3 = new Book();
		 book3.setBook("The Sympathizer");
		 book3.setAuthor("Viet Thanh Nguyen");
		 book3.setISBN("8614536048");
		 book3.setPrice(11.99);
//		 System.out.println("book info" + book3);
		
		 Book book4 = new Book();
		 book1.setBook("The World Almanac And Book Of Facts 2024");
		 book1.setAuthor("Sarah Janssen");
		 book1.setISBN("29143560083");
		 book1.setPrice(12.99);
//		 System.out.println("book info" + book4);
		 
		 //the book to test what would happen if two names are the same 
		 Book book5 = new Book();
		 book1.setBook("my year of rest and relaxation");
		 book1.setAuthor("Not Otessa Moshfegeh");
		 book1.setISBN("9119564730");
		 book1.setPrice(9.99);
//		 System.out.println("book info" + book5);
		 
		 //adds books to library class
		 library.addBook(book1);
		 library.addBook(book2);
		 library.addBook(book3);
		 library.addBook(book4);
		 
		 //Searches for a book that exists by its ISBN
		 System.out.println(library.searchByISBN("9119564730"));
		 
		 //Removes a book that exists in the library
		 library.removeBook(book3);
		 
		 //Attempts to remove a book that does not exist in the library
		 library.removeBook(book5);
		 
		 //displays the books
		 library.displayBooks();
		 
		 
		
	}
	
	
	
	
	
	}


