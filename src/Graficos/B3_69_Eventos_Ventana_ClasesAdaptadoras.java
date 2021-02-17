package Graficos;

//se usa una clase adaptadora en vez de una interfaz.


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class B3_69_Eventos_Ventana_ClasesAdaptadoras {
	
	public static void main(String[]args) {
		
		MarcoVentana2 miMarco = new MarcoVentana2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("Ventana 1");
		miMarco.setBounds(300,300,500,350);
		
		MarcoVentana2 miMarco2 = new MarcoVentana2();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		miMarco2.setTitle("Ventana 2");
		miMarco2.setBounds(900,300,500,350);
	}
}

class MarcoVentana2 extends JFrame{
	public MarcoVentana2() {
		//setTitle("Respondiendo");
		//setBounds(300,300,500,350);
		setVisible(true);
		
		//M_Ventana2 oyente_ventana = new M_Ventana2(); 
		//addWindowListener(oyente_ventana);                                    //ponemos a la ventana a la escucha de que se produzca un evento de tipo ventana.
		
		addWindowListener(new M_Ventana2());                                    //simplifico código
		
	}
}
class M_Ventana2 extends WindowAdapter{
	public void windowIconified(WindowEvent e) {System.out.println("Ventana minimizada");}	
}



