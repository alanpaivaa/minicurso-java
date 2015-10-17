package minicurso.java.exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/** Classe que possue métodos convenientes relacionados ao IMC. */
public class Util {

	/** Printa um menu e retorna a escolha do usuário */
	int menu(Scanner scanner) {
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Adicionar IMC");
		System.out.println("2 - Mostrar IMC's");
		System.out.println("0 - Sair");
		
		int escolha = scanner.nextInt();
		scanner.nextLine(); // Limpa a quebra de linha
		
		return escolha;
	}
	
	/** Printa um menu para o usuário colocar os dados e retorna um objeto IMC */
	IMC pegaIMC(Scanner scanner) {
		
		IMC imc = new  IMC();
		
		System.out.print("Digite seu peso (em kilogramas): ");
		imc.peso = scanner.nextDouble();

		System.out.print("Digite sua altura (em metros): ");
		imc.altura = scanner.nextDouble();

		scanner.nextLine();
		
		System.out.println("\n");
		
		return imc;
	}

	/** Printa os status dos imcs */
	void printaImcs(ArrayList<IMC> imcs) {
		for(IMC imc: imcs) {
			imc.printaStatus();
			System.out.println("-------------------");
		}
		System.out.println("\n");
	}
	
}
