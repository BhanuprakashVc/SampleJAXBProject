/**
 * 
 */
package com.Bhanuprakash;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Bhanuprakash Vc
 *
 * Timestamp: 13-Feb-2016.
 *
 */
@XmlRootElement(name = "book")    
//If you want you can define the order in which the fields are written Optional

@XmlType(propOrder = {"author", "name", "publisher", "isbn"})
public class Book {

	private String name;
	private String author;
	private String publisher;
	private String isbn;
	
	// If you like the variable name, e.g. "name", you can easily change this
	// name for your XML-Output:
	
	/**
	 * @return the name
	 */
	@XmlElement(name = "title")
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
