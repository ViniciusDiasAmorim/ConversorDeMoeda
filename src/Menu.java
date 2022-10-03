import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		boolean rodaPrograma = true;

		while (rodaPrograma) {
			String[] opcoes = { "Conversor de Moeda", "Conversor de Temperatura" };

			Object opcaoServico = JOptionPane.showInputDialog(null, "Escolha uma Opçao", "Menu",
					JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
			if (opcaoServico == null) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				rodaPrograma = false;

			} else if (opcaoServico.toString() == "Conversor de Moeda") {
				Moeda moeda = new Moeda();

				String valorString = JOptionPane.showInputDialog(null, "Insira um valor");

				if (valorString.matches("[0-9/.]*")) {
					String[] opcoesMoeda = { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras",
							"De Reais a Yenes", "De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais",
							"De Libras a Reais", "De Yenes a Reais", "De Won Coreano a Reais" };

					Object opt = JOptionPane.showInputDialog(null,
							"Escolha a Moeda para a qual você deseja girar seu dinheiro", "Moedas",
							JOptionPane.PLAIN_MESSAGE, null, opcoesMoeda, opcoesMoeda[0]);
					if (opt != null)
						moeda.converter(valorString, opt.toString());
				}else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}

			} else {
				JOptionPane.showConfirmDialog(null, "ola");
			}
		}
	}
}