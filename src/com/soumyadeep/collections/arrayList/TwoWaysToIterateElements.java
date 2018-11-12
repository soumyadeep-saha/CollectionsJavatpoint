package com.soumyadeep.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TwoWaysToIterateElements {

	public static void main(String[] args) {

		//By iterator
		ArrayList<String> arrayList1=new ArrayList<>();
		arrayList1.add("soumyadeep1");
		arrayList1.add("soumyadeep2");
		arrayList1.add("soumyadeep3");
		arrayList1.add("soumyadeep4");
		arrayList1.add("soumyadeep5");
		arrayList1.add("soumyadeep6");
		arrayList1.add("soumyadeep7");
		arrayList1.add("soumyadeep8");
		arrayList1.add("soumyadeep9");
		arrayList1.add("soumyadeep1");
		arrayList1.add("soumyadeep1");
		System.out.println("<<<<By Iterator>>>>");
		Iterator<String> itr1=arrayList1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		//By for-each loop
		ArrayList<String> arrayList2=new ArrayList<>();
		arrayList2.add("soumyadeep1");
		arrayList2.add("soumyadeep2");
		arrayList2.add("soumyadeep3");
		arrayList2.add("soumyadeep4");
		arrayList2.add("soumyadeep5");
		arrayList2.add("soumyadeep6");
		arrayList2.add("soumyadeep7");
		arrayList2.add("soumyadeep8");
		arrayList2.add("soumyadeep9");
		arrayList2.add("soumyadeep1");
		arrayList2.add("soumyadeep1");
		System.out.println("<<<<By for-each>>>>");
		for(String s:arrayList2) {
			System.out.println(s);
		}
	}
}
