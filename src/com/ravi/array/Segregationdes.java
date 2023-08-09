package com.ravi.array;

import java.util.Arrays;

public class Segregationdes {
	public static void main(String[] args) {
		
	
	int a[]= {1,0,2,1,2,1,0,2,1,0,0};
	
	int temp = 0;

	

for(int i = 0 ; i < a.length ; i++) {
			for(int j = i + 1 ; j < a.length;j++) {
				if(a[i] < a[j]) {
					
					temp = a[i];
					a[i] =a[j];
					a[j] = temp;
					System.out.println(Arrays.toString(a));
				}
				
			}
		}
}

}
