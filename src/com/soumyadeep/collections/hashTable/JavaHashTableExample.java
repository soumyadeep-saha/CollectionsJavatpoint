package com.soumyadeep.collections.hashTable;

import java.util.Hashtable;
import java.util.Map;

public class JavaHashTableExample {

	public static void main(String[] args) {

		Hashtable<Integer,String> hashtable=new Hashtable<>();
		hashtable.put(6, "soumyadeep6");
		hashtable.put(7, "soumyadeep7");
		hashtable.put(8, "soumyadeep8");
		hashtable.put(1, "soumyadeep1");
		hashtable.put(2, "soumyadeep2");
		hashtable.put(3, "soumyadeep3");
		hashtable.put(9, "soumyadeep9");
		hashtable.put(10, "soumyadeep10");
		hashtable.put(4, "soumyadeep4");
		hashtable.put(5, "soumyadeep5");
		for(Map.Entry<Integer, String> map : hashtable.entrySet()) {
			System.out.println(map.getKey() +" "+map.getValue());
		}
	}
}
