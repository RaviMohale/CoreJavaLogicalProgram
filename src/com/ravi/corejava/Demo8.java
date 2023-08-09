package com.ravi.corejava;

public class Demo8 {
	static Demo8 test() {
		return new Demo8();
	}
 public static void main(String[] args) {
	Demo8 d = new Demo8();
	d.test1();
}
 void test1() {
	System.out.println("success");
	
}
}
/*
 * output :
 * success
 */
