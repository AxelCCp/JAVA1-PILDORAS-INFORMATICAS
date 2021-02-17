package Graficos;

import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.event.*;

public class B6_Eventos_Raton1_ClaseAdaptadora {
	public static void main(String[]ars) {
		
		MarcoRaton2 mimarco = new MarcoRaton2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

//Objeto fuente
class MarcoRaton2 extends JFrame{
	public MarcoRaton2() {
		setVisible(true);
		setBounds(700,300,600,450);
		
		EventosDeRaton2 raton = new EventosDeRaton2();
		addMouseListener(raton);                        							//ponemos en escucha al oyente EventosDeRaton
	}
}

//objeto oyente               //Clase adaptadora
class EventosDeRaton2 extends MouseAdapter{
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("Haz hecho click en...");
		System.out.println("Coordenada X: " +  e.getX() + " Coordenada Y: " + e.getY()); 		//metodos de la clase MouseEvent
		System.out.println("Numero de click's: " + e.getClickCount());
	}
	
	public void mousePressed(MouseEvent e) {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		System.out.println("valor del click del mouse es: "+ e.getModifiersEx());  												//da el valor de las constantes de clase que están dentro de MouseEvent
		
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Haz pulsado el botón izquierdo, su constante de clase es BUTTON1_DOWN_MASK = 1024");
			
		}else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Haz pulsado la rueda del ratón, su constante de clase es BUTTON2_DOWN_MASK = 2048");
			
		}else if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Haz pulsado el botón derecho,su constante de clase es BUTTON2_DOWN_MASK = 4096");
		}
	}
	
}


