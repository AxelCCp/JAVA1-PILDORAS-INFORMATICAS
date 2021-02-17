package Graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 															//para poder implementar la interfaz ActionListener


public class B0_65_Eventos1 {
	
public static void main(String[]args) {
		
		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}


class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(300,30,700,700);
		
		LaminaBotones miLamina = new LaminaBotones();
		add(miLamina);
		
	}
}

class LaminaBotones extends JPanel implements ActionListener{ 
	
	JButton botonAzul = new JButton("Azul");            							 //se crea el obj botón y en el parámetro se pone el nombre del botón.
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones() {
		add(botonAzul);
		botonAzul.addActionListener(this); 											 //le indicamos quien va a ser el obj oyente. ponemos "this", pq el obj va a ser la misma lámina, o sea la clase Lamina botones, para que esta se ponga azul, al tocar el botón.
																				     //el obj oyente, debe implementar la interfaz ActionListener, definido por el mét. addActionListener().
		add(botonAmarillo);
		botonAmarillo.addActionListener(this);
		
		add(botonRojo);
		botonRojo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {                                     //desarrollamos el método de la interfaz ActionListener. recibe x parámetro un obj de tipo evento. 
		
		Object botonPulsado = e.getSource();									     //este mét. pertenece a la clase ActionEvent, e identifica el origen del evento. o sea qué botón fue pulsado. 
		
		if(botonPulsado == botonAzul) {	
			setBackground(Color.BLUE); 
		}else if(botonPulsado == botonAmarillo) {
			setBackground(Color.YELLOW);          								     //le decimos lo que tiene que hacer el método. establece color.
		}else {
			setBackground(Color.RED);
		}	
	}															
}
