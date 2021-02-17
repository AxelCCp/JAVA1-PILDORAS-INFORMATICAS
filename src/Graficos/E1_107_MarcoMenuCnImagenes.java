package Graficos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class E1_107_MarcoMenuCnImagenes {
	public static void main(String[]args) {
		MarcoMenu1 marco = new MarcoMenu1();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoMenu1 extends JFrame{
	public MarcoMenu1() {
		setBounds(550,350,550,350);
		setVisible(true);
		MenuLamina1 lamina = new MenuLamina1();
		add(lamina);
		
		
	}
}


class MenuLamina1 extends JPanel{
	public MenuLamina1() {
		JMenuBar mibarra = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edición");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu opciones = new JMenu("Opciones");
		
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarComo = new JMenuItem("Guardar como");
		
		JMenuItem cortar = new JMenuItem("Cortar",new ImageIcon("bin/Graficos/cut.gif"));
		JMenuItem copiar = new JMenuItem("Copiar",new ImageIcon("bin/Graficos/copy.gif"));
		JMenuItem pegar = new JMenuItem("Pegar",new ImageIcon("bin/Graficos/note.gif"));
		pegar.setHorizontalTextPosition(SwingConstants.LEFT); //con esto se puede cambiar de posición el icono .gif
		
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
