package Graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class A7_62_FuentesLetras_LaminaColores {
	
	public static void main(String[]args) {	
		MarcoConDibujos3 miMarco = new MarcoConDibujos3();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}


class MarcoConDibujos3 extends JFrame{
	
	public MarcoConDibujos3() {
		setTitle("prueba de dibujo");
		setSize(400, 400);
		
		LaminaConFiguras3 miLamina = new LaminaConFiguras3();
		add(miLamina);	
		
		//4.-Establece el color frontal o color que vamos a usar por defecto en todo lo que se escriba o dibuje en nuestra lámina.    
		miLamina.setForeground(Color.BLUE);
		
		//miLamina.setBackground(Color.CYAN);
		//miLamina.setBackground(SystemColor.window);            
	}
}


class LaminaConFiguras3 extends JPanel{
	
	public void paintComponent(Graphics g) {								
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100, 200, 150); 
		
		g2.setPaint(Color.BLUE);    								         
		g2.draw(rectangulo);             									  
		g2.setPaint(Color.RED);                                                 
		g2.fill(rectangulo);					                            	
		
		                                                                 
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);                                                                      
		g2.setPaint(new Color(50,0,50).brighter().brighter());                      
		g2.fill(elipse);															
																					
		g2.draw(new Line2D.Double(100,100,300,250));
																					
		double centroenX = rectangulo.getCenterX();
		double centroenY = rectangulo.getCenterY();
		double radio = 150;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroenX, centroenY, centroenX+radio, centroenY+radio);
		
		Color miColor = new Color(0,150,0);                                     		
		g2.setPaint(miColor);
		g2.draw(circulo);   
		
		
		//1.-instanciamos la clase Font y llamamos al constructor de la clase Font, le pasamos los parámetros que pide.
		Font miFuente = new Font("Arial", Font.BOLD,26);   
		g2.setFont(miFuente);
		g2.setColor(Color.WHITE);
		g2.drawString("Lenovo", 40, 40);           	                                //2.-("String",X,Y)
		
		//3.-ahora vamos a instanciar la clase Font, dentro del método setFont()
		g2.setFont(new Font("Arial", Font.ITALIC,14));
		g2.setColor(new Color(128,90,50).brighter());
		g2.drawString("Java",40,80);

	}	
}
