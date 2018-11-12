package com.soumyadeep.collections.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaLinkedHashMapExampleRemove {

	public static void main(String[] args) {

		LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();
		linkedHashMap.put(6, "soumyadeep6");
		linkedHashMap.put(7, "soumyadeep7");
		linkedHashMap.put(8, "soumyadeep8");
		linkedHashMap.put(1, "soumyadeep1");
		linkedHashMap.put(2, "soumyadeep2");
		linkedHashMap.put(3, "soumyadeep3");
		linkedHashMap.put(9, "soumyadeep9");
		linkedHashMap.put(10, "soumyadeep10");
		linkedHashMap.put(4, "soumyadeep4");
		linkedHashMap.put(5, "soumyadeep5");
		System.out.println("<<<<Before removing elements>>>>");
		for(Map.Entry<Integer, String> map : linkedHashMap.entrySet()) {
			System.out.println(map.getKey() +" "+map.getValue());
		}
		linkedHashMap.remove(7);
		linkedHashMap.remove(6);
		System.out.println("<<<<After removing 2 elements>>>>");
		for(Map.Entry<Integer, String> map : linkedHashMap.entrySet()) {
			System.out.println(map.getKey() +" "+map.getValue());
		}
	}
}
