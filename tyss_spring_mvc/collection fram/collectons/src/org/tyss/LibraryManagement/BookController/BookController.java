package org.tyss.LibraryManagement.BookController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import org.tyss.LibraryManagement.Book.Book;

public class BookController {
	private ArrayList<Book> arr = new ArrayList<Book>();
	private Scanner read = new Scanner(System.in);

	public void addBook() {
		System.out.println("enter title,author,id");
		Book book = new Book(read.next(), read.next(), read.next(), true);
		arr.add(book);
		System.out.println("book added to librery successfully");
	}

	public void searchBook() {
		System.out.println("enter the title, author or id to search");
		String str = read.next();
		for (Book book : arr) {
			if (book.getTitle().equalsIgnoreCase(str) || book.getAuthor().equalsIgnoreCase(str)
					|| book.getId().equalsIgnoreCase(str)) {
				System.out.println("book found");
				System.out.println(book);
				break;
			}
			System.out.println("book not found");
		}
		if (arr.size() == 0)
			System.out.println("books are not available");
	}

	public void borrowBook() {
		System.out.println("enter the title, author or id to Borrow");
		String str = read.next();
		for (Book book : arr) {
			if (book.getTitle().equalsIgnoreCase(str) || book.getAuthor().equalsIgnoreCase(str)
					|| book.getId().equalsIgnoreCase(str)) {
				book.setAvailable(false);
				System.out.println("book is borrowed----!");
				break;
			}
			System.out.println("book is not available for Borrow");
		}

	}

	public void returnBack() {
		System.out.println("enter the title, author or id to Return the book");
		String str = read.next();
		for (Book book : arr) {
			if (book.getTitle().equalsIgnoreCase(str) || book.getAuthor().equalsIgnoreCase(str)
					|| book.getId().equalsIgnoreCase(str)) {
				book.setAvailable(true);
				System.out.println("book is Returned----!");
				break;
			}
			System.out.println("book not found in library to return");
		}

	}

	public void removeBook() {
		System.out.println("enter the title, author or id to Remove the book");
		String str = read.next();
//		for (int i=0; i<arr.size();i++) {
//			Book book=arr.get(i);
//			if (book.getTitle().equalsIgnoreCase(str) || book.getAuthor().equalsIgnoreCase(str)
//					|| book.getId().equalsIgnoreCase(str)) {
//				arr.remove(i);
//			System.out.println("book is removed----!");
//			break;
//			}
//			System.out.println("book not found in library to remove");
//		}
		Iterator<Book> i = arr.iterator();
		while (i.hasNext()) {
			if (i.next().getId().equalsIgnoreCase(str))
				i.remove();
		}
	}

	public void sort() {
		System.out.println("enter 1 to sort with id\nenter 2 to sort with title\nenter 3 to sort with author");
	Comparator sort=null;
		switch (read.nextInt()) {
		case 1:
			sort=new IdSort();
			break;
		case 2:
			sort=new TitleSort();
			break;
		case 3:
			sort=new AuthorSort();
			break;
		default:
			System.out.println("enter the valid choice");
			break;
		}
		Collections.sort(arr,sort);
		System.out.println(arr);
	}
}
