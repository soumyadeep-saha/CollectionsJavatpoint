package com.soumyadeep.collections.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaCollectionsExampleMin {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(46);
		list.add(99);
		list.add(24);
		list.add(16);
		list.add(8);
		list.add(12);
		System.out.println("Value of minimum element from the collection: " + Collections.min(list));
	}
}
