package com.ravi.corejava;

public class I {

	I() {

		System.out.println("Zero param constructor");
	}

	I(int i) {
	//	this();
		System.out.println("Zero param constructor");
		this();// this() must be the fist statement while calling the constructor
	}
	
	public static void main(String[] args) {
		I i1 = new I(10);
		System.out.println("success");
	}

}

/* output : 
 * compile time error 
 */
