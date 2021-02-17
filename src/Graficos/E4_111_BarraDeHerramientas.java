package Graficos;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class E4_111_BarraDeHerramientas {
	public static void main(String[]args) {

		Marco_Barra mimarco=new Marco_Barra();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
	}
}


class Marco_Barra extends JFrame{
	
	public Marco_Barra(){
		
		setTitle("Marco con Barra");
		
		setBounds(500,300,600,450);
		
		lamina=new JPanel();
		
		add(lamina);
		
		// configuración de acciones
		Action accionAzul=new AccionColorC("Azul", new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/box.gif"), Color.BLUE);
		Action accionAmarillo=new AccionColorC("Amarillo", new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/note.gif"), Color.YELLOW);
		Action accionRojo=new AccionColorC("Rojo", new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/flag_red.gif"), Color.RED);		
		Action accionSalir=new AbstractAction("Salir", new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/arrow_right.gif")) {
	
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);			
			}
			
		};
		
		JMenu menuX = new JMenu("Color");
		menuX.add(accionAzul);
		menuX.add(accionAmarillo);
		menuX.add(accionRojo);
		
		JMenuBar barraMenu = new JMenuBar();
		barraMenu.add(menuX);
		
		setJMenuBar(barraMenu); 									//permite anclar directamente la barraMenu al marco. 
		
		//Construcción de la barra de herramientas:
		
		JToolBar barraTool = new JToolBar();
		barraTool.add(accionAzul);
		barraTool.add(accionAmarillo);
		barraTool.add(accionRojo);
		barraTool.addSeparator();
		barraTool.add(accionSalir);
		
		add(barraTool,BorderLayout.NORTH);
		
		
	}
		
	
	private class AccionColorC extends AbstractAction{
		
		public AccionColorC(String nombre, Icon icono, Color c){
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			putValue("Color", c);
		}

		public void actionPerformed(ActionEvent arg0) {
			Color c=(Color) getValue("Color");
			lamina.setBackground(c);
		}		
	}
	
	private JPanel lamina;
}
