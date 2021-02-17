package Graficos;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class E2_109_MenuEmergente {
	public static void main(String[]args) {
		MarcoMenuX marco = new MarcoMenuX();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}

class MarcoMenuX extends JFrame{
	public MarcoMenuX() {
		setBounds(400,150,500,500);
		setVisible(true);
		LaminaEmergente lamina = new LaminaEmergente();
		add(lamina);
	}
}

class LaminaEmergente extends JPanel{
	public LaminaEmergente() {
		
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		JMenuBar barra = new JMenuBar();
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamano = new JMenu("Tamaño");
		barra.add(fuente);
		barra.add(estilo);
		barra.add(tamano);
		laminaMenu.add(barra);
		add(laminaMenu,BorderLayout.NORTH);
		
		JTextPane cuadroTexto = new JTextPane();
		add(cuadroTexto,BorderLayout.CENTER);
		
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		JMenuItem opcion3 = new JMenuItem("Opcion 3");
		emergente.add(opcion1);
		emergente.add(opcion2);
		emergente.add(opcion3);
		cuadroTexto.setComponentPopupMenu(emergente);  		//este metodo hace aparecer el menu al paretar click derecho. se pone "cuadroTexto", para que aparezca sobre el texto. si no se le pone, queda tapado por el texto
		
	}
}
