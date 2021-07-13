package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio7App {

	public static void main(String[] args) {
		
		String cantidadInput  = JOptionPane.showInputDialog("Introduce la cantidad a convertir (€)");
		String monedaInput  = JOptionPane.showInputDialog("Introduce a que moneda \n (dolar - yen - libra)");

		double cantidad = Double.parseDouble(cantidadInput);
		
		if (monedaInput.equals("libra") || monedaInput.equals("dolar") ||monedaInput.equals("yen")) {
			JOptionPane.showMessageDialog(null, cantidad+" € son "
					+convertirMoneda(cantidad, monedaInput)+" "+monedaInput);
		} else {
			JOptionPane.showMessageDialog(null, "moneda no reconocida");
		}	
	}
	
	public static double convertirMoneda(double cantidad, String moneda) {
		
		// constantes con valores en Euro de cada moneda
		final double valorEurosLibra = 0.86;
		final double valorEurosDolar = 1.28611;
		final double valorEurosYen = 129.852;
		
		// convertir segun tipo de moneda, si no la reconoce devuelve 0
		switch(moneda)
		{
			case ("libra"):
				return cantidad*valorEurosLibra;
			
			case ("dolar"):
				return cantidad*valorEurosDolar;
				
			case ("yen"):
				return cantidad*valorEurosYen;
			default:
				return 0;		
		}
	}	
}
