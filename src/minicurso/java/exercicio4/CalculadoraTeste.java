package minicurso.java.exercicio4;

/** Classe que testa a classe calculadora */
public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora("HP", "X-480");
		System.out.println(calculadora.soma(10, 20));
		System.out.println(calculadora.soma("10", "20"));
		System.out.println(calculadora.subtrai(10, 1));
		System.out.println(calculadora.multiplica(20, 3));
		System.out.println(calculadora.divide(10, 5));
	}
	
}
