package com.soumyadeep.collections.hashTable;

import java.util.Hashtable;
import java.util.Map;

public class UserDefinedObjectsBookMain {

	public static void main(String[] args) {

		UserDefinedObjectsBook b1=new UserDefinedObjectsBook(1,"java","soumyadeep","ss",11);
		UserDefinedObjectsBook b2=new UserDefinedObjectsBook(2,"spring boot","soumyadeep","ss",11);
		UserDefinedObjectsBook b3=new UserDefinedObjectsBook(3,"microservices","soumyadeep","ss",11);
		UserDefinedObjectsBook b4=new UserDefinedObjectsBook(4,"react","soumyadeep","ss",11);
		UserDefinedObjectsBook b5=new UserDefinedObjectsBook(5,"splunk","soumyadeep","ss",11);
		UserDefinedObjectsBook b6=new UserDefinedObjectsBook(6,"python","soumyadeep","ss",11);
		UserDefinedObjectsBook b7=new UserDefinedObjectsBook(7,"data science","soumyadeep","ss",11);
		UserDefinedObjectsBook b8=new UserDefinedObjectsBook(8,"data scientist","soumyadeep","ss",11);
		
		Hashtable<Integer,UserDefinedObjectsBook> hashtable = new Hashtable<>();
		hashtable.put(5,b5);
		hashtable.put(6,b6);
		hashtable.put(7,b7);
		hashtable.put(8,b8);
		hashtable.put(1,b1);
		hashtable.put(2,b2);
		hashtable.put(3,b3);
		hashtable.put(4,b4);

		for(Map.Entry<Integer, UserDefinedObjectsBook> entry : hashtable.entrySet()) {
			int key= entry.getKey();
			UserDefinedObjectsBook book=entry.getValue();
			System.out.println(key + " Key Details");
			System.out.println(book.id+" "+book.name+" "+book.author+" "+book.publisher+" "+book.quantity);
		}
	}
}
