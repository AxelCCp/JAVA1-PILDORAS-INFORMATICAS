package Graficos;

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.*;

public class B3_70_Eventos_Ventana_CtrolEstadoVentana {
	public static void main(String[]args) {
		
		MarcoEstado mimarco = new MarcoEstado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoEstado extends JFrame{
	public MarcoEstado() {
		setVisible(true);
		setBounds(300,300,500,350);
		CambiaEstado nuevoEstado = new CambiaEstado();
		addWindowStateListener(nuevoEstado);							 //ponemos la instancia a la escucha.o sea le decimos, estate a la escucha por si hay un cambio de ventana. 		
	}
}

class CambiaEstado implements WindowStateListener{
	public void windowStateChanged(WindowEvent e) {
		System.out.println("la ventana ha cambiado de estado");
		//System.out.println(e.getNewState());  							 //nos devuelve el estado de la ventana.
																		 //devuelve los valores de las constantes de clase que aparecen en la api, en clase Frame.
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana está a pantalla completa");
		}else if(e.getNewState()==Frame.NORMAL) {
			System.out.println("La ventana está normal");
		}else if(e.getNewState()==Frame.ICONIFIED) {
			System.out.println("la ventana está minimizada");
		}
	
	}	
}
