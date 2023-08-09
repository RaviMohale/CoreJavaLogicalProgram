package com.ravi.corejava;

public class Demo3 {
	
	public static void main(String[] args) {
		System.out.println("hello world !");
	}
	static {
		System.out.println("I am from static...");
	}
	
	static void test() {
		System.out.println("from test()");
	}

}
/*
 * output
 * 
 * I am from static...
 *  hello world !
 */