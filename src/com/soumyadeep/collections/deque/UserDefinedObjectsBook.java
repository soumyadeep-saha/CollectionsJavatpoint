package com.soumyadeep.collections.deque;

public class UserDefinedObjectsBook implements Comparable<UserDefinedObjectsBook>{

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
	public int compareTo(UserDefinedObjectsBook b) {
		if(id>b.id) {
			return 1;
		}else if(id<b.id){
			return -1;
		}else {
		return 0;
		}
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+author+" "+publisher+" "+quantity;
	}
}
