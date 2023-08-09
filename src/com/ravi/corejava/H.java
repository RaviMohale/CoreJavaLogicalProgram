package com.ravi.corejava;

public class H {
	 H() {
		System.out.println("Zero para constructor...");
	}
	 
	 H(int i){
		 H h1 = new H();
		System.out.println("1 para constructor..."); 
	 }
	 public static void main(String[] args) {
		H obj1 = new H();
		System.out.println("===============");
		H obj2 = new H(10);
		System.out.println("***************");
	}

}
