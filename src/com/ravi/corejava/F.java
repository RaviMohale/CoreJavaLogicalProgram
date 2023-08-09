package com.ravi.corejava;

public class F {
	 F() {
		System.out.println("Default constructor");
	}
	 
	 F(int i ) {
		 this();
			System.out.println("1 para  constructor");
		}
	 public static void main(String[] args) {
	F f1 = new F();
	System.out.println("==============");
	F f2 = new F(10);
	System.out.println("==========");
	}
}
/*
 * output :
 * 
 * Default constructor 
 * ============== 
 * Default constructor 
 * 1 para constructor
 * ==========
 */