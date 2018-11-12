package com.soumyadeep.collections.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		UserDefinedObjectsBook b1 = (UserDefinedObjectsBook) o1;
		UserDefinedObjectsBook b2 = (UserDefinedObjectsBook) o2;

		return b1.name.compareTo(b2.name);
	}
}
