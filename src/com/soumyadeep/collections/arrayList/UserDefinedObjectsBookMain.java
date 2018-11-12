package com.soumyadeep.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

import com.soumyadeep.collections.linkedList.UserDefinedObjectsBook;

public class UserDefinedObjectsBookMain {

	public static void main(String[] args) {
		
		UserDefinedObjectsBook b1 = new UserDefinedObjectsBook(1, "java", "soumyadeep1", "ss1", 1);
		UserDefinedObjectsBook b2 = new UserDefinedObjectsBook(2, "spring boot", "soumyadeep2", "ss2", 2);
		UserDefinedObjectsBook b3 = new UserDefinedObjectsBook(3, "microservices", "soumyadeep3", "ss3", 3);
		UserDefinedObjectsBook b4 = new UserDefinedObjectsBook(4, "react", "soumyadeep4", "ss4", 4);
		UserDefinedObjectsBook b5 = new UserDefinedObjectsBook(5, "splunk", "soumyadeep5", "ss5", 5);
		UserDefinedObjectsBook b6 = new UserDefinedObjectsBook(6, "python", "soumyadeep6", "ss6", 6);
		UserDefinedObjectsBook b7 = new UserDefinedObjectsBook(7, "data science", "soumyadeep7", "ss7", 7);
		UserDefinedObjectsBook b8 = new UserDefinedObjectsBook(8, "data scientist", "soumyadeep8", "ss8", 8);
		
		ArrayList<UserDefinedObjectsBook> arrayList=new ArrayList<>();
		arrayList.add(b1);
		arrayList.add(b2);
		arrayList.add(b3);
		arrayList.add(b4);
		arrayList.add(b5);
		arrayList.add(b6);
		arrayList.add(b7);
		arrayList.add(b8);
		
		Iterator<UserDefinedObjectsBook> itr=arrayList.iterator();
		while(itr.hasNext()) {
			UserDefinedObjectsBook ub=(UserDefinedObjectsBook)itr.next();
			System.out.println(ub.id);
			System.out.println(itr.next());
		}
	}
}
