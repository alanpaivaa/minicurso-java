package minicurso.java.exercicio5;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** Classe gráfica que abstrai uma calculadora */
public class CalculadoraGrafica extends JFrame {

	private static final long serialVersionUID = 1L;
	
	// Components
	private JTextField display = new JTextField();
	private JPanel keyboard = new JPanel(new GridLayout(4, 4, 2, 2));
	
	// Listeners
	private TecladoListener tecladoListener = null; 
	
	private JButton createButton(String text) {
		JButton button = new JButton(text);
		button.addActionListener(this.tecladoListener);
		this.keyboard.add(button);
		return button;
	}
	
	public CalculadoraGrafica(Calculadora calculadora) {
		super("Calculadora");
		this.tecladoListener = new TecladoListener(this.display, calculadora);
		
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout(0, 0));
		
		// Display
		Font font = new Font("", Font.PLAIN, 30);
		display.setFont(font);
		c.add(BorderLayout.NORTH, display);
		
		// Teclado
		keyboard.setSize(50, 50);
		keyboard.add(this.createButton("7"));
		keyboard.add(this.createButton("8"));
		keyboard.add(this.createButton("9"));
		keyboard.add(this.createButton("/"));
		keyboard.add(this.createButton("4"));
		keyboard.add(this.createButton("5"));
		keyboard.add(this.createButton("6"));
		keyboard.add(this.createButton("*"));
		keyboard.add(this.createButton("1"));
		keyboard.add(this.createButton("2"));
		keyboard.add(this.createButton("3"));
		keyboard.add(this.createButton("-"));
		keyboard.add(this.createButton("C"));
		keyboard.add(this.createButton("0"));
		keyboard.add(this.createButton("="));
		keyboard.add(this.createButton("+"));
		
		c.add(BorderLayout.CENTER, keyboard);
		
		// JFrame config
		this.setSize(250, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new CalculadoraGrafica(new Calculadora("HP", "X-480"));
	}
	
}
