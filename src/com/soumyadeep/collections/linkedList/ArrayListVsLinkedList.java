package com.soumyadeep.collections.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();// creating arraylist
		al.add("Ravi");// adding object in arraylist
		al.add("Vijay");
		al.add("Ravi");
		al.add("Rohit");

		List<String> al2 = new LinkedList<String>();// creating linkedlist
		al2.add("James");// adding object in linkedlist
		al2.add("Serena");
		al2.add("Swati");
		al2.add("Virat");

		System.out.println("arraylist: " + al);
		System.out.println("linkedlist: " + al2);
	}
}
