package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio8App {

	public static void main(String[] args) {
		
		double values[] = new double[10];
		
		getValues(values);
		showValues(values);

	}
	
	// Metodo que guarda valores numericos en un arrray de Double
	public static void getValues (double values[]) {
		
		for (int i = 0; i < values.length; i++) {
			String valueInput = JOptionPane.showInputDialog("Introduce valor: "+(i+1)+"/"+values.length);
			values[i]= Double.parseDouble(valueInput);	
		}
	}
	
	// Metodo que enseña los valores numericos de un array de Double
	public static void showValues (double values[]) {
		
		StringBuilder stream = new StringBuilder();
		
		for (double value: values) {
			stream.append(value+" ");
		}
		JOptionPane.showMessageDialog(null, "valores guardados: "+stream);
	}
}
