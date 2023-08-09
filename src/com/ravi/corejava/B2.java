package com.ravi.corejava;

public class B2 {
	B2(int i) {
			System.out.println("I can overload");
	}
	public static void main(String[] args) {
		B2 b = new B2();
		//B2 b = new B2(10);
		System.out.println("Hello world");
		
	}
	{
		System.out.println(" From IB");
	}
}

/*
 *  Ans : Compile time error 
 *  
 */

