package Graficos;

import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B8_74_Eventos_Foco {
	public static void main(String[]ars) {
		MarcoFoco mimarco = new MarcoFoco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class MarcoFoco extends JFrame{
	public MarcoFoco() {
		setVisible(true);
		setBounds(700,300,600,450);
		add(new LaminaFoco());                       							
	}
}

             
class LaminaFoco extends JPanel{
	
	public void paintComponent(Graphics g) {
	super.paintComponent(g);
	setLayout(null);																//quitamos el ordenamiento por defecto que pone Java a los textos que pongamos en la lámina
	
	//instanciamos los dos cuadros de texto
	cuadro1 = new JTextField(); 												    //usamos el constructor por defecto de esta clase
	cuadro2 = new JTextField();
	cuadro1.setBounds(120, 10, 150, 20);
	cuadro2.setBounds(120, 50, 150, 20);
	add(cuadro1);
	add(cuadro2);
	
	LanzaFocos foco = new LanzaFocos();
	cuadro1.addFocusListener(foco);                      							 //cuadro1 queda a la escucha
	}
	
	//fabricamos 2 variables de cuadros de texto, del tipo de la clase JTextFild:
	JTextField cuadro1;															//estas variables se declaran fuera del método paintComponent, para que se puedan usar fuera de este método. de lo contrario serían locales. 					
	JTextField cuadro2;
	
	//CLASE INTERNA_nos permite tener acceso a cuadro1 y cuadro2.
	//CLASE OYENTE
	private class LanzaFocos implements FocusListener{

		public void focusGained(FocusEvent e) {
			System.out.println("Ha retornado el foco");
			}

		public void focusLost(FocusEvent e) {
			String email = cuadro1.getText();  									//con esto capturamos lo que se escriba en el cuadro1
			boolean comprobacion = false;
			
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					comprobacion = true;		
				}
			}
			if(comprobacion == true) {
				System.out.println("Es Correcto");
			}else {
				System.out.println("Es incorrecto");
			}	
		}
		
	}
}



