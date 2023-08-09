package com.ravi.string;

public class StringDemo {
	public static void main(String[] args) {
		String  s1 = "Ravi";
		String s2 = "Mohale";
		
		s1.concat(s2);
		System.out.println(s1);
		String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.lastIndexOf('a'));
		String s4 = s1+s2;
		// + operator with string act as a concat whereas with integer it act as sum
		String s5 = "12";
		String s6 = "12";
		String s7 = s5+s6;
		int a1 = 10;
		int a2 = 20;
		int a3 = a1+ a2;
		System.out.println(a3);
		System.out.println(s7);
	}

}
