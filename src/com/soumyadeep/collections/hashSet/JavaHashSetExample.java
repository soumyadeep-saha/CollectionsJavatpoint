package com.soumyadeep.collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class JavaHashSetExample {

	public static void main(String[] args) {

		HashSet<String> hashSet=new HashSet<>();
		hashSet.add("soumyadeep1");
		hashSet.add("soumyadeep2");
		hashSet.add("soumyadeep3");
		hashSet.add("soumyadeep4");
		hashSet.add("soumyadeep5");
		hashSet.add("soumyadeep6");
		hashSet.add("soumyadeep7");
		hashSet.add("soumyadeep8");
		hashSet.add("soumyadeep9");
		hashSet.add("soumyadeep1");
		hashSet.add("soumyadeep1");
		hashSet.add("soumyadeep1");
		hashSet.add("soumyadeep1");
		hashSet.add("soumyadeep1");
		hashSet.add("soumyadeep2");
		hashSet.add("soumyadeep2");
		hashSet.add("soumyadeep2");
		hashSet.add("soumyadeep2");
		hashSet.add("soumyadeep2");
		Iterator<String> itr=hashSet.iterator();
		System.out.println("<<<<HashSet class>>>>");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
