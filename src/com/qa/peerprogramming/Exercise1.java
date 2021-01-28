package com.qa.peerprogramming;

public class Exercise1 {

	public static void exercise1 () {
		
		int input = 3628800;
		int result = 0;
		for (int i = 0 ; input != 1 ;i++) {
			
			input = input / (i+1);
			System.out.println(input);
			result = i+1;
		}
		
		System.out.println("The result is " + result);
	}
	
	
	
	
}
