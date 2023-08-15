package com.ravi.string;

public class CountNoOfWordsInString {
	public static void main(String[] args) {

		String s1 = "  hello    my   dear friends  ";

		String[] s2 = s1.trim().split("\\s+");
		System.err.println(s2.length);

	}

}
