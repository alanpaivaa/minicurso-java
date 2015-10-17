package minicurso.java.exercicio1;

import java.text.DecimalFormat;
import java.util.Scanner;

/** Exercicio do IMC */
public class Exercicio1 {
	
	public static void main(String[] args) {
		
		/* Requisitando input do usuário */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu peso (em kilogramas): ");
		double peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura (em metros): ");
		double altura = scanner.nextDouble();
		
		scanner.close();
		
		/* Calculando Resultados */
		double imc = peso / (altura*altura);
		String resultado = (imc < 20) ? "Abaixo do peso" : null;
		resultado = (imc >= 20 && imc < 25) ? "Peso ideal" : resultado;
		resultado = (imc >= 25 && imc < 30) ? "Sobrepeso" : resultado;
		resultado = (imc >= 30 && imc < 35) ? "Obesidade Grau I" : resultado;
		resultado = (imc >= 35 && imc < 40) ? "Obesidade Grau II" : resultado;
		resultado = (imc >= 40 && imc < 50) ? "Obesidade Grau III" : resultado;
		resultado = (imc >= 50) ? "Superobesidade" : resultado;
		
		/* Printando resultados */
		DecimalFormat format = new DecimalFormat("#.00");
		System.out.println("\nSeu IMC é: " + format.format(imc));
		System.out.println("Resultado: " + resultado);
		
	}

}
