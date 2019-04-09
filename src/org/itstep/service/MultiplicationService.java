package org.itstep.service;

public class MultiplicationService {

	public static String getMultiplicationText(int number1, int number2) {

		String finalResult = String.valueOf(number1*number2);
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(getSpaces(finalResult.length() - String.valueOf(number1).length()) + number1 + "\n");
		stringBuilder.append(getSpaces(finalResult.length() - String.valueOf(number2).length()) + number2 + "\n");
		
		if(number2 > 9) {
		
			stringBuilder.append(
		        number1>number2 ? getSpaces(finalResult.length() - String.valueOf(number1).length()) + getUnderlines(String.valueOf(number1).length()) + "\n"
		                : getSpaces(finalResult.length() - String.valueOf(number2).length()) + getUnderlines(String.valueOf(number2).length()) +"\n");
		
		
			stringBuilder.append(getRows(number1, number2));
		}		
		stringBuilder.append(getUnderlines(finalResult.length()) + "\n");
		stringBuilder.append(finalResult);
		
		return stringBuilder.toString();
	}

	private static String getRows(int number1, int number2) {
		char[] symbols = String.valueOf(number2).toCharArray();
		
		StringBuilder sb = new StringBuilder();
		int rightOffset = 0;
		
		for (int i = symbols.length - 1; i >= 0; i--) {
			sb.append(getSpaces(
					String.valueOf(number1 * number2).length() - 
					String.valueOf(number1 * Character.getNumericValue(symbols[i])).length() -
					rightOffset) +
					(number1 * Character.getNumericValue(symbols[i])) + "\n");
			rightOffset++;
		}
		
		return sb.toString();
	}

	private static Object getUnderlines(int amount) {
		String underlines = "";
		for (int i = 0; i < amount; i++) {
			underlines += "_";
		}
		return underlines;
	}

	private static String getSpaces(int amount) {
		String spaces = "";
		for (int i = 0; i < amount; i++) {
			spaces += " ";
		}
		return spaces;
	}
	
	

}
