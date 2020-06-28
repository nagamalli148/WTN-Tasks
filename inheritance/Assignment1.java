package com.wipro.inheritance;

class Animal {
	
	public void eat () {
		System.out.println("Animal eating");
	}
	
	public void sleep () {
		System.out.println("Animal sleeping");
	}
}

class Bird extends Animal {

	@Override
	public void eat () {
		System.out.println("Bird eating");
	}
	
	@Override
	public void sleep () {
		System.out.println("Bird sleeping");
	}
	
	public void fly () {
		System.out.println("Bird flying");
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();

		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}

}