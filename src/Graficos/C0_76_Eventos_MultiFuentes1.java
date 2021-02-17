package Graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
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
//import java.awt.event.*;
//import java.awt.*;

public class C0_76_Eventos_MultiFuentes1 {
	public static void main(String[]args) {
		MarcoAccion marco = new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);	
	}
}

class MarcoAccion extends JFrame{
	public MarcoAccion() {
		setTitle("Prueba Acciones");
		setBounds(600,350,600,300);
		PanelAccion lamina = new PanelAccion();
		add(lamina);		
	}
}


class PanelAccion extends JPanel{
	public PanelAccion(){
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("C:/Users/Fantasma/eclipse-workspace/JavaPildorasInformaticas/src/Graficos/icon_favourites.gif"), Color.yellow);
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("C:/Users/Fantasma/eclipse-workspace/JavaPildorasInformaticas/src/Graficos/application_firefox.gif"), Color.blue);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("C:/Users/Fantasma/eclipse-workspace/JavaPildorasInformaticas/src/Graficos/application_flash.gif"), Color.red);
											//add(new JButton(accionAmarillo));  //..versión abreviada 
		JButton botonAmarillo = new JButton(accionAmarillo);
		add(botonAmarillo);
		JButton botonAzul = new JButton(accionAzul);
		add(botonAzul);
		JButton botonRojo = new JButton(accionRojo);
		add(botonRojo);
		
																									//Creando mapa de entrada
		InputMap mapa = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);             	  			//clase InputMap: proporciona un vínculo entre un evento y un obj. 
																									//WHEN_IN_... constante de tipo entero de JComponent
		KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");  								//creando combinación de teclas
		KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
		KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
		mapa.put(teclaAmarillo, "fondo_amarillo");													//Asignando combinación de teclas
		mapa.put(teclaAzul, "fondo_azul");
		mapa.put(teclaRojo, "fondo_rojo");
		ActionMap mapaAccion = getActionMap();           											 //crea una instancia obj de tipo ActionMap.
		mapaAccion.put("fondo_amarillo", accionAmarillo); 											 //usa mét. put() de ActionMap // asignando obj a acción.
		mapaAccion.put("fondo_azul", accionAzul); 
		mapaAccion.put("fondo_rojo", accionRojo); 
		
		
		
	}	
	//CLASE OYENTE interna
	private class AccionColor extends AbstractAction{	
		public AccionColor(String nombre, Icon Icono, Color color_Boton){
			
			putValue(Action.NAME,nombre);                   								        //NAME es una constante de la interface Action.
			putValue(Action.SMALL_ICON,Icono);
			putValue(Action.SHORT_DESCRIPTION,"Poner la lámina de color " + nombre);
			putValue("Color_de_fondo",color_Boton);
		}
		public void actionPerformed(ActionEvent e) {
			Color c = (Color)getValue("Color_de_fondo");
			setBackground(c);               								       	       //este método es de JPanel, por este motivo, la clase oyente la volvimos interna. para que se reconozca a este método.
			System.out.println("Nombre: " + getValue(Action.NAME) 
								+ "\nDescripción: " + getValue(Action.SHORT_DESCRIPTION));
		}
	}	
}



