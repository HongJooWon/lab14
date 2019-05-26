package edu.handong.csee.java.inheritance;

public class Dog extends Animal {

	@Override
	public void testInstanceMethod() {
		super.testInstanceMethod(); //overriding
		System.out.println("testInstamnceMethod in Dog");
	}

}