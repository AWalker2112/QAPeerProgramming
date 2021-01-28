package com.qa.peerprogramming;

import java.util.List;

public class Exercise4 {

	public static void exercise4(int a, int b, int c) {
		int addResult, subtractResult, multiplyResult, divideResult;
		char[] mathOperators = new char[4];
		mathOperators[0] = '-';
		mathOperators[1] = '+';
		mathOperators[2] = '*';
		mathOperators[3] = '/';
		for (int i = 0; i <= mathOperators.length; i++) {
			if (operator(a, b, i + 1) == c) {
				System.out.println(a + "" + mathOperators[i] + "" +  b + "=" + c);
			} else if (operator(b, c, i + 1) == a) {
				System.out.println(b + "" + mathOperators[i] + "" + c + "=" + a);
			} else if (operator(c, a, i + 1) == b) {
				System.out.println(c + "" + mathOperators[i] + "" + a + "=" + b);
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
