package Graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

//
public class B9_75_Eventos_FocoVentana extends JFrame implements WindowFocusListener {
	
	public static void main(String[]args) {
		
		B9_75_Eventos_FocoVentana miV = new B9_75_Eventos_FocoVentana();
		miV.iniciar();
		
	}
	
	
	public void iniciar() {
		marco1= new B9_75_Eventos_FocoVentana();
		marco2= new B9_75_Eventos_FocoVentana();
		marco1.setVisible(true);
		marco2.setVisible(true);
		marco1.setBounds(50,100,600,350);
		marco2.setBounds(700,100,600,350);
		marco1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(EXIT_ON_CLOSE);
		marco1.addWindowFocusListener(this);                                      			//como estamos en la misma clase, se usa this. para hacer referencia al objeto. o sea la misma clase
		marco2.addWindowFocusListener(this);
		
	}

	public void windowGainedFocus(WindowEvent e) { 											//e: es el obj del evento que se genera
		if(e.getSource()==marco1) {         											   //detectamos en origen del evento ocurrido con getSource
			marco1.setTitle("Tengo el foco!! :D");
		}else {
			marco2.setTitle("Tengo el foco!! :D");
		}
	}
	public void windowLostFocus(WindowEvent e) {
		if(e.getSource()==marco1) {         												//detectamos en origen del evento ocurrido con getSource
			marco1.setTitle("no tengo el foco  :(");
		}else {
			marco2.setTitle("no tengo el foco  :(");
		}
	}
	B9_75_Eventos_FocoVentana marco1;
	B9_75_Eventos_FocoVentana marco2;		
}
