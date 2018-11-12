package com.soumyadeep.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsInJava {

	public static void main(String[] args) {

		/*
		 * The ArrayList class implements the List interface. It uses a dynamic array to
		 * store the duplicate element of different data types. The ArrayList class
		 * maintains the insertion order and is non-synchronized. The elements stored in
		 * ArrayList class can be randomly accessed
		 */
		List<String> list1 = new ArrayList<>();
		list1.add("soumyadeep1");
		list1.add("soumyadeep2");
		list1.add("soumyadeep3");
		list1.add("soumyadeep4");
		list1.add("soumyadeep5");
		list1.add("soumyadeep6");
		list1.add("soumyadeep7");
		list1.add("soumyadeep8");
		list1.add("soumyadeep9");
		list1.add("soumyadeep10");
		System.out.println("<<<<ArrayList elements>>>>");
		Iterator<String> itr1 = list1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		/*
		 * LinkedList implements the Collection interface. It uses a doubly linked list
		 * internally to store the elements. It can store the duplicate elements. It
		 * maintains the insertion order and is not synchronized. In LinkedList, the
		 * manipulation is fast because no shifting is required
		 */
		List<String> list2 = new LinkedList<>();
		list2.add("soumyadeep1");
		list2.add("soumyadeep2");
		list2.add("soumyadeep3");
		list2.add("soumyadeep4");
		list2.add("soumyadeep5");
		list2.add("soumyadeep6");
		list2.add("soumyadeep7");
		list2.add("soumyadeep8");
		list2.add("soumyadeep9");
		list2.add("soumyadeep10");
		System.out.println("<<<<LinkedList elements>>>>");
		Iterator<String> itr2 = list2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		/*
		 * Vector uses a dynamic array to store the data elements. It is similar to
		 * ArrayList. However, It is synchronized and contains many methods that are not
		 * the part of Collection framework
		 */
		Vector<String> list3 = new Vector<>();
		list3.add("soumyadeep1");
		list3.add("soumyadeep2");
		list3.add("soumyadeep3");
		list3.add("soumyadeep4");
		list3.add("soumyadeep5");
		list3.add("soumyadeep6");
		list3.add("soumyadeep7");
		list3.add("soumyadeep8");
		list3.add("soumyadeep9");
		list3.add("soumyadeep10");
		System.out.println("<<<<Vector elements>>>>");
		Iterator<String> itr3 = list3.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}

		/*
		 * The stack is the subclass of Vector. It implements the last-in-first-out data
		 * structure, i.e., Stack. The stack contains all of the methods of Vector class
		 * and also provides its own methods like boolean push(), boolean peek(),
		 * boolean push(object o), which defines its properties
		 */
		Stack<String> list4 = new Stack<>();
		list4.add("soumyadeep1");
		list4.add("soumyadeep2");
		list4.add("soumyadeep3");
		list4.add("soumyadeep4");
		list4.add("soumyadeep5");
		list4.add("soumyadeep6");
		list4.add("soumyadeep7");
		list4.add("soumyadeep8");
		list4.add("soumyadeep9");
		list4.add("soumyadeep10");
		System.out.println("<<<<Stack elements>>>>");
		Iterator<String> itr4 = list4.iterator();
		while (itr4.hasNext()) {
			System.out.println(itr4.next());
		}

		/*
		 * Queue interface maintains the first-in-first-out order. It can be defined as
		 * an ordered list that is used to hold the elements which are about to be
		 * processed. There are various classes like PriorityQueue, Deque, ArrayDeque,
		 * etc. which implements the Queue interface.
		 * 
		 * Queue interface can be instantiated as:
		 * 
		 * Queue<String> q1 = new PriorityQueue(); Queue<String> q2 = new ArrayDeque();
		 */

		/*
		 * The PriorityQueue class implements the Queue interface. It holds the elements
		 * or objects which are to be processed by their priorities. PriorityQueue
		 * doesn't allow null values to be stored in the queue
		 */
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("soumyadeep1");
		priorityQueue.add("soumyadeep2");
		priorityQueue.add("soumyadeep3");
		priorityQueue.add("soumyadeep4");
		priorityQueue.add("soumyadeep5");
		priorityQueue.add("soumyadeep6");
		priorityQueue.add("soumyadeep7");
		priorityQueue.add("soumyadeep8");
		priorityQueue.add("soumyadeep9");
		priorityQueue.add("soumyadeep10");
		System.out.println("Head " + priorityQueue.element());
		System.out.println("Peek " + priorityQueue.peek());
		System.out.println("<<<<PriorityQueue elements>>>>");
		Iterator<String> itr5 = priorityQueue.iterator();
		while (itr5.hasNext()) {
			System.out.println(itr5.next());
		}
		priorityQueue.poll();
		priorityQueue.remove();
		System.out.println("<<<<PriorityQueue after removing 2 elements>>>>");
		Iterator<String> itr6 = priorityQueue.iterator();
		while (itr6.hasNext()) {
			System.out.println(itr6.next());
		}

		/*
		 * Deque interface extends the Queue interface. In Deque, we can remove and add
		 * the elements from both the side. Deque stands for a double-ended queue which
		 * enables us to perform the operations at both the ends. Deque can be
		 * instantiated as: Deque d = new ArrayDeque();
		 * 
		 * ArrayDeque class implements the Deque interface. It facilitates us to use the
		 * Deque. Unlike queue, we can add or delete the elements from both the ends.
		 * 
		 * ArrayDeque is faster than ArrayList and Stack and has no capacity
		 * restrictions
		 */
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("soumyadeep1");
		deque.add("soumyadeep2");
		deque.add("soumyadeep3");
		deque.add("soumyadeep4");
		deque.add("soumyadeep5");
		deque.add("soumyadeep6");
		deque.add("soumyadeep7");
		deque.add("soumyadeep8");
		deque.add("soumyadeep9");
		deque.add("soumyadeep10");
		System.out.println("<<<<Deque elements>>>>");
		Iterator<String> itr7 = deque.iterator();
		while (itr7.hasNext()) {
			System.out.println(itr7.next());
		}

		/*
		 * Set Interface in Java is present in java.util package. It extends the
		 * Collection interface. It represents the unordered set of elements which
		 * doesn't allow us to store the duplicate items. We can store at most one null
		 * value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet
		 */
		/*
		 * HashSet class implements Set Interface. It represents the collection that
		 * uses a hash table for storage. Hashing is used to store the elements in the
		 * HashSet. It contains the unique items
		 */
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("soumyadeep1");
		hashSet.add("soumyadeep2");
		hashSet.add("soumyadeep3");
		hashSet.add("soumyadeep4");
		hashSet.add("soumyadeep5");
		hashSet.add("soumyadeep6");
		hashSet.add("soumyadeep7");
		hashSet.add("soumyadeep8");
		hashSet.add("soumyadeep9");
		hashSet.add("soumyadeep10");
		System.out.println("<<<<HashSet elements>>>>");
		Iterator<String> itr8 = hashSet.iterator();
		while (itr8.hasNext()) {
			System.out.println(itr8.next());
		}

		/*
		 * LinkedHashSet class represents the LinkedList implementation of Set
		 * Interface. It extends the HashSet class and implements Set interface. Like
		 * HashSet, It also contains unique elements. It maintains the insertion order
		 * and permits null elements
		 */
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("soumyadeep6");
		linkedHashSet.add("soumyadeep7");
		linkedHashSet.add("soumyadeep8");
		linkedHashSet.add("soumyadeep9");
		linkedHashSet.add("soumyadeep10");
		linkedHashSet.add("soumyadeep1");
		linkedHashSet.add("soumyadeep2");
		linkedHashSet.add("soumyadeep3");
		linkedHashSet.add("soumyadeep4");
		linkedHashSet.add("soumyadeep5");
		System.out.println("<<<<LinkedHashSet elements>>>>");
		Iterator<String> itr9 = linkedHashSet.iterator();
		while (itr9.hasNext()) {
			System.out.println(itr9.next());
		}

		/*
		 * SortedSet is the alternate of Set interface that provides a total ordering on
		 * its elements. The elements of the SortedSet are arranged in the increasing
		 * (ascending) order. The SortedSet provides the additional methods that inhibit
		 * the natural ordering of the elements
		 */
		/*
		 * Java TreeSet class implements the Set interface that uses a tree for storage.
		 * Like HashSet, TreeSet also contains the unique elements However, the access
		 * and retrieval time of TreeSet is quite fast. The elements in TreeSet stored
		 * in ascending order
		 */
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("soumyadeep6");
		treeSet.add("soumyadeep7");
		treeSet.add("soumyadeep8");
		treeSet.add("soumyadeep9");
		treeSet.add("soumyadeep10");
		treeSet.add("soumyadeep1");
		treeSet.add("soumyadeep2");
		treeSet.add("soumyadeep3");
		treeSet.add("soumyadeep4");
		treeSet.add("soumyadeep5");
		System.out.println("<<<<TreeSet elements>>>>");
		Iterator<String> itr10 = treeSet.iterator();
		while (itr10.hasNext()) {
			System.out.println(itr10.next());
		}
	}
}
