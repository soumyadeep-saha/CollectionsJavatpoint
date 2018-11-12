package com.soumyadeep.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaPriorityQueueExample {

	public static void main(String[] args) {

		Queue<String> priorityQueue=new PriorityQueue<>();
		priorityQueue.add("soumyadeep5");
		priorityQueue.add("soumyadeep6");
		priorityQueue.add("soumyadeep7");
		priorityQueue.add("soumyadeep8");
		priorityQueue.add("soumyadeep1");
		priorityQueue.add("soumyadeep2");
		priorityQueue.add("soumyadeep3");
		priorityQueue.add("soumyadeep4");
		priorityQueue.add("soumyadeep9");
		priorityQueue.add("soumyadeep1");
		priorityQueue.add("soumyadeep1");
		priorityQueue.add("soumyadeep1");
		priorityQueue.add("soumyadeep1");
		priorityQueue.add("soumyadeep1");
		priorityQueue.add("soumyadeep2");
		priorityQueue.add("soumyadeep2");
		priorityQueue.add("soumyadeep2");
		priorityQueue.add("soumyadeep2");
		priorityQueue.add("soumyadeep2");
		Iterator<String> itr=priorityQueue.iterator();
		System.out.println("<<<<PriorityQueue class>>>>");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		priorityQueue.remove();
		priorityQueue.poll();
		Iterator<String> itrd=priorityQueue.iterator();
		System.out.println("<<<<PriorityQueue after deletion>>>>");
		while(itrd.hasNext()) {
			System.out.println(itrd.next());
		}
	}
}
