package com.constructors;

class GrandParent{
	public GrandParent() { 
		super();
		System.out.println("Grand parent Constructor");
	}
}

class Person extends GrandParent{
	int parent_Id = 20;
	public Person() {
		super();
		System.out.println("Person constructor");
	}
}

class Student extends Person{
	private int id;
	private String name;
	public Student(int id, String name) { 
		this.id = id;
		this.name = name;
	}
	public Student(int id) { 
		super();
		this.id = id;
	}
}

public class ConstructorInJava {
	public static void main(String[] args) {
		Student s1= new Student(101,"Mohan");
		Student s2= new Student(102);
		System.out.println("First student : ");
		System.out.println("Id : "+s1.id);
		System.out.println("Name : "+s1.name);
	}
}




