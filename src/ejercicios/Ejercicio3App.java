package ejercicios;
import javax.swing.JOptionPane;

public class Ejercicio3App {

	public static void main(String[] args) {
		
		String numberInput = JOptionPane.showInputDialog("Introduce un número positivo:");
		int number = Integer.parseInt(numberInput);
		
		if (!isPrime(number) || number == 0 || number == 1) {
			JOptionPane.showMessageDialog(null, number+" is not a prime number");
		} else {
			JOptionPane.showMessageDialog(null, number+" is a prime number");
		}
			

	}
	
	// Method that return if a number is prime
	public static boolean isPrime (int number) {
		
		for (int i=2; i<=(number/2);i++) {
			if (number%i == 0) return false;
		}
		
		return true;
	}

}
