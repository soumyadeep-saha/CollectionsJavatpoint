package com.soumyadeep.collections.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class JavaTreeSetExample {

	public static void main(String[] args) {

		TreeSet<String> treeSet=new TreeSet<>();
		treeSet.add("soumyadeep5");
		treeSet.add("soumyadeep6");
		treeSet.add("soumyadeep7");
		treeSet.add("soumyadeep8");
		treeSet.add("soumyadeep1");
		treeSet.add("soumyadeep2");
		treeSet.add("soumyadeep3");
		treeSet.add("soumyadeep4");
		treeSet.add("soumyadeep9");
		treeSet.add("soumyadeep1");
		treeSet.add("soumyadeep1");
		treeSet.add("soumyadeep1");
		treeSet.add("soumyadeep1");
		treeSet.add("soumyadeep1");
		treeSet.add("soumyadeep2");
		treeSet.add("soumyadeep2");
		treeSet.add("soumyadeep2");
		treeSet.add("soumyadeep2");
		treeSet.add("soumyadeep2");
		Iterator<String> itr=treeSet.iterator();
		System.out.println("<<<<TreeSet class>>>>");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
