package com.soumyadeep.collections.enumSet;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class JavaEnumSeAllOfNoneOf {

	public enum days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
	}

	public static void main(String[] args) {

		Set<days> weekdays = EnumSet.allOf(days.class);
		System.out.println(weekdays);
		Iterator<days> itr1 = weekdays.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		Set<days> weekend = EnumSet.noneOf(days.class);
		System.out.println(weekend);
		Iterator<days> itr2 = weekend.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
