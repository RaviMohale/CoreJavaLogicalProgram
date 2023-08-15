package com.ravi.string;

public class ReplaceVowels {
	public static void main(String[] args) {

		String s = "hello ,I love my india";

		s = s.replaceAll("[aeiouAEIOU]", "");
		System.out.println(s);
	}
}
