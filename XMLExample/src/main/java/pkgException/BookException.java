package pkgException;

import pkgLibrary.Book;

public class BookException extends Exception{
	private String id;
	private Book b;
	
	
	public BookException(String id){
		super();
		this.id = id;
		b = new Book(id);
	}

	public String getId() {
		return id;
	}


	public Book getB() {
		return b;
	}
	
	
}
