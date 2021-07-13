package ejercicios;
import javax.swing.JOptionPane;

public class Ejercicio4App {

	public static void main(String[] args) {
		
		String numberInput = JOptionPane.showInputDialog("Introduce un número positivo para calcular su factorial:");
		int number = Integer.parseInt(numberInput);
		
		JOptionPane.showMessageDialog(null, "El factorial de "+number+" es "+factorial(number));
		
		
	}
	
	// Method that return  the factorial of a positive number
	public static int factorial (int n) {
		
		int result = 1;
		
		// bucle que multiplica n * n-1 * n-2 ... hasta n-i=1
		for (int i= n; i>0; i--) {
			result = result*i;
		}
		return result;
	}

}
