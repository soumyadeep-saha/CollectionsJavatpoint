package com.soumyadeep.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingElementsWrapper {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(1);
		arrayList.add(Integer.valueOf(3));
		arrayList.add(Integer.valueOf(4));
		arrayList.add(2);

		Collections.sort(arrayList);
		Iterator<Integer> itr=arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
