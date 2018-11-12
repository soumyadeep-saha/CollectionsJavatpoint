package com.soumyadeep.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class JavaArrayDequeExample {

	public static void main(String[] args) {

		Deque<String> arrayDeque=new ArrayDeque<>();
		arrayDeque.add("soumyadeep5");
		arrayDeque.add("soumyadeep6");
		arrayDeque.add("soumyadeep7");
		arrayDeque.add("soumyadeep8");
		arrayDeque.add("soumyadeep1");
		arrayDeque.add("soumyadeep2");
		arrayDeque.add("soumyadeep3");
		arrayDeque.add("soumyadeep4");
		arrayDeque.add("soumyadeep9");
		arrayDeque.add("soumyadeep1");
		arrayDeque.add("soumyadeep1");
		arrayDeque.add("soumyadeep1");
		arrayDeque.add("soumyadeep1");
		arrayDeque.add("soumyadeep1");
		arrayDeque.add("soumyadeep2");
		arrayDeque.add("soumyadeep2");
		arrayDeque.add("soumyadeep2");
		arrayDeque.add("soumyadeep2");
		arrayDeque.offerFirst("soumyadeep11");
		Iterator<String> itr=arrayDeque.iterator();
		System.out.println("<<<<ArrayDeque class>>>>");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		arrayDeque.remove();
		arrayDeque.pollLast();
		Iterator<String> itrd=arrayDeque.iterator();
		System.out.println("<<<<ArrayDeque after deletion>>>>");
		while(itrd.hasNext()) {
			System.out.println(itrd.next());
		}
	}
}
