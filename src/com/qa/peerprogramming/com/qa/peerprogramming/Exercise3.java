package com.qa.peerprogramming;

public class Exercise3 {

	public static void exercise3() {

		int weight = 100;
		int temperature = 120;

		int[] chairAcceptance = { 297, 66, 257, 276, 280, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54,
				119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132 };
		int[] temperatureList = { 90, 110, 113, 191, 129, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54,
				119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132 };

		int[] lightLuminosity = { 54, 78, 98, 12, 22, 45, 65, 71, 87, 98, 45, 98, 10, 100, 12, 54, 98, 87, 32, 65, 97,
				64, 31, 54, 65, 87, 98, 65, 21 };

		Chair chairList[] = new Chair[30];

		for (int i = 0; i < chairAcceptance.length; i++) {

			chairList[i] = new Chair(chairAcceptance[i]);
		}

		Porridge porridgeList[] = new Porridge[30];

		for (int i = 0; i < chairAcceptance.length; i++) {

			porridgeList[i] = new Porridge(temperatureList[i]);
		}

		int goldilockCounter = 0;

		for (int i = 0; i < chairAcceptance.length; i++) {

			if (weight < chairList[i].getWeight()) {

				if (temperature > porridgeList[i].getPorridgeTemperature()) {

					if (lightLuminosity[i] > 70) {
						goldilockCounter++;
						System.out.println(i);

					}

				}
			}

		}

		System.out.println("Goldilocks may sit at " + goldilockCounter + " chairs");
	}

}
