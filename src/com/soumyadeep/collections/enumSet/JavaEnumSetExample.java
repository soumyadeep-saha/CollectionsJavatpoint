package com.soumyadeep.collections.enumSet;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class JavaEnumSetExample {

	 enum days {
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THUSRDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
	public static void main(String[] args) {

		Set<days> day=EnumSet.of(days.MONDAY,days.TUESDAY);
		Iterator itr=day.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

