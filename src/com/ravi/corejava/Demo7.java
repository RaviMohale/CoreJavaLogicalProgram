
package com.ravi.corejava;

public class Demo7 {
	void test() {
		System.out.println("we are the best friends");
		
	}
	public static void main(String[] args) {
		Demo7 d = new Demo7();
		System.out.println("I am main() method");
		d.test();
	}
	static {
		System.out.println("I am SB");
	}
	{
		System.out.println(" I am IB..");
	}

}
/*
 * output
 * 
 * I am SB 
 * I am  IB.. 
 * I am main() method 
 * we are the best friends
 */