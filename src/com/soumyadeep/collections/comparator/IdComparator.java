package com.soumyadeep.collections.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		UserDefinedObjectsBook b1 = (UserDefinedObjectsBook) o1;
		UserDefinedObjectsBook b2 = (UserDefinedObjectsBook) o2;

		if (b1.id > b2.id) {
			return 1;
		} else if (b1.id < b2.id) {
			return -1;
		} else {
			return 0;
		}
	}
}
