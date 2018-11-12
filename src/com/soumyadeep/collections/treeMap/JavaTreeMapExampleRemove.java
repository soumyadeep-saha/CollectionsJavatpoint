package com.soumyadeep.collections.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class JavaTreeMapExampleRemove {

	public static void main(String[] args) {

		TreeMap<Integer,String> treeMap=new TreeMap<>();
		treeMap.put(6, "soumyadeep6");
		treeMap.put(7, "soumyadeep7");
		treeMap.put(8, "soumyadeep8");
		treeMap.put(1, "soumyadeep1");
		treeMap.put(2, "soumyadeep2");
		treeMap.put(3, "soumyadeep3");
		treeMap.put(9, "soumyadeep9");
		treeMap.put(10, "soumyadeep10");
		treeMap.put(4, "soumyadeep4");
		treeMap.put(5, "soumyadeep5");
		System.out.println("<<<<Before removing elements>>>>");
		for(Map.Entry<Integer, String> map : treeMap.entrySet()) {
			System.out.println(map.getKey() +" "+map.getValue());
		}
		treeMap.remove(7);
		treeMap.remove(6);
		System.out.println("<<<<After removing 2 elements>>>>");
		for(Map.Entry<Integer, String> map : treeMap.entrySet()) {
			System.out.println(map.getKey() +" "+map.getValue());
		}
	}
}
