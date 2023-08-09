package com.ravi.array;

public class ArrayReverse {
	public static void main(String[] args) {
		int a[] = {1,3,6,2,9,7,4};
		
		int temp = 0;
		
		for(int i = 0; i < a.length/2 ;i++) {
			temp = a[i];	
			a[i] = a[a.length - 1-i];
			a[a.length-1 -i] = temp;
	}
		for(int n : a) {
		System.out.print(n+" ");
	}
	}
}


















