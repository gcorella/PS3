package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgException.BookException;
import pkgLibrary.Book;
import pkgLibrary.Catalog;
import pkgMain.XMLReader;

public class TestCatalog {
	

	@Test
	public void testGetBook() throws BookException{
		Catalog cat = XMLReader.ReadXMLFile();
		assertEquals(cat.GetBook("bk101"),
			cat.getBooks().get(0));
	}

	@Test (expected = BookException.class)
	public void testGetBook1() throws BookException{
		Book b = new Book("bk100");
		Catalog cat = XMLReader.ReadXMLFile();
		cat.GetBook(b.getId());
	}

	
	@Test
	public void testAddBook() throws BookException{
		Catalog cat = XMLReader.ReadXMLFile();
		Book b = new Book("bk130");
		cat.AddBook(b.getId(), b);
		assertEquals(cat.GetBook(b.getId()),
				b);
	}

	@Test (expected = BookException.class)
	public void testAddBook1() throws BookException{
		Catalog cat = XMLReader.ReadXMLFile();
		Book b = new Book("bk101");
		cat.AddBook(b.getId(), b);
	}


}
