package com.ravi.corejava;

public class D {
	
	 D(int i ) {
		System.out.println("hi");
	}
	 
	 D(int i ,int j) {
			System.out.println("hello");
			System.out.println("success");
		}
	 	public static void main(String[] args) {
			D d1 = new D(10);
		}
}
/* output: hi */