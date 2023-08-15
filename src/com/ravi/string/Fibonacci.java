package com.ravi.string;

public class Fibonacci {
	public static void main(String[] args) {
		
		int fno = 0;
		int sno = 1;
		int tdno = 0;
		
		for(int i = 0 ; i <=  10; i++ ) {
			
			System.out.println(fno);
			tdno = fno + sno;
			
			fno = sno;
			sno = tdno;
		}
	}

}
