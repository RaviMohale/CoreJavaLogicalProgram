package com.ravi.corejava;

public class Demo10 {
	
	int i ;
	
	static Demo10 test() {
		Demo10 t1 = new Demo10();
		return t1;
	}
	public static void main(String[] args) {
		Demo10 obj = test();
		System.out.println(obj.i);
	}

}
/* 
 * output : 0 
 * 
 */