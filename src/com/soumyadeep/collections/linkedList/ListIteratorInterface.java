package com.soumyadeep.collections.linkedList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorInterface {

	public static void main(String[] args) {

		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("soumyadeep1");
		arrayList.add("soumyadeep2");
		arrayList.add("soumyadeep3");
		arrayList.add("soumyadeep4");
		arrayList.add("soumyadeep5");
		arrayList.add("soumyadeep6");
		arrayList.add("soumyadeep7");
		arrayList.add("soumyadeep8");
		arrayList.add("soumyadeep9");
		arrayList.add(0,"soumyadeep11");
		arrayList.add(2,"soumyadeep11");
		
		ListIterator<String> itr=arrayList.listIterator();
		System.out.println("<<<<ListIterator is forward direction>>>>");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("<<<<ListIterator is backward direction>>>>");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}
