package com.ravi.string;

import java.util.Arrays;

// anagrams means  both String contain same character
public class Anagrams {
	public static void main(String[] args) {

		String s1 = "ravi";

		String s2 = "avir";

		if (s1.length() != s2.length()) {

			System.out.println("given string is not anagrams");
		}

		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();
		Arrays.sort(a);

		Arrays.sort(b);
		boolean flag = Arrays.equals(a, b);
		if (flag) {
			System.out.println("given string is anagrams");
		} else {

			System.out.println("given string is not anagrams");
		}

		// s1.equals(s2);
		// System.out.println();

	}

}
