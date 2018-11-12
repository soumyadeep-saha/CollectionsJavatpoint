package com.soumyadeep.collections.linkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class JavaLinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> arrayList=new LinkedList<>();
		arrayList.add("soumyadeep1");
		arrayList.add("soumyadeep2");
		arrayList.add("soumyadeep3");
		arrayList.add("soumyadeep4");
		arrayList.add("soumyadeep5");
		arrayList.add("soumyadeep6");
		arrayList.add("soumyadeep7");
		arrayList.add("soumyadeep8");
		arrayList.add("soumyadeep9");
		arrayList.add("soumyadeep1");
		arrayList.add("soumyadeep1");
		
		Iterator<String> itr=arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
