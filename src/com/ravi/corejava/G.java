package com.ravi.corejava;

public class G {
	G(){
		this(10);
		System.out.println("zero para constructor");
	}
	G(int i){
		this();
		/*
		 * recursive constructor invocation not allow in java; 
		 * comment line number 9
		 */
		System.out.println(" 1  para constructor");
		
	}
	public static void main(String[] args) {
		G g1 = new G();
		System.out.println("success");
	}

}

/* output: 
 * compile time error 
 */

