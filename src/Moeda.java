import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Moeda {

	private double realParaDollar;
	private double realParaEuro;
	private double realParaLibra;
	private double realParaYene;
	private double realParaWon;
	private double dollarParaReal;
	private double euroParaReal;
	private double libraParaReal;
	private double yeneParaReal;
	private double wonParaReal;

	public Moeda() {
		super();
		this.realParaDollar = 5.41640;
		this.realParaEuro = 5.31046;
		this.realParaLibra = 6.04914;
		this.realParaYene = 0.0374225;
		this.realParaWon = 0.00375970;
		this.dollarParaReal = 0.184651;
		this.euroParaReal = 0.188335;
		this.libraParaReal = 0.171663;
		this.yeneParaReal = 27.9876;
		this.wonParaReal = 277.926;
	}

	public void converter(String valor, String opt) {

		switch (opt) {
		case "De Reais a Dólares": {
			String cifraValor = "R$";
			String cifraConvertida = "$";
			calcula(realParaDollar, valor, cifraValor, cifraConvertida);
		}
			break;

		case "De Reais a Euros": {
			String cifraValor = "R$";
			String cifraConvertida = "€";
			calcula(realParaEuro, valor, cifraValor, cifraConvertida);
		}
			break;

		case "De Reais a Libras": {
			String cifraValor = "R$";
			String cifraConvertida = "£";
			calcula(realParaLibra, valor, cifraValor, cifraConvertida);
		}
			break;

		case "De Reais a Yenes": {

			String cifraValor = "R$";
			String cifraConvertida = "¥";
			calcula(realParaYene, valor, cifraValor, cifraConvertida);
		}
			break;

		case "De Reais a Won Coreano": {
			String cifraValor = "R$";
			String cifraConvertida = "₩";
			calcula(realParaWon, valor, cifraValor, cifraConvertida);
		}
			break;

		case "De Dólares a Reais": {
			String cifraValor = "$";
			String cifraConvertida = "R$";
			calcula(dollarParaReal, valor, cifraValor, cifraConvertida);
		}
			break;

		case "De Euros a Reais": {
			String cifraValor = "€";
			String cifraConvertida = "R$";
			calcula(euroParaReal, valor, cifraValor, cifraConvertida);
		}
			break;
		case "De Libras a Reais": {
			String cifraValor = "£";
			String cifraConvertida = "R$";
			calcula(libraParaReal, valor, cifraValor, cifraConvertida);
		}
			break;
		case "De Yenes a Reais": {
			String cifraValor = "¥";
			String cifraConvertida = "R$";
			calcula(yeneParaReal, valor, cifraValor, cifraConvertida);
		}
			break;
		case "De Won Coreano a Reais": {
			String cifraValor = "₩";
			String cifraConvertida = "R$";
			calcula(wonParaReal, valor, cifraValor, cifraConvertida);
		}
			break;
		}
	}

	public static void calcula(double moeda, String valorString, String cifraValor, String cifraConvertida) {

		double valor = Double.parseDouble(valorString);
		double moedaConvertida = valor / moeda;

		DecimalFormat df = new DecimalFormat("0.##");
		JOptionPane.showMessageDialog(null,
				cifraValor + valor + " valem " + cifraConvertida + df.format(moedaConvertida) + ".");
	}

}
