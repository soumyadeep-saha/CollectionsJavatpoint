package com.soumyadeep.collections.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class JavaCollectionsExample {

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
		arrayList.add("soumyadeep1");
		arrayList.add("soumyadeep1");
		
		Collections.addAll(arrayList, "soumyadeep11","soumyadeep21");
		Iterator<String> itr1=arrayList.iterator();
		System.out.println("<<<<Adding external elements>>>>");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		String [] str= {"1","2"};
		Collections.addAll(arrayList, str);
		Iterator<String> itr2=arrayList.iterator();
		System.out.println("<<<<Adding string array>>>>");
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
