package com.ravi.corejava;

public class Demo5 {

	{
		System.out.println("Hello i am IB");
	}

	public static void main(String[] args) {
		System.out.println("you are most welcome");
	}

	static {
		System.out.println("How are you..");
	}

}


/*
 * Answer:How are you.. 
 * 		  you are most welcome
 * 
 * instance block not execute bcoz object not created
 */