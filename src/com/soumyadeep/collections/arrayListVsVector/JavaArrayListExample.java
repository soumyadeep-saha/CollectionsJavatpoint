package com.soumyadeep.collections.arrayListVsVector;

import java.util.Enumeration;
import java.util.Vector;

public class JavaArrayListExample {

	public static void main(String[] args) {

		Vector<String> vector=new Vector<>();
		vector.add("soumyadeep1");
		vector.add("soumyadeep2");
		vector.addElement("soumyadeep3");
		vector.add("soumyadeep4");
		vector.add("soumyadeep5");
		vector.addElement("soumyadeep6");
		vector.add("soumyadeep7");
		vector.add("soumyadeep8");
		vector.addElement("soumyadeep9");
		vector.add("soumyadeep1");
		vector.add("soumyadeep1");
		
		Enumeration e=vector.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
