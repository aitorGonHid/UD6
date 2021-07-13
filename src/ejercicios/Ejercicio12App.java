package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio12App {
	
	public static void main(String args[]) {
		
		// Ask for vector size
		String size = JOptionPane.showInputDialog("Introduce el tamaño del vector");
		int[] vector1 = new int[Integer.parseInt(size)];
		int[] vector2 = new int[Integer.parseInt(size)];
		// fills first vector with random numbers between 1 and 300
		Ejercicio9App.generateRandomsArray(vector1, 1, 300);
		// Ask for the digit to search the numbers that end with it
		int digit = getNumber(0,9);
		// Stores numbers of vector1 that end with the number introduced in vector2
		showValuesByLastDigit(vector1, vector2, digit);
		// Prints the final vector
		JOptionPane.showMessageDialog(null, "El vector final contiene "+Ejercicio11App.printIntArray(vector2));
	}
	
	/**
	 * 
	 * @param vectorInput Array of int that must be filtered by las digit
	 * @param vectorOutput Array that store the values that pass the filter
	 * @param value Number that must match with the last digit
	 * @return Array with the desired values
	 */
	
	public static int[] showValuesByLastDigit(int[] vectorInput, int[] vectorOutput, int value) {
		
		int i = 0; // index of result vector
		for (int n : vectorInput) {
			if (n%10 == value) {
				vectorOutput[i] = n;
				i++;
			}
		}
		return vectorOutput;
	}
	
	/**
	 * Method that asks for a number into the ranged passed as parameter
	 * @param min Minimum value able
	 * @param max Maximum value able
	 * @return
	 */
	public static int getNumber(int min, int max) {
		
		int number = -1;
		while (number < min || number > max) {
			String numberInput = JOptionPane.showInputDialog("Introduce un numero en el rango ["+min+", "+max+"]");
			number = Integer.parseInt(numberInput);
		}
		return number;
	}
}
