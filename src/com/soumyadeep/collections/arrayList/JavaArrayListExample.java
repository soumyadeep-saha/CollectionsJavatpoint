package com.soumyadeep.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrayListExample {

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
		
		Iterator<String> itr=arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
