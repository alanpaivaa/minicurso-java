package minicurso.java.exercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

/** Classe que lida com os eventos do teclado da calculadora */
public class TecladoListener implements ActionListener {

	private Calculadora calculadora;
	private JTextField display;

	private Double numeroA = null;
	private Double numeroB = null;

	private String sinal = null;

	public TecladoListener(JTextField display, Calculadora calculadora) {
		this.display = display;
		this.calculadora = calculadora;
	}

	/** Realiza uma operação entre dois números digitados previamente */
	private void realizaOperacao() {

		if (this.numeroA != null && this.numeroB != null && this.sinal != null) {

			Double resultado = null;

			switch (this.sinal) {
			case "+":
				resultado = this.calculadora.soma(this.numeroA, this.numeroB);
				break;
			case "-":
				resultado = this.calculadora.subtrai(this.numeroA, this.numeroB);
				break;
			case "*":
				resultado = this.calculadora.multiplica(this.numeroA, this.numeroB);
				break;
			case "/":
				resultado = this.calculadora.divide(this.numeroA, this.numeroB);
				break;
			}
			this.display.setText(resultado.toString());
		}
	}

	/** Faz os numeros e o sinal voltarem aos valores iniciais */
	private void limpaValores() {
		this.numeroA = null;
		this.numeroB = null;
		this.sinal = null;
	}

	/** Método chamado ao clicar em qualquer um dos botoes da calculadora */
	public void actionPerformed(ActionEvent e) {

		String tecla = ((JButton) e.getSource()).getText();

		if (tecla.equals("=")) {
			this.numeroB = Double.parseDouble(this.display.getText());
			this.realizaOperacao();
			this.limpaValores();
		} else if (tecla.equals("C")) {
			this.limpaValores();
			this.display.setText("");
		} else {
			if (tecla.equals("+") || tecla.equals("-") || tecla.equals("*") || tecla.equals("/")) {
				this.numeroA = Double.parseDouble(this.display.getText());
				this.sinal = tecla;
				this.display.setText("");
			} else {
				this.display.setText(this.display.getText() + tecla);
			}
		}

	}

}
