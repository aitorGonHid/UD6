package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio9App {

	public static void main(String[] args) {
		
		// asks for the array size and initialize it
		String size = JOptionPane.showInputDialog("Introduce el tamaño del vector: ");
		int vector[] = new int[Integer.parseInt(size)];
		
		generateRandomsArray(vector, 1, 9);
		showArray(vector);
	}
	
	// Method that takes an arrray of int and full fills it with random numbers
	public static void generateRandomsArray (int array[], int min, int max) {

		for (int i = 0; i < array.length; i++) {
			// Standard pattern to generate integers within a range
			array[i] = min + (int)(Math.random() * ((max - min) + 1));
		}
	}
	
	// Method that prints the values of an array of int and finally shows the values summation
	public static void showArray (int array[]) {
		
		StringBuilder stream = new StringBuilder();
		int summation = 0;
		
		for (int i = 0; i < array.length; i++) {
			// Loop to add summation sign between all numbers
			if (i != (array.length-1)) {
				stream.append(array[i]+" + ");
			} else {
				stream.append(array[i]);
			}
			summation += array[i];
		}
		// output the stream and the summation
		JOptionPane.showMessageDialog(null, "Sumatorio = "+stream+" = "+summation);
	}

}
