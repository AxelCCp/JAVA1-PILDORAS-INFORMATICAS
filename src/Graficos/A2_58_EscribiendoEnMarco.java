package Graficos;

import javax.swing.*;
import java.awt.*;

public class A2_58_EscribiendoEnMarco {
	public static void main(String[]args) {
		MarcoConTexto miMarco = new MarcoConTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("primer texto");	
			
		Lamina miLamina = new Lamina();                                    //después de hacer la clase Lamina, intanciamos nuestra clase lámina y la agregamos.
		add(miLamina);                                                     //ponemos la lamina por encima de marco
		
	}
}

class Lamina extends JPanel{                                                     //con esto construimos la lámina.
	
	public void paintComponent(Graphics g) {                                     //sobreescribir el método paintComponent que hereda la clase JPanel. lo sobreescribimos, para pintar lo que nosotros queramos.  "g" es un argumento de tipo Graphics. paintComponent() está declarado en la clase JComponent. y JPanel hereda de JComponent.    
		
		super.paintComponents(g);                                                //invocamos al método paintComponent()  originario de la clase JComponent, para que haga su trabajo para el cual fue creado en su origen. para que haga esto + lo que le dijimos que hiciera con g.drawString(...
		g.drawString("Estamos aprendiendo Swing", 100, 100);                     //este método recibe como parámetros, un String, y las referencias de X e y.
		
	}
}
