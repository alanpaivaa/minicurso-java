package minicurso.java.exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class IMCTeste {

	public static void main(String[] args) {
		// Declarando variáveis
		int escolha;
		ArrayList<IMC> imcs = new ArrayList<IMC>();
		Util util = new Util();
		Scanner scanner = new Scanner(System.in);

		do {
			escolha = util.menu(scanner);
			switch (escolha) {
			case 1:
				IMC imc = util.pegaIMC(scanner);
				imc.calculaImc();
				imc.calculaResultado();
				imcs.add(imc);
				break;
			case 2:
				util.printaImcs(imcs);
				break;
			}

		} while (escolha != 0);

		scanner.close();

		System.out.println("Programa finalizado");
	}

}
