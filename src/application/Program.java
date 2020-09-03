package application;

import javax.swing.JOptionPane;

import entities.Retorno;

public class Program {

	public static void main(String[] args) {

		try {

			String name = JOptionPane.showInputDialog("What is or number: ");
			double calculo = Double.parseDouble(name);

			Retorno retorno = new Retorno(calculo);

			String nume = JOptionPane.showInputDialog("Numero para multiplicar");
			double valor = Double.parseDouble(nume);
			retorno.contMais(valor);
			String mens = String.format("%.2f", retorno.getCalculo());

			JOptionPane.showMessageDialog(null, mens);

		}

		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Não deu certo!");

		}

	}

}
