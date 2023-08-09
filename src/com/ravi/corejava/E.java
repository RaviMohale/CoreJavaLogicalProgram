package com.ravi.corejava;

public class E {

	 E(int i) {
		System.out.println("winter started....");
	}
	 

	 E(int i,int j) {
		 this();
		System.out.println("yes, started....");
	}
	 public static void main(String[] args) {
		E obj = new E(010,10);
	}
	 
}


/* Answer : Compile time error */