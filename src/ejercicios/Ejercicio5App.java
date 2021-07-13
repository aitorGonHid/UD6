package ejercicios;
import javax.swing.JOptionPane;

public class Ejercicio5App {

	public static void main(String[] args) {
		String numberInput = JOptionPane.showInputDialog("Introduce un número positivo convertir a binario:");
		int number = Integer.parseInt(numberInput); // input casted to int
		int binaryNumber = toBinary(number); // method call
		
		JOptionPane.showMessageDialog(null, number+" en binario es: "+binaryNumber);
	}
	
	// Method that converts a decimal number to binary
	public static int toBinary (int decimalNumber) {
		// 0 has the same representation in decimal base and binary base
		if (decimalNumber == 0) return 0;
		// String to store the remains of the divisions by 2
		StringBuilder binary = new StringBuilder();
		// Loop to calculate and store remains of divisions on a string
		while (decimalNumber > 0) {
			binary.append(decimalNumber%2);
			decimalNumber/=2;
		}
		// Reverse the StringBuilder and cast it to string and then to int
		int result = Integer.parseInt(binary.reverse().toString());
		return result;
	}
}
