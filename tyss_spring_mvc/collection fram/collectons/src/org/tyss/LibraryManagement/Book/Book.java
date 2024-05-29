package org.tyss.LibraryManagement.Book;

public class Book {
	private String title;
	private String author;
	private String id;
	private boolean isAvailable;
	
	
	public Book(String title, String author, String id, boolean isAvailable) {
		super();
		this.title = title;
		this.author = author;
		this.id = id;
		this.isAvailable = isAvailable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "title-" + title + "\nauthor-" + author + "\nid-" + id +"\n"+ (isAvailable ? "Available" : "Not Available");
	}
}
