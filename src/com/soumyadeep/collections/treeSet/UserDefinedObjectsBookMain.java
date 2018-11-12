package com.soumyadeep.collections.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class UserDefinedObjectsBookMain {

	public static void main(String[] args) {

		UserDefinedObjectsBook b5 = new UserDefinedObjectsBook(5, "splunk", "soumyadeep5", "ss5", 5);
		UserDefinedObjectsBook b6 = new UserDefinedObjectsBook(6, "python", "soumyadeep6", "ss6", 6);
		UserDefinedObjectsBook b7 = new UserDefinedObjectsBook(7, "data science", "soumyadeep7", "ss7", 7);
		UserDefinedObjectsBook b8 = new UserDefinedObjectsBook(8, "data scientist", "soumyadeep8", "ss8", 8);
		UserDefinedObjectsBook b1 = new UserDefinedObjectsBook(1, "java", "soumyadeep1", "ss1", 1);
		UserDefinedObjectsBook b2 = new UserDefinedObjectsBook(2, "spring boot", "soumyadeep2", "ss2", 2);
		UserDefinedObjectsBook b3 = new UserDefinedObjectsBook(3, "microservices", "soumyadeep3", "ss3", 3);
		UserDefinedObjectsBook b4 = new UserDefinedObjectsBook(4, "react", "soumyadeep4", "ss4", 4);

		TreeSet<UserDefinedObjectsBook> treeSet=new TreeSet<>();
		treeSet.add(b1);
		treeSet.add(b2);
		treeSet.add(b3);
		treeSet.add(b4);
		treeSet.add(b5);
		treeSet.add(b6);
		treeSet.add(b7);
		treeSet.add(b8);
		
		Iterator<UserDefinedObjectsBook> itr=treeSet.iterator();
		while(itr.hasNext()) {
			//UserDefinedObjectsBook ub=(UserDefinedObjectsBook)itr.next();
			System.out.println(itr.next());
		}
	}
}
