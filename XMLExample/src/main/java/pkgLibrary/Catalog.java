package pkgLibrary;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;

import pkgException.BookException;
import pkgMain.XMLReader;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;	

	@XmlElement(name="book")
	ArrayList<Book> books;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	public Book GetBook(String id) throws BookException{
		for (Book target : books){
			if (target.getId().equals(id)){
				return target;
			}
		}
		throw new BookException(id);
	}
	public void AddBook(String id, Book b) throws BookException{
		for (Book target : books){
			if (target.getId().equals(b.getId())){
				throw new BookException(id);
			}
		}
		books.add(b);
	}











}
