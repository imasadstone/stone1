package model;

import java.io.Serializable;
import java.util.ArrayList;

public class BookData implements Serializable{
	private String bookId;
	private String authors;
	private String title;
	private String dateOfPublication;
	private String categories;
	
	public BookData(String bookId, String authors, String title, String dateOfPublication, String categories) {
		super();
		this.bookId = bookId;
		this.authors = authors;
		this.title = title;
		this.dateOfPublication = dateOfPublication;
		this.categories = categories;
	}

	public BookData() {
		super();
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(String dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public String toString() {
		return "BookData [bookId=" + bookId + ", authors=" + authors + ", title=" + title + ", dateOfPublication="
				+ dateOfPublication + ", categories=" + categories + "]";
	}
	
}
