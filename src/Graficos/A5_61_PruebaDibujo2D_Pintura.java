package Graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class A5_61_PruebaDibujo2D_Pintura {
	
	
public static void main(String[]args) {	
		MarcoConDibujos2 miMarco = new MarcoConDibujos2();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}


class MarcoConDibujos2 extends JFrame{
	
	public MarcoConDibujos2() {
		setTitle("prueba de dibujo");
		setSize(400, 400);
		
		LaminaConFiguras2 miLamina = new LaminaConFiguras2();
		add(miLamina);	
		                                                        //color de fondo que se le da a la lámina
		miLamina.setBackground(Color.CYAN);
		//miLamina.setBackground(SystemColor.window);             //le das un color de fondo por defecto, del sistema definido cm parámetro.
		
		
	}
}

class LaminaConFiguras2 extends JPanel{
	
	public void paintComponent(Graphics g) {								
		super.paintComponent(g);
		
		
		Graphics2D g2 = (Graphics2D)g;
		
			        
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100, 200, 150); 
		
		g2.setPaint(Color.BLUE);    								         //1ro selecciono color
		g2.draw(rectangulo);             									 //2do dibujo o relleno figura pasada por parámetro. 
		
		
		g2.setPaint(Color.RED);                                                 //se pone Color.RED, pq la clase Color es abstracta.
		g2.fill(rectangulo);					                            	//fil() rellena con el color.
		
		
		                                                                        // Dibuja Elipse
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		                                                                        //usamos el sistema RGB (int RED,int GREEN,int BLUE) para pintar la Elipse:
		g2.setPaint(new Color(50,0,50).brighter().brighter());                      //mét. brighter() le da brillo al color y se usa uno tras de otro hasta 3.separados por un punto
		g2.fill(elipse);															//tambn está darker(), se usa igual a brighter.
		
		
																					// Dibuja una línea
		g2.draw(new Line2D.Double(100,100,300,250));
		
																					//Dibula un círculo que englobe todo
		double centroenX = rectangulo.getCenterX();
		double centroenY = rectangulo.getCenterY();
		double radio = 150;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroenX, centroenY, centroenX+radio, centroenY+radio);
		
		Color miColor = new Color(0,150,0);                                     		//tambien se puede crear una instancia de la clase Color.
		g2.setPaint(miColor);
		g2.draw(circulo);    		  													//cambia draw por fill y pintará todo del color del círculo.
		

	}	
	
	

}
