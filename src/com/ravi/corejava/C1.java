package com.ravi.corejava;

public class C1 {
	
	 C1() {
		System.out.println("hey i am availabe in Pune");
	}
	 
	 public static void main(String[] args) {
		C1 obj = new C1();
		System.out.println("success");
		
	}
		static {
			System.out.println(" I am first");
		}

}


/*
 * output : I am first 
 * 			hey i am availabe in Pune
 * 		    success
 */