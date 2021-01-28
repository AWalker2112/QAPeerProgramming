package com.qa.peerprogramming;

public class Exercise2 {

	public static String ordinal() {
		String output = "";
		String placeholder = "";
		String position = "1st";
		position = " " + position + " ";
		for(int i = 0; i < 100; i++) {
			String[] suffixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
			switch (i % 100) {
			case 11:
			case 12:
			case 13:
				output = output + " " + (i + "th");
			default:
				placeholder = (i + suffixes[i % 10]);
				output = output + " " + placeholder;
			}
		}for(int i = 0; i < output.length(); i++) {
			if(output.contains(position)) {
				output = output.replace(" 11st", "");
				output = output.replace(" 12nd", "");
				output = output.replace(position, " ");
			}
		}
		
		
		return output;
	}

}
