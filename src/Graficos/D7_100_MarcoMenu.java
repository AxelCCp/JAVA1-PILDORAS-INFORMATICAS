package Graficos;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class D7_100_MarcoMenu {
	public static void main (String[]args) {
		MarcoMenu marco = new MarcoMenu();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoMenu extends JFrame{
	public MarcoMenu() {
		setBounds(550,350,550,350);
		setVisible(true);
		MenuLamina lamina = new MenuLamina();
		add(lamina);
		
		
	}
}


class MenuLamina extends JPanel{
	public MenuLamina() {
		JMenuBar mibarra = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edición");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu opciones = new JMenu("Opciones");
		
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarComo = new JMenuItem("Guardar como");
		JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem pegar = new JMenuItem("Pegar");
		JMenuItem generales = new JMenuItem("Generales");
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		
		archivo.add(guardar);
		archivo.add(guardarComo);
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.addSeparator();
		
		opciones.add(opcion1);
		opciones.add(opcion2);
		edicion.add(opciones);
		
		herramientas.add(generales);
		
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);
		
		
		add(mibarra);
		
		
		
		
		
	}
	
}