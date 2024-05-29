package org.tyss.LibraryManagement.BookController;

import java.util.Comparator;

import org.tyss.LibraryManagement.Book.Book;

public class AuthorSort implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {

		return o1.getAuthor().compareTo(o2.getAuthor());
	}
}
