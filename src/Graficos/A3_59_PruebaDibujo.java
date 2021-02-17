package Graficos;

import java.awt.*;
import javax.swing.*;

public class A3_59_PruebaDibujo {
	public static void main(String[]args) {
		
		MarcoConDibujos miMarco = new MarcoConDibujos();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {
		setTitle("prueba de dibujo");
		setSize(400, 400);
		
		LaminaConFiguras miLamina = new LaminaConFiguras();
		add(miLamina);
		
	}
}

class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {								
		super.paintComponent(g);
		g.drawRect(50, 50, 200, 200);                      //drawRect() figuras rectangulares. de la clase Graphics.
		g.drawLine(100, 100, 300, 200);
		g.drawArc(50, 100, 100, 200, 120, 150);
																	
	}	
}
