package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11App {

	public static void main(String[] args) {

		// ask for vectors size and initializes both
		String size = JOptionPane.showInputDialog("Introduce el tamaño de los vectores");
		int[] vector1 = new int[Integer.parseInt(size)];
		int[] vector2 = new int[Integer.parseInt(size)];
		
		// fills the array with integer between the range passed as parameter
		Ejercicio9App.generateRandomsArray(vector1, 0, 100);
		// vector2 points to vector1
		vector2 = vector1;
		JOptionPane.showMessageDialog(null, "El vector 1 contiene "+printIntArray(vector1));
		JOptionPane.showMessageDialog(null, "El vector 2 apunta al vector 1 y contiene "+printIntArray(vector2)); //shows the same than vector1
		
		Ejercicio9App.generateRandomsArray(vector2, 0, 100);
		JOptionPane.showMessageDialog(null, "El vector 2 contine ahora los valores: "+printIntArray(vector2)); //shows the same than vector1
		// multiplies vector1 for vector2 and store results on vector3 and print it
		int[] vector3 = vectorProduct(vector1, vector2);
		JOptionPane.showMessageDialog(null, "vector 1 * vector 2 = "+printIntArray(vector3)); //shows the same than vector1
	}
	/**
	 * Method that converts an array of int to a String
	 * @param array: array to convert to an int stream
	 */
	public static String printIntArray(int[] vector) {
		
		StringBuilder stream = new StringBuilder();
		
		for (int n : vector) {
			stream.append(n+" ");
		}
		return (stream.toString());
	}
	
	public static int[] vectorProduct(int[] vector1, int[] vector2){
		
		int[] result = new int[vector1.length];
		for (int i = 0; i<result.length; i++) {
			result[i] = vector1[i]*vector2[i];
		}
		return result;
	}
	

}
