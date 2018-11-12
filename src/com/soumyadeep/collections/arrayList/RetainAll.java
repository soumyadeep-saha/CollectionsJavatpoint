package com.soumyadeep.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class RetainAll {

	public static void main(String[] args) {

		ArrayList<String> arrayList1=new ArrayList<>();
		arrayList1.add("soumyadeep1");
		arrayList1.add("soumyadeep2");
		arrayList1.add("soumyadeep3");
		arrayList1.add("soumyadeep4");
		arrayList1.add("soumyadeep5");
		
		ArrayList<String> arrayList2=new ArrayList<>();
		arrayList2.add("soumyadeep1");
		
		arrayList1.retainAll(arrayList2);
		Iterator<String> itr1=arrayList1.iterator();
		System.out.println("<<<<RetainAll method>>>>");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
