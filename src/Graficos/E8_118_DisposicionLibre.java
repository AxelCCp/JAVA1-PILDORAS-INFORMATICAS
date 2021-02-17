package Graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class E8_118_DisposicionLibre {
	public static void main(String[]args) {
		MarcoLibre xxx = new MarcoLibre();
		xxx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MarcoLibre extends JFrame{
	public MarcoLibre() {
		setBounds(200,100,500,500);
		setVisible(true);
		LaminaLibre lamina = new LaminaLibre();
		add(lamina);
	}
}
class LaminaLibre extends JPanel{
	public LaminaLibre() {
		
		setLayout(null);
		
		JLabel nombre = new JLabel("Nombre: ");
		JLabel apellido = new JLabel("Apellido: ");
		JTextField cuadroNombre = new JTextField();  											//( ) no necesita llevar int de longitud del cuadro de texto.						 
		JTextField cuadroApellido = new JTextField();
		
		nombre.setBounds(20, 20, 80, 10);
		cuadroNombre.setBounds(100, 20, 100, 20);
		
		apellido.setBounds(20, 55, 80, 15);
		cuadroApellido.setBounds(100, 50, 100, 20);
		
		add(nombre);
		add(cuadroNombre);
		
		add(apellido);
		add(cuadroApellido);
	
		/*
		setLayout(null);															//le decimos a la lámina que trabajaremos con una disposición libre.
		JButton boton1 = new JButton("Botón 1");
		boton1.setBounds(50, 50, 150, 50);															//usamos este método para localizar el botón.
		add(boton1);
		JButton boton2 = new JButton("Botón 2");
		boton2.setBounds(200, 50, 150, 50);
		add(boton2);
		*/
	}
}

