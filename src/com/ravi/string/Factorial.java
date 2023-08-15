package com.ravi.string;

public class Factorial {
	
	static int factorial(int i) {
		if(i==1) {
			return 1;
		}else {
			return i * factorial(i-1);
		}
	}
	
	
public static void main(String[] args) throws Exception {
	System.out.println(factorial(5));
	/*
	 * int num = 1;
	 * 
	 * for(int i= 1; i<=5; i++) {
	 * 
	 * num = num*i; } System.out.println(num);
	 */
}
}
