package com.ravi.string;

public class StringReverse {
	public static void main(String[] args) {
		String s1 = "Java";

		String rev = "";

		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());

		// approach second

		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);

		// approach third

		String s2 = "Ravi";
		char[] arr = s2.toCharArray();
		String s3 = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			s3 = s3 + arr[i];
		}
		System.out.println(s3);
	}

}
