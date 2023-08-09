package com.ravi.array1;

import java.util.Arrays;

public class ArrayPrint {
	public static void main(String[] args) {
			int arr[] = {2,1,3,4,5,6};
			
			System.out.println();
			for(int n : arr) {
				System.out.print(n);
				
			
			}
	
	System.out.println();
	System.out.println(Arrays.toString(arr));
	
	
	for (int i= 0; i < arr.length; i++) {
		System.out.print(arr[i]+ " ");
	}
	
	
	}
	 
}
