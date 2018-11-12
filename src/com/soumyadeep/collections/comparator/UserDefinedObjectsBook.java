package com.soumyadeep.collections.comparator;

public class UserDefinedObjectsBook {

	public int id;
	public String name;
	public String author;
	public String publisher;
	public int quantity;
	
	public UserDefinedObjectsBook(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+author+" "+publisher+" "+quantity;
	}
}
