package Graficos;

//la clase lámina dejará de ser el oyente

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 


public class B1_67_Eventos_Modificacion_Ej_Anterior {
	
	public static void main(String[]args) {
		
		MarcoBotones1 miMarco = new MarcoBotones1();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}


class MarcoBotones1 extends JFrame{
	
	public MarcoBotones1() {
		setTitle("Botones y Eventos");
		setBounds(300,30,700,700);
		
		LaminaBotones1 miLamina = new LaminaBotones1();
		add(miLamina);
		
	}
}

class LaminaBotones1 extends JPanel { 
	
	JButton botonAzul = new JButton("Azul");            							 //se crea el obj botón y en el parámetro se pone el nombre del botón.
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones1() {
		
		
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);						 //instanciamos la clase interna ColorFondo
		ColorFondo Azul = new ColorFondo(Color.BLUE);	
		ColorFondo Rojo = new ColorFondo(Color.RED);	
		
		add(botonAzul);
		botonAzul.addActionListener(Azul); 											 //le indicamos quien va a ser el obj oyente. ponemos "this", pq el obj va a ser la misma lámina, o sea la clase Lamina botones, para que esta se ponga azul, al tocar el botón.
																				     //el obj oyente, debe implementar la interfaz ActionListener, definido por el mét. addActionListener().
		add(botonAmarillo);
		botonAmarillo.addActionListener(Amarillo);
		
		add(botonRojo);
		botonRojo.addActionListener(Rojo);
	}
	                                                                             //le ponemos private para que el código de otras clases, no acedan a ella por error..
		private class ColorFondo implements ActionListener{
		
			public ColorFondo(Color c) {
			colorDeFondo = c;
			}
			public void actionPerformed(ActionEvent e) {
				setBackground(colorDeFondo);
			}
			private Color colorDeFondo;
		}
}

	
	
	