package minicurso.java.exercicio3;

import java.text.DecimalFormat;

/** Classe que abastrai o cálculo do IMC */
public class IMC {

	double peso;
	double altura;
	
	double imc;
	String resultado;
	
	DecimalFormat format = new DecimalFormat("#.00");
	
	/** Calcula o IMC. */
	void calculaImc() {
		this.imc = this.peso / (this.altura * this.altura);
	}
	
	/** Calcula o resultado assciado ao IMC. */
	void calculaResultado() {
		this.resultado = (this.imc < 20) ? "Abaixo do peso" : null;
		this.resultado = (this.imc >= 20 && this.imc < 25) ? "Peso ideal" : this.resultado;
		this.resultado = (this.imc >= 25 && this.imc < 30) ? "Sobrepeso" : this.resultado;
		this.resultado = (this.imc >= 30 && this.imc < 35) ? "Obesidade Grau I" : this.resultado;
		this.resultado = (this.imc >= 35 && this.imc < 40) ? "Obesidade Grau II" : this.resultado;
		this.resultado = (this.imc >= 40 && this.imc < 50) ? "Obesidade Grau III" : this.resultado;
		this.resultado = (this.imc >= 50) ? "Superobesidade" : this.resultado;
	}
	
	/** Printa um imc e um resultado */
	void printaStatus() {
		System.out.println("\nIMC: " + this.format.format(this.imc));
		System.out.println("Resultado: " + this.resultado);
	}
	
}
