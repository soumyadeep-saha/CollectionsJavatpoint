package com.soumyadeep.collections.enumMap;

import java.util.EnumMap;
import java.util.Map;

public class JavaEnumMapExample {

	enum days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
	}

	public static void main(String[] args) {

		EnumMap<days, String> map = new EnumMap<days, String>(days.class);
		map.put(days.MONDAY, "1");
		map.put(days.TUESDAY, "2");
		map.put(days.WEDNESDAY, "3");
		map.put(days.THURSDAY, "4");
		map.put(days.FRIDAY, "5");

		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
