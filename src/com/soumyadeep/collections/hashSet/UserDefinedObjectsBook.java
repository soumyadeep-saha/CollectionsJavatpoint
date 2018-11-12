package com.soumyadeep.collections.hashSet;

public class UserDefinedObjectsBook {

	public int id;
	private String name;
	private String author;
	private String publisher;
	private int quantity;
	
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
