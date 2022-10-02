import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		String[] opcoes = { "Conversor de Moeda", "Conversor de Temperatura" };
		JOptionPane.showInputDialog(null, "Escolha uma Opçao", "Menu", JOptionPane.PLAIN_MESSAGE, null, opcoes,
				opcoes[0]);

		String valorString = JOptionPane.showInputDialog(null, "Insira um valor");

		String[] opcoesMoeda = { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
				"De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reis",
				"De Yenes a Reais", "De Won Coreano a Reais" };

		Object opt = JOptionPane.showInputDialog(null, "Escolha a Moeda para a qual você deseja girar seu dinheiro",
				"Moedas", JOptionPane.PLAIN_MESSAGE, null, opcoesMoeda, opcoesMoeda[0]);

		String optMoedaEscolhida = opt.toString();

		switch (optMoedaEscolhida) {

		case "De Reais a Dólares": {
			deRealParaDollar(valorString);
		}
			break;

		case "De Reais a Euros": {
			deRealParaEuro(valorString);
		}
			break;

		case "De Reais a Libras": {
			deRealParaLibra(valorString);
		}
			break;

		case "De Reais a Yenes": {
			deRealParaYene(valorString);
		}
			break;

		case "De Reais a Won Coreano": {
			deRealParaWon(valorString);
		}
			break;

		case "De Dólares a Reais": {
			deDollarParaReal(valorString);
		}
			break;

		case "De Euros a Reais": {
			deEuroParaReal(valorString);

		}
			break;
		case "De Libras a Reis": {
			deLibraParaReal(valorString);
		}
		}

	}

	public static void deRealParaDollar(String valorReal) {
		// valor do dollar hj 5.41640
		double valorEmReal = Double.parseDouble(valorReal);
		double valorDollar = valorEmReal / 5.41640;
		DecimalFormat df = new DecimalFormat("0.##");
		String valorDollarFormatado = df.format(valorDollar);

		JOptionPane.showMessageDialog(null, valorEmReal + " Reais Valem " + valorDollarFormatado + " Dollares.");
	}

	public static void deRealParaEuro(String valorReal) {
		// valor do euro hj 5.31046
		double valorEmReal = Double.parseDouble(valorReal);
		double valorEuro = valorEmReal / 5.31046;
		DecimalFormat df = new DecimalFormat("0.##");
		String valorEuroFormatado = df.format(valorEuro);

		JOptionPane.showMessageDialog(null, valorEmReal + " Reais Valem " + valorEuroFormatado + " Euros.");
	}

	public static void deRealParaLibra(String valorReal) {
		// valor da libra hj 6.04914
		double valorEmReal = Double.parseDouble(valorReal);
		double valorLibra = valorEmReal / 6.04914;
		DecimalFormat df = new DecimalFormat("0.##");
		String valorLibraFormatado = df.format(valorLibra);

		JOptionPane.showMessageDialog(null, valorEmReal + " Reais Valem " + valorLibraFormatado + " Libras.");
	}

	public static void deRealParaYene(String valorReal) {
		// valor do Yene hj 0.0374225
		double valorEmReal = Double.parseDouble(valorReal);
		double valorYene = valorEmReal / 0.0374225;
		DecimalFormat df = new DecimalFormat("0.##");
		String valorYeneFormatado = df.format(valorYene);

		JOptionPane.showMessageDialog(null, valorEmReal + " Reais Valem " + valorYeneFormatado + " Yene.");
	}

	public static void deRealParaWon(String valorReal) {
		// valor do Won hoje 0.00375970
		double valorEmReal = Double.parseDouble(valorReal);
		double valorWon = valorEmReal / 0.00375970;
		DecimalFormat df = new DecimalFormat("0.##");
		String valorWonFormatado = df.format(valorWon);

		JOptionPane.showMessageDialog(null, valorEmReal + " Reais Valem " + valorWonFormatado + " Won.");
	}

	public static void deDollarParaReal(String valorDollar) {
		// valor do real 0,184651
		double valorEmDollar = Double.parseDouble(valorDollar);
		double valorReal = valorEmDollar / 0.184651;
		DecimalFormat df = new DecimalFormat("0.##");

		JOptionPane.showMessageDialog(null, valorEmDollar + " Dolares Valem " + df.format(valorReal) + " Reais.");
	}

	public static void deEuroParaReal(String valorEuro) {
		// valor do real 0.188335
		double valorEmEuro = Double.parseDouble(valorEuro);
		double valorReal = valorEmEuro / 0.188335 ;
		DecimalFormat df = new DecimalFormat("0.##");

		JOptionPane.showMessageDialog(null, valorEmEuro + " Euros Valem " + df.format(valorReal) + " Reais.");
	}
	/////////////////////////////////////////////////////////////////////
	public static void deLibraParaReal(String valorLibra) {
		double valorEmLibra = Double.parseDouble(valorLibra);
		double valorReal = valorEmLibra / 0.188335 ;
		DecimalFormat df = new DecimalFormat("0.##");

		JOptionPane.showMessageDialog(null, valorEmLibra + " Euros Valem " + df.format(valorReal) + " Reais.");
	}
}
