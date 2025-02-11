package edu.mu.librarybookmanager;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Added three instances of books
		 */
		
		 Book book1 = new Book();
		 book1.setbook("my year of rest and relaxation");
		 book1.setauthor("Ottessa Moshfegeh");
		 book1.setISBN("7383838393");
		 book1.setprice(7.99);
		 System.out.println("book info" + book1);
		 
		 Book book2 = new Book();
		 book2.setbook("normal people");
		 book2.setauthor("Sally Roooney");
		 book2.setISBN("9188476526");
		 book2.setprice(8.49);
		 System.out.println("book info" + book2);
		 
		 Book book3 = new Book();
		 book3.setbook("The Sympathizer");
		 book3.setauthor("Viet Thanh Nguyen");
		 book3.setISBN("8614536048");
		 book3.setprice(11.99);
		 System.out.println("book info" + book3);
		
		
		
	}

}
