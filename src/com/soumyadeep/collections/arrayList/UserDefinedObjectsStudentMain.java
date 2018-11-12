package com.soumyadeep.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefinedObjectsStudentMain {

	public static void main(String[] args) {
		
		/*
		 * If toString() is there then printing objects gives expected result, without it gives HashCode representation of object
		 * make bean class variable as public to directly access it
		 */

		UserDefinedObjectsStudent u1=new UserDefinedObjectsStudent(1,"soumyadeep1","India",11000000);
		UserDefinedObjectsStudent u2=new UserDefinedObjectsStudent(2,"soumyadeep2","India",12000000);
		UserDefinedObjectsStudent u3=new UserDefinedObjectsStudent(3,"soumyadeep3","India",14000000);
		UserDefinedObjectsStudent u4=new UserDefinedObjectsStudent(4,"soumyadeep4","India",15000000);
		ArrayList<UserDefinedObjectsStudent> arrayList=new ArrayList<>();
		arrayList.add(u1);
		arrayList.add(u2);
		arrayList.add(u3);
		arrayList.add(u4);
		
		Iterator<UserDefinedObjectsStudent> itr=arrayList.iterator();
		while(itr.hasNext()) {
			UserDefinedObjectsStudent ud=(UserDefinedObjectsStudent)itr.next();
			System.out.println(ud.id);
			System.out.println(ud);
		}
	}

}
