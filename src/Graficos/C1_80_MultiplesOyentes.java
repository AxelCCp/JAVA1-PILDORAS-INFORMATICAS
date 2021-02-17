package Graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class C1_80_MultiplesOyentes {
	public static void main(String[]args) {
		Marco_Principal marco = new Marco_Principal();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);		
	}
}

class Marco_Principal extends JFrame{
	public Marco_Principal(){
		setTitle("Prueba Varios");
		setBounds(900, 100, 300, 200);
		Lamina_Principal lamina = new Lamina_Principal();
		add(lamina);	
	}
}

class Lamina_Principal extends JPanel{
	public Lamina_Principal() {
		JButton boton_nuevo = new JButton("Nuevo");
		add(boton_nuevo);
		boton_cerrar = new JButton("Cerrar todo");
		add(boton_cerrar);	
		OyenteNuevo miOyente = new OyenteNuevo();
		boton_nuevo.addActionListener(miOyente);
	}
	private class OyenteNuevo implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
			marco.setVisible(true);
		}
	}
	JButton boton_cerrar;
}

class Marco_Emergente extends JFrame{
	public Marco_Emergente(JButton boton_de_principal) {
		contador++;
		setTitle("Ventana " + contador);
		setBounds(40*contador,40*contador,300,150);
		CierraTodos oyenteCerrar = new CierraTodos();
		boton_de_principal.addActionListener(oyenteCerrar);
	}
	private class CierraTodos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			dispose();                                                              //dispose():pertenece a JFrame, libera los recursos de todas las ventanas y sus componentes...
			
		}
		
	}
	private static int contador = 0; 																		//al ser Static, se consigue que esta variable pueda ser compartida por todas las instancias que creemos en un futuro. y al ser private, la encapsulamos.
}