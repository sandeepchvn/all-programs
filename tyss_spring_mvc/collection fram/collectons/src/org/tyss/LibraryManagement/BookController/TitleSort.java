package org.tyss.LibraryManagement.BookController;

import java.util.Comparator;

import org.tyss.LibraryManagement.Book.Book;

public class TitleSort implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
}
