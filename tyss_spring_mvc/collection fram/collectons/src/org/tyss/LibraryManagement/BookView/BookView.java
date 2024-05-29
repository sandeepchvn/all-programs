package org.tyss.LibraryManagement.BookView;

import java.util.Scanner;

import org.tyss.LibraryManagement.BookController.BookController;

public class BookView {
public static void main(String[] args) {
	
	BookController bookController=new BookController();
	System.out.println("welcome to library");
	while(true) {
		System.out.println("enter 1 to add book\nenter 2 to search book\nenter 3 to borrow\nenter 4 to return\nenter 5 to remove book\nenter 6 to sort\nenter 7 to exit");
		switch((new Scanner(System.in).nextInt())) {
		case 1:
			bookController.addBook();
			break;
		case 2:
			bookController.searchBook();
			break;
		case 3:
			bookController.borrowBook();
			break;
		case 4:
			bookController.returnBack();
			break;
		case 5:
			bookController.removeBook();
			break;
		case 6:
			bookController.sort();
			break;
		case 7:
			return;
		default :
			System.out.println("enter valid number");
		}
	}
}
}
