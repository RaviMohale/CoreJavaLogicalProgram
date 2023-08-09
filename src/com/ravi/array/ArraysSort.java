package com.ravi.array;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		int[] a = {3,5,1,2,7,8};
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		for(int i =0; i< a.length;i++) {
			System.out.print(a[i]+ " ");
			
			
		}System.out.println();
		System.out.println("Min value  "+ a[0]);
		System.out.println("Max value  "+ a[a.length-1]);
	}

}
