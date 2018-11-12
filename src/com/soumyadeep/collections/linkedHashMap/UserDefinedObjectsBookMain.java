package com.soumyadeep.collections.linkedHashMap;

import java.util.LinkedHashMap;
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
		
		LinkedHashMap<Integer,UserDefinedObjectsBook> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(5,b5);
		linkedHashMap.put(6,b6);
		linkedHashMap.put(7,b7);
		linkedHashMap.put(8,b8);
		linkedHashMap.put(1,b1);
		linkedHashMap.put(2,b2);
		linkedHashMap.put(3,b3);
		linkedHashMap.put(4,b4);

		for(Map.Entry<Integer, UserDefinedObjectsBook> entry : linkedHashMap.entrySet()) {
			int key= entry.getKey();
			UserDefinedObjectsBook book=entry.getValue();
			System.out.println(key + " Key Details");
			System.out.println(book.id+" "+book.name+" "+book.author+" "+book.publisher+" "+book.quantity);
		}
	}
}
