package Graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class E3_111_BarrasDeHerramientas {
	public static void main(String[]args) {
		MarcoAccionX MarcoX = new MarcoAccionX();
		MarcoX.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MarcoX.setVisible(true);
		
	}
}

class MarcoAccionX extends JFrame{
	public MarcoAccionX() {
		setBounds(400,150,500,500);
		setVisible(true);
		LaminaAccion laminaX = new LaminaAccion();
		add(laminaX);
		
	}
}


class LaminaAccion extends JPanel{
	public LaminaAccion() {
		
		AccionColor accionAmarillo=new AccionColor("Amarillo", new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/note.gif"),Color.YELLOW); 
		AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/box.gif"),Color.BLUE);
		AccionColor accionRoja= new AccionColor("Rojo",new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/flag_red.gif"),Color.RED);
		
		JButton botonAmarillo = new JButton(accionAmarillo);
		JButton botonAzul= new JButton(accionAzul);
		JButton botonRojo = new JButton(accionRoja);
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);
		
		InputMap xxx = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		KeyStroke teclaAmarilla = KeyStroke.getKeyStroke("ctrl A"); 
		KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl Z"); 
		KeyStroke teclaRoja = KeyStroke.getKeyStroke("ctrl R");
		
		xxx.put(teclaAmarilla, "fondo_amarillo");
		xxx.put(teclaAzul, "fondo_azul");
		xxx.put(teclaRoja, "fondo_rojo");
		
		ActionMap mapaDeAccion = getActionMap();
		mapaDeAccion.put("fondo_amarillo", accionAmarillo);
		mapaDeAccion.put("fondo_azul", accionAzul);
		mapaDeAccion.put("fondo_rojo", accionRoja);
		
	}
	private class AccionColor extends AbstractAction{
		public AccionColor(String nombre, Icon icono, Color colorBoton) {
			putValue(Action.NAME,nombre);
			putValue(Action.SMALL_ICON,icono);
			putValue(Action.SHORT_DESCRIPTION,"Poner Lámina de color " + nombre);
			putValue("Color_de_fondo",colorBoton);	
		}

		public void actionPerformed(ActionEvent e) {
			Color c = (Color)getValue("Color_de_fondo");
			setBackground(c);
			System.out.println("Nombre: " + getValue(Action.NAME) 
								+ "\nDescripción: " + getValue(Action.SHORT_DESCRIPTION));
			
		}
		
	}
}
