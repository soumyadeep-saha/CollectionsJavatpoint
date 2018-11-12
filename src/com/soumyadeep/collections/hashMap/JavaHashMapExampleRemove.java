package com.soumyadeep.collections.hashMap;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapExampleRemove {

	public static void main(String[] args) {

		HashMap<Integer,String> hashMap=new HashMap<>();
		hashMap.put(6, "soumyadeep6");
		hashMap.put(7, "soumyadeep7");
		hashMap.put(8, "soumyadeep8");
		hashMap.put(1, "soumyadeep1");
		hashMap.put(2, "soumyadeep2");
		hashMap.put(3, "soumyadeep3");
		hashMap.put(9, "soumyadeep9");
		hashMap.put(10, "soumyadeep10");
		hashMap.put(4, "soumyadeep4");
		hashMap.put(5, "soumyadeep5");
		System.out.println("<<<<Before removing elements>>>>");
		for(Map.Entry<Integer, String> map : hashMap.entrySet()) {
			System.out.println(map.getKey() +" "+map.getValue());
		}
		hashMap.remove(7);
		hashMap.remove(6);
		System.out.println("<<<<After removing 2 elements>>>>");
		for(Map.Entry<Integer, String> map : hashMap.entrySet()) {
			System.out.println(map.getKey() +" "+map.getValue());
		}
	}
}
