package com.ravi.corejava;

public class Demo9 {
	int i ;
	
	static void test1(int x) {
		x= 10;
	}
	
	static void test2(Demo9 d1) {
		d1.i = 20;
	}
	public static void main(String[] args) {
		Demo9 d1 = new Demo9();
		d1.i = 30;
		System.out.println("A :" + d1.i);
		Demo9 d2 = new Demo9();
		test1(d1.i);
		System.out.println("B :" + d1.i);
		test2(d1);
		System.out.println("C :" + d1.i);
	}

}
/*
 * Output
 * A :30 
 * B :30
 * C :20
 */