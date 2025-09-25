package com.abstraction;

class Car implements Vehicle{
	public void start() {
        System.out.println("Car starting...");
    }
    public void stop() {
        System.out.println("Car stopping...");
    }
}

public class AbstractInterface {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.stop();
		Vehicle.display();
	}

}



