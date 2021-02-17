package Graficos;
import java.awt.Frame;

import javax.swing.*;

public class A0_55_CreandoMarcos {
	public static void main(String[]args) {
		miMarco marco1 = new miMarco();
		//hacer visible una ventana con setVisible()
		marco1.setVisible(true);
		//decirle al programa, qu� hacer cuando la ventana se cierre:
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             //el m�todo debe recibir un par�metro de tipo entero.
	                                         //HIDE_ON_CLOSE               ...CON ESTO esconder�a la ventana, pero el programa seguir�a andando.
	}
}

class miMarco extends JFrame{	
	//constructor y m�todos de JFrame:
	public miMarco() {
		//establecemos el tama�o de la ventana con el m�todo
		//setSize(500,300);
		
		//establecemos locaci�n en la pantalla
		//setLocation(500,300);
		
		//con setBounds(ubicaci�n,ubicacion,ancho,alto) hacemos las 2 cosas anteriores
		setBounds(500,300,550,250);
		
		//para que el usuario pueda o no, redimensionar la ventana con el mouse.
		//setResizable(false);
		
		//para que la ventana aparezca a pantalla completa.
		//setExtendedState(Frame.MAXIMIZED_BOTH);           //lleva un campo de clase (variable) Frame. Es una constante public static final int,  .
		
		setTitle("Mi ventana");
	}
}
