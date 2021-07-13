package ejercicios;
import javax.swing.JOptionPane;

public class Ejercicio2App {

	public static void main(String[] args) {
		
		// input prompts - store on strings
		String nAleatoriosInput = JOptionPane.showInputDialog("Cuantos numeros quieres generar?");
		String minimoInput = JOptionPane.showInputDialog("Cual será el valor mínimo?\n(numero entero)");
		String maximoInput = JOptionPane.showInputDialog("Cual será el valor máximo?\n(numero entero)");
		
		// cast input to int type variable
		int nAleatorios = Integer.parseInt(nAleatoriosInput);
		int min = Integer.parseInt(minimoInput);
		int max = Integer.parseInt(maximoInput);
		
		generateRandoms(nAleatorios, min ,max);
		
		
	}
	
	// Method that generates N random numbers between a [min,max] range , both passed as parameter
	public static void generateRandoms (int nRandoms, int min, int max) {
		
		StringBuilder numbers = new StringBuilder("Los numeros generados son: "); // initialize string to store numbers stream
		
		for (int i=0; i<nRandoms; i++) {
			int random = min + (int)(Math.random() * ((max - min) + 1)); // Standard pattern to generate integers within a range
			numbers.append(random+ " "); // adds next number to the string
		}
		
		JOptionPane.showMessageDialog(null, numbers); // shows the stream in a dialog box
	}

}
