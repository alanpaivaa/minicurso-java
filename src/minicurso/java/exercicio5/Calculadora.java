package minicurso.java.exercicio5;

/** Classe que abstrai as quatro operações básicas */
public class Calculadora {
	
	private String marca;
	private String modelo;

	public Calculadora(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public double soma(String x, String y) {
		return Double.parseDouble(x) + Double.parseDouble(y);
	}
	
	public double subtrai(String x, String y) {
		return Double.parseDouble(x) - Double.parseDouble(y);
	}
	
	public double multiplica(String x, String y) {
		return Double.parseDouble(x) * Double.parseDouble(y);
	}
	
	public double divide(String x, String y) {
		return Double.parseDouble(x) / Double.parseDouble(y);
	}
	
	/* Métodos Sobrecarregados */
	public double soma(double x, double y) {
		return x + y;
	}
	
	public double subtrai(double x, double y) {
		return x - y;
	}
	
	public double multiplica(double x, double y) {
		return x * y;
	}
	
	public double divide(double x, double y) {
		return x / y;
	}
	
	/* Getters e Setters */
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
