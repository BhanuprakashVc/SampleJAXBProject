/**
 * 
 */
package test;

/**
 * @author Bhanuprakash Vc
 *  Timestamp: 13-Feb-2016.
 *
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.Bhanuprakash.Book;
import com.Bhanuprakash.Bookstore;
public class BookMain {

	private static final String BOOKSTORE_XML = "./bookstore-jaxb.xml";
	/**
	 * @param args
	 */
	public static void main(String[] args) throws JAXBException, IOException{
		// TODO Auto-generated method stub

		ArrayList<Book> bookList = new ArrayList<Book>();

		 // create books
	    Book book1 = new Book();
	    book1.setIsbn("978-0060554736");
	    book1.setName("The Game");
	    book1.setAuthor("Neil Strauss");
	    book1.setPublisher("Harpercollins");
	    bookList.add(book1);

	    Book book2 = new Book();
	    book2.setIsbn("978-3832180577");
	    book2.setName("Feuchtgebiete");
	    book2.setAuthor("Charlotte Roche");
	    book2.setPublisher("Dumont Buchverlag");
	    bookList.add(book2);

	    // create bookstore, assigning book
	    Bookstore bookstore = new Bookstore();
	    bookstore.setName("Fraport Bookstore");
	    bookstore.setLocation("Frankfurt Airport");
	    bookstore.setBookList(bookList);
	
	 // create JAXB context and instantiate marshaller
	    JAXBContext context = JAXBContext.newInstance(Bookstore.class);
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    
	 // Write to System.out
	    m.marshal(bookstore, System.out);
	    
	 // Write to File
	    m.marshal(bookstore, new File(BOOKSTORE_XML) );
	    
	    
	    System.out.println("Output from XML file:: ");
	    
	    Unmarshaller um = context.createUnmarshaller();
	    Bookstore bookstoreObj = (Bookstore) um.unmarshal(new FileReader(BOOKSTORE_XML));
	    
	    ArrayList<Book> list = bookstoreObj.getBooksList();
	    for(Book book : list){
	    	System.out.println("Book name: " +book.getName() + " from:  "+book.getAuthor());
	    }
	    
	}

}
