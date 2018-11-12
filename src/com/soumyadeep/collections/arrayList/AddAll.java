package com.soumyadeep.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AddAll {

	public static void main(String[] args) {

		ArrayList<String> arrayList1=new ArrayList<>();
		arrayList1.add("soumyadeep1");
		arrayList1.add("soumyadeep2");
		arrayList1.add("soumyadeep3");
		arrayList1.add("soumyadeep4");
		arrayList1.add("soumyadeep5");
		
		ArrayList<String> arrayList2=new ArrayList<>();
		arrayList2.add("soumyadeep6");
		arrayList2.add("soumyadeep7");
		arrayList2.add("soumyadeep8");
		arrayList2.add("soumyadeep9");
		arrayList2.add("soumyadeep10");
		
		arrayList1.addAll(arrayList2);
		Iterator<String> itr1=arrayList1.iterator();
		System.out.println("<<<<AddAll method>>>>");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
