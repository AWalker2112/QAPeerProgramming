package com.qa.peerprogramming;

public class Exercise4Advanced {

	public static void exercise4(int a, int b, int c, int d) {
		int addResult, subtractResult, multiplyResult, divideResult;
		char[] mathOperators = new char[4];
		mathOperators[0] = '-';
		mathOperators[1] = '+';
		mathOperators[2] = '*';
		mathOperators[3] = '/';
		int[] userInput = new int[16];
		userInput[0] = a;
		userInput[1] = b;
		userInput[2] = c;
		userInput[3] = d;
		userInput[4] = a;
		userInput[5] = b;
		userInput[6] = c;
		userInput[7] = d;
		userInput[8] = a;
		userInput[9] = b;
		userInput[10] = c;
		userInput[11] = d;
		userInput[12] = a;
		userInput[13] = b;
		userInput[14] = c;
		userInput[15] = d;
		for(int j = 0; j <= 6; j++) {
			for (int i = 0; i <= mathOperators.length; i++) {
				if (operator(userInput[j], userInput[j+1], i + 1) == userInput[j+2]) {
					System.out.println(userInput[j] + "" + mathOperators[i] + "" +  userInput[j+1] + "=" + userInput[j+2]);
				} else if (operator(userInput[j+1], userInput[j+2], i + 1) == userInput[j]) {
					System.out.println(userInput[j+1] + "" + mathOperators[i] + "" + userInput[j+2] + "=" + userInput[j]);
				} else if (operator(userInput[j+2], userInput[j], i + 1) == userInput[j+1]) {
					System.out.println(userInput[j+2] + "" + mathOperators[i] + "" + userInput[j] + "=" + userInput[j+1]);
				}
			}
		}
	}

	public static int operator(int num1, int num2, int operator) {
		switch (operator) {
		case 1:
			return (num1 - num2);
		case 2:
			return (num1 + num2);
		case 3:
			return (num1 * num2);
		case 4:
			return (num1 / num2);
		}
		return 0;
	}

}