package Graficos;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.*;



public class B4_71_Eventos_Teclado1 {
	public static void main(String[]args) {
		MarcoConTeclas mimarco = new MarcoConTeclas();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
	}
}

class MarcoConTeclas extends JFrame{
	public MarcoConTeclas() {
		setVisible(true);
		setBounds(700,300,600,450);
		EventoDeTeclado tecla = new EventoDeTeclado();
		addKeyListener(tecla);                                  		//ponemos a la instancia a la escucha
	}	
}

//clase oyente
class EventoDeTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		int codigo = e.getKeyCode();
		System.out.println(codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char letra = e.getKeyChar();
		System.out.println(letra);
	}
	
	
}
