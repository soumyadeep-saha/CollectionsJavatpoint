package com.soumyadeep.collections.linkedList;

import java.util.Iterator;
import java.util.ArrayList;

public class ListInterface {

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
		
		Iterator<String> itr=arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
