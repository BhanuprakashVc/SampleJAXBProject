/**
 * 
 */
package com.Bhanuprakash;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Bhanuprakash Vc
 * Timestamp: 13-Feb-2016.
 */

@XmlRootElement(namespace = "com.Bhanuprakash")
public class Bookstore {

	// XmLElementWrapper generates a wrapper element around XML representation
	  @XmlElementWrapper(name = "bookList")
	  // XmlElement sets the name of the entities
	  @XmlElement(name = "book")
	  private ArrayList<Book> bookList;
	  private String name;
	  private String location;
	/**
	 * @return the bookList
	 */
	public ArrayList<Book> getBooksList() {
		return bookList;
	}
	/**
	 * @param bookList the bookList to set
	 */
	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	/**
	 * @return the name
	 */
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
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	  
	  
}
