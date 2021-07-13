package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio6App {

	public static void main(String[] args) {
		
		String numberInput = JOptionPane.showInputDialog("Introduce un número positivo para contar sus cifras");
		int number = Integer.parseInt(numberInput); // input casted to int
		
		JOptionPane.showMessageDialog(null, number+" tiene "+digitCount(number)+" digitos");

	}
	
	public static int digitCount (int n) {
		int count = 0;
		// loop cada division por 10 elimina el ultimo digito hasta llegar a 0
		while (n > 0) {
			n = n/10;
			count++;
		}
		return count;
	}
}
