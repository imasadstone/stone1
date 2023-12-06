package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class BookData implements Serializable, Comparable<BookData>{
	private String bookId;
	private String authors;
	private String title;
	private String dateOfPublication;
	private String categories;
	public TreeSet<BookData> tsb = new TreeSet<BookData>();
	
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

	public int compareTo(BookData o) {
		String b1 = this.bookId;
		String b2 = o.bookId;
		return b1.compareTo(b2);
	}
	public TreeSet<BookData> treeSetBoook(BookData book) {
		if(tsb.size() == 0) {
			tsb.add(book);
		}else {
			for (BookData bookData : tsb) {
				if(bookData.bookId.equals(book.bookId)) {
					tsb.remove(bookData);
					tsb.add(book);
					break;
				}
			}
			tsb.add(book);
		}
		
		return tsb;
	}

}
