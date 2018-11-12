package com.soumyadeep.collections.linkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

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
		
		LinkedList<UserDefinedObjectsBook> arrayList = new LinkedList<>();
		arrayList.add(b1);
		arrayList.add(b2);
		arrayList.add(b3);
		arrayList.add(b4);
		arrayList.add(b5);
		arrayList.add(b6);
		arrayList.add(b7);
		arrayList.add(b8);

		Iterator<UserDefinedObjectsBook> itr = arrayList.iterator();
		while (itr.hasNext()) {
			//UserDefinedObjectsBook ub = (UserDefinedObjectsBook) itr.next();
			System.out.println(itr.next());
		}
	}
}
