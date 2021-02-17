package Graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class A4_60_PruebaDibujo2D {
	
	public static void main(String[]args) {
		
		MarcoConDibujos1 miMarco = new MarcoConDibujos1();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}


class MarcoConDibujos1 extends JFrame{
	
	public MarcoConDibujos1() {
		setTitle("prueba de dibujo");
		setSize(400, 400);
		
		LaminaConFiguras1 miLamina = new LaminaConFiguras1();
		add(miLamina);
		
	}
}

class LaminaConFiguras1 extends JPanel{
	
	public void paintComponent(Graphics g) {								
		super.paintComponent(g);
		
		//creamos un obj de tipo Graphics2D. con refundición 
		Graphics2D g2 = (Graphics2D)g;
		
		//instanciamos la clase Rectangle2D      //hay dos clases Rectangle2D. La clase Rectangle2D.double hereda de la clase Rectangle2D, por lo tanto, usando el principio de sustitución "es un",  podemos instanciarlo de esta forma. No estamos instanciando la Clase Rectangle2D q es Abstracta, sino que estanmos instanciando la clase Rectangle2D.double.	        
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100, 200, 150); //(x,y,ancho, alto)  son parámetros de tipo double.
		
		g2.draw(rectangulo);
		
		// Dibuja Elipse
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		
		//dibuja una línea
		g2.draw(new Line2D.Double(100,100,300,250));
		
		//Dibula un círculo que englobe todo
		double centroenX = rectangulo.getCenterX();
		double centroenY = rectangulo.getCenterY();
		double radio = 150;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroenX, centroenY, centroenX+radio, centroenY+radio);
		g2.draw(circulo);
		

	}	
	

}
