package com.soumyadeep.collections.arrayList;

public class UserDefinedObjectsStudent {
	
	public int id;
	private String name;
	private String address;
	private double salary;
	
	public UserDefinedObjectsStudent(int id, String name, String address,double salary) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+address+" "+salary;
	}

}
