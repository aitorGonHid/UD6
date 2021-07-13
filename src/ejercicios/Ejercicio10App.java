package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10App {
	
	public static void main (String args[]) {
		
		String size = JOptionPane.showInputDialog("Introduce el tamaño del vector de numeros primos: ");
		String minimoInput = JOptionPane.showInputDialog("Cual será el valor mínimo?\n(numero entero)");
		String maximoInput = JOptionPane.showInputDialog("Cual será el valor máximo?\n(numero entero)");
		StringBuilder primesStream = new StringBuilder("Numeros primos: ");
		
		int vector[] = new int[Integer.parseInt(size)];
		int min = Integer.parseInt(minimoInput);
		int max = Integer.parseInt(maximoInput);
		// fill the array with prime numbers between range set
		fillWithPrimes(vector, min, max);
		// create array with all the values
		for (int value : vector) {
			primesStream.append(value+"  ");
		}
		// show the array
		JOptionPane.showMessageDialog(null, primesStream);
		// show the largest value of the array
		JOptionPane.showMessageDialog(null, "El numero primo guardado mas grande entre "+min+" y "+
				+max+" es "+getMax(vector));
		
	}
	
	/**
	 * Method that fills an array with prime values between a range
	 * @param vector - Array to get filled
	 * @param min - minimum value of the range
	 * @param max - maximum value of the range
	 * @return vector - array filled with prime numbers
	 */
	public static int[] fillWithPrimes (int vector[], int min, int max) {
		
		int i = 0;
		while (i<vector.length) {
			int value =  min + (int)(Math.random() * ((max - min) + 1));
			if (Ejercicio3App.isPrime(value)) {
				vector [i] = value;
				i++;
			}
		}		
		return vector;
	}
	
	/**
	 * Method that gets the max value of an int array
	 * @param vector - Array where max value must be found
	 * @return max - Largest value of the array
	 */
	public static int getMax (int vector[]) {
		int max = 0;
		for (int val : vector) {
			if (val > max) max = val;
		}
		return max;
	}
}
