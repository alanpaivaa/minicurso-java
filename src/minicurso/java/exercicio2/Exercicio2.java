package minicurso.java.exercicio2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {

	/** Printa um menu e retorna a escolha do usuário */
	public static int menu(Scanner scanner) {
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Adicionar IMC");
		System.out.println("2 - Mostrar IMC's");
		System.out.println("0 - Sair");
		
		int escolha = scanner.nextInt();
		scanner.nextLine(); // Limpa a quebra de linha
		
		return escolha;
	}
	
	/** Requisita os dados do usuário via Scanner e retorna o valor do IMC. */
	public static double imc(Scanner scanner) {
		
		System.out.print("Digite seu peso (em kilogramas): ");
		double peso = scanner.nextDouble();

		System.out.print("Digite sua altura (em metros): ");
		double altura = scanner.nextDouble();

		scanner.nextLine();
		
		System.out.println("\n");
		
		return peso / (altura * altura);
		
	}

	/**
	 * Retorna uma frase de resultado de um IMC.
	 * 
	 * @param imc
	 *            IMC do qual se deseja calcular o resultado.
	 */
	public static String calculaResultado(double imc) {
		String resultado = (imc < 20) ? "Abaixo do peso" : null;
		resultado = (imc >= 20 && imc < 25) ? "Peso ideal" : resultado;
		resultado = (imc >= 25 && imc < 30) ? "Sobrepeso" : resultado;
		resultado = (imc >= 30 && imc < 35) ? "Obesidade Grau I" : resultado;
		resultado = (imc >= 35 && imc < 40) ? "Obesidade Grau II" : resultado;
		resultado = (imc >= 40 && imc < 50) ? "Obesidade Grau III" : resultado;
		resultado = (imc >= 50) ? "Superobesidade" : resultado;
		return resultado;
	}

	/** Printa um imc e um resultado */
	public static void printaStatus(double imc, String resultado) {
		DecimalFormat format = new DecimalFormat("#.00");
		System.out.println("\nIMC: " + format.format(imc));
		System.out.println("Resultado: " + resultado);
	}

	/** Printa todos os imcs e resultados */
	public static void printaImcsEResultados(double[] imcs, String[] resultados, int tamanho) {
		for(int i=0;i<tamanho;i++) {
			printaStatus(imcs[i], resultados[i]);
			System.out.println("-------------------");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {

		// Declarando variáveis
		int escolha, index = 0;
		double[] imcs = new double[100];
		String[] resultados = new String[100];
		Scanner scanner = new Scanner(System.in);
		
		do {
			escolha = menu(scanner);
			switch (escolha) {
			case 1:
				imcs[index] = imc(scanner);
				resultados[index] = calculaResultado(imcs[index++]);
				break;
			case 2:
				printaImcsEResultados(imcs, resultados, index);
				break;
			}
			
		} while (escolha != 0);
		
		scanner.close();
		
		System.out.println("Programa finalizado");

	}

}
