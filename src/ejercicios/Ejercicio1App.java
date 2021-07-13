package ejercicios;
import javax.swing.JOptionPane;

public class Ejercicio1App {

	public static void main(String[] args) {
		
		boolean check = false;
		String figura = "none";
		
		do {
			figura = JOptionPane.showInputDialog("Introduce figura: \ncuadrado - triangulo - circulo");
			if (figura.equals("cuadrado") || figura.equals("triangulo") || figura.equals("circulo")) check = true;
		} while (!check);
		
		switch (figura) {
			case ("circulo"):	
				String radiusInput = JOptionPane.showInputDialog("Introduce medida del radio del circulo");
				double radius = Double.parseDouble(radiusInput);			
				areaCirculo(radius);
				break;

			case ("cuadrado"):	
				String ladoInput = JOptionPane.showInputDialog("Introduce medida del lado del cuadrado");
				double lado = Double.parseDouble(ladoInput);
				areaCuadrado(lado);
				break;
			case ("triangulo"):		
				String baseInput = JOptionPane.showInputDialog("Introduce medida del la base del triangulo");
				String alturaInput = JOptionPane.showInputDialog("Introduce la altura del triangulo");
				double base = Double.parseDouble(baseInput);
				double altura = Double.parseDouble(alturaInput);
				areaTriangulo(base,altura);
				break;
		}
	}
	
	// Method to calculate and show a triangle area
	public static void areaTriangulo(double base, double altura) {
		double result = ((base*altura)/2);
		JOptionPane.showMessageDialog(null, "El are del triangulo es: "+result);
	}
	
	// Method to calculate and show a circle area
	public static void areaCirculo (double radius) {
		double result = (Math.PI * (Math.pow(radius, 2)));
		JOptionPane.showMessageDialog(null, "El are del circulo es: "+result);
	}
	
	// Method to calculate and show a square area
	public static void areaCuadrado (double lado) {
		double result = (lado*lado);
		JOptionPane.showMessageDialog(null, "El are del cuadrado es: "+result);
	}
}