package com.soumyadeep.collections.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class JavaLinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add("soumyadeep1");
		linkedHashSet.add("soumyadeep2");
		linkedHashSet.add("soumyadeep3");
		linkedHashSet.add("soumyadeep4");
		linkedHashSet.add("soumyadeep5");
		linkedHashSet.add("soumyadeep6");
		linkedHashSet.add("soumyadeep7");
		linkedHashSet.add("soumyadeep8");
		linkedHashSet.add("soumyadeep9");
		linkedHashSet.add("soumyadeep1");
		linkedHashSet.add("soumyadeep1");
		linkedHashSet.add("soumyadeep1");
		linkedHashSet.add("soumyadeep1");
		linkedHashSet.add("soumyadeep1");
		linkedHashSet.add("soumyadeep2");
		linkedHashSet.add("soumyadeep2");
		linkedHashSet.add("soumyadeep2");
		linkedHashSet.add("soumyadeep2");
		linkedHashSet.add("soumyadeep2");
		Iterator<String> itr=linkedHashSet.iterator();
		System.out.println("<<<<LinkedHashSet class>>>>");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
