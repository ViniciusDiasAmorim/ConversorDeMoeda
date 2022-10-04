package models;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Temperatura {
	private double celsius;
	private double kelvin;
	private double fahrenheit;

	public void converte(String opt, String valor) {
		
		DecimalFormat df = new DecimalFormat("0.##");

		switch (opt) {
		
		case "Celsius a Kelvin": {
			double valorCelsius = Double.parseDouble(valor);
			
			double valorKelvin = valorCelsius + 273.0;
			
			JOptionPane.showMessageDialog(null, df.format(valorCelsius) + "C" + " valem " + df.format(valorKelvin) +"K");			
		}
			break;
		case "Celsius a Fahrenheit": {
			double valorCelsius = Double.parseDouble(valor);
			double valorFahrenheit = ((valorCelsius * 9)/5) + 32;
			
			JOptionPane.showMessageDialog(null, df.format(valorCelsius) + "C" + " valem " + df.format(valorFahrenheit) +"F");			
		}
			break;
		case "Kelvin a Celsius": {
			
			double valorKelvin = Double.parseDouble(valor);
			double valorCelsius = valorKelvin - 273.0;
			
			JOptionPane.showMessageDialog(null, df.format(valorKelvin) + "K" + " valem " + df.format(valorCelsius) +"C");	
		}
			break;
		case "Fahrenheit a Celsius": {
			double valorFahrenheit = Double.parseDouble(valor);
			double valorCelsius = ((valorFahrenheit -32)*5) / 9;
			
			JOptionPane.showMessageDialog(null, df.format(valorFahrenheit) + "F" + " valem " + df.format(valorCelsius) +"C");			

		}
			break;
		}
	}
}
