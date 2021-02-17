package Graficos;

import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.event.*;

public class B7_73_Eventos_Raton2_In_MouseMotionListener {
public static void main(String[]ars) {
		
		MarcoRaton3 mimarco = new MarcoRaton3();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

//Objeto fuente
class MarcoRaton3 extends JFrame{
	public MarcoRaton3() {
		setVisible(true);
		setBounds(700,300,600,450);
		
		EventosDeRaton3 raton = new EventosDeRaton3();
		addMouseMotionListener(raton);                        							//ponemos en escucha al oyente EventosDeRaton
	}
}

//objeto oyente               
class EventosDeRaton3 implements MouseMotionListener{

	
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("Estás arrastrando el ratón");
	}

	
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("Estás moviendo el ratón");
	}
		
}
	

