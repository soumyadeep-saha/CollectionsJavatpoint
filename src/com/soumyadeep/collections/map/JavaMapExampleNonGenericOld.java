package com.soumyadeep.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JavaMapExampleNonGenericOld {

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
		
		Set set=hashMap.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String> entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
	}
}
