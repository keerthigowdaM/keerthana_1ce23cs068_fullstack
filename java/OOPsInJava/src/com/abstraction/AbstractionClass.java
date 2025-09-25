package com.abstraction;

abstract class Shape{
	//this will contains both abstrat and non-abstract methods
	//we can't create a object for abstract class
	// 0 - 100%
	abstract void draw();
	public void  display() {
		System.out.println("This is display function");
	}
}

class Circle extends Shape{
	
	@Override
	void draw() {
		System.out.println("This is shape draw method");
	}
}
public class AbstractionClass {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();
		circle.display();
	}

}
