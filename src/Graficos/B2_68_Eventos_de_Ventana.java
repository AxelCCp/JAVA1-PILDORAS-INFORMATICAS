package Graficos;

import javax.swing.*;
import java.awt.event.*;

public class B2_68_Eventos_de_Ventana {
	public static void main(String[]args) {
		
		MarcoVentana miMarco = new MarcoVentana();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("Ventana 1");
		miMarco.setBounds(300,300,500,350);
		
		MarcoVentana miMarco2 = new MarcoVentana();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		miMarco2.setTitle("Ventana 2");
		miMarco2.setBounds(900,300,500,350);
	}
}

class MarcoVentana extends JFrame{
	public MarcoVentana() {
		//setTitle("Respondiendo");
		//setBounds(300,300,500,350);
		setVisible(true);
		
		M_Ventana oyente_ventana = new M_Ventana(); 
		addWindowListener(oyente_ventana);                                    //ponemos a la ventana a la escucha de que se produzca un evento de tipo ventana.
		
	}
}


class M_Ventana implements WindowListener{
	
	public void windowActivated(WindowEvent e) {System.out.println("Ventana Activada");}
	public void windowClosed(WindowEvent e) {System.out.println("La ventana 2 ha sido cerrada");}
	public void windowClosing(WindowEvent e) {System.out.println("Cerrando Ventana");}
	public void windowDeactivated(WindowEvent e) {System.out.println("Ventana desactivada");}
	public void windowDeiconified(WindowEvent e){System.out.println("Ventana restaurada");}
	public void windowIconified(WindowEvent e) {System.out.println("Ventana minimizada");}
	public void windowOpened(WindowEvent e) {System.out.println("Ventana Abierta");}
	
	
	
}





