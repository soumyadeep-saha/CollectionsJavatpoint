package com.soumyadeep.collections.hashMap;

import java.util.HashMap;
import java.util.Iterator;
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
		
		HashMap<Integer,UserDefinedObjectsBook> hashMap = new HashMap<>();
		hashMap.put(5,b5);
		hashMap.put(6,b6);
		hashMap.put(7,b7);
		hashMap.put(8,b8);
		hashMap.put(1,b1);
		hashMap.put(2,b2);
		hashMap.put(3,b3);
		hashMap.put(4,b4);

		for(Map.Entry<Integer, UserDefinedObjectsBook> entry : hashMap.entrySet()) {
			int key= entry.getKey();
			UserDefinedObjectsBook book=entry.getValue();
			System.out.println(key + " Key Details");
			System.out.println(book.id+" "+book.name+" "+book.author+" "+book.publisher+" "+book.quantity);
		}
	}
}
