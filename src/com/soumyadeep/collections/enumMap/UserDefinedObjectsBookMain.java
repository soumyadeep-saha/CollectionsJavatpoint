package com.soumyadeep.collections.enumMap;

import java.util.EnumMap;
import java.util.Map;

public class UserDefinedObjectsBookMain {
	
	enum key{
		one,
		two,
		three,
		four,
		five,
		six,
		seven,
		eight
	}

	public static void main(String[] args) {

		UserDefinedObjectsBook b1=new UserDefinedObjectsBook(1,"java","soumyadeep","ss",11);
		UserDefinedObjectsBook b2=new UserDefinedObjectsBook(2,"spring boot","soumyadeep","ss",11);
		UserDefinedObjectsBook b3=new UserDefinedObjectsBook(3,"microservices","soumyadeep","ss",11);
		UserDefinedObjectsBook b4=new UserDefinedObjectsBook(4,"react","soumyadeep","ss",11);
		UserDefinedObjectsBook b5=new UserDefinedObjectsBook(5,"splunk","soumyadeep","ss",11);
		UserDefinedObjectsBook b6=new UserDefinedObjectsBook(6,"python","soumyadeep","ss",11);
		UserDefinedObjectsBook b7=new UserDefinedObjectsBook(7,"data science","soumyadeep","ss",11);
		UserDefinedObjectsBook b8=new UserDefinedObjectsBook(8,"data scientist","soumyadeep","ss",11);
		
		EnumMap<key,UserDefinedObjectsBook> enumMap = new EnumMap<>(key.class);
		enumMap.put(key.one,b1);
		enumMap.put(key.two,b2);
		enumMap.put(key.three,b3);
		enumMap.put(key.four,b4);
		enumMap.put(key.five,b5);
		enumMap.put(key.six,b6);
		enumMap.put(key.seven,b7);
		enumMap.put(key.eight,b8);

		for(Map.Entry<key, UserDefinedObjectsBook> entry : enumMap.entrySet()) {
			key k=entry.getKey();
			UserDefinedObjectsBook book=entry.getValue();
			System.out.println(k + " Key Details");
			System.out.println(book.id+" "+book.name+" "+book.author+" "+book.publisher+" "+book.quantity);
		}
	}
}
