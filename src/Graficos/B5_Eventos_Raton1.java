package Graficos;

import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.event.*;

public class B5_Eventos_Raton1 {
	public static void main(String[]ars) {
	
		MarcoRaton mimarco = new MarcoRaton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

//Objeto fuente
class MarcoRaton extends JFrame{
	public MarcoRaton() {
		setVisible(true);
		setBounds(700,300,600,450);
		
		EventosDeRaton raton = new EventosDeRaton();
		addMouseListener(raton);                        							//ponemos en escucha al oyente EventosDeRaton
	}
}

//objeto oyente
class EventosDeRaton implements MouseListener{

	public void mouseClicked(MouseEvent e) {System.out.println("haz hecho click");}

	public void mouseEntered(MouseEvent e) {System.out.println("Acabas de entrar en el marco");}

	public void mouseExited(MouseEvent e) {System.out.println("Acabas de salir del marco");}

	public void mousePressed(MouseEvent e) {System.out.println("Acabas de presionar");}

	public void mouseReleased(MouseEvent e) {System.out.println("Acabas de levantar");}
	
}