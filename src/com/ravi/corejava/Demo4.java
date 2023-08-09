package com.ravi.corejava;

public class Demo4 {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		test(); // test is instance method first create the object or else declared method as
				// static
	}

	void test() {
		System.out.println("Hi... i am test method()");
	}
}
/* Ans : Compile time error */