package Graficos;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class D4_96_JSlider1 {
	public static void main(String[]args) {
		FrameSliders mimarco = new FrameSliders();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class FrameSliders extends JFrame{
	public FrameSliders() {
		setBounds(550,350,550,300);
		setVisible(true);
		LaminaSliders lamina = new LaminaSliders();
		add(lamina);
	}
}


class LaminaSliders extends JPanel{
	public LaminaSliders() {
		JSlider control = new JSlider(SwingConstants.HORIZONTAL,0,100,50);								  //slider de 0 a 100,  y aparece en 25.
		control.setMajorTickSpacing(25);																  //estas son las rayitas mayores del slider.
		control.setMinorTickSpacing(5);      															  //estas son las rayitas menores del slider.
		control.setPaintTicks(true);
		control.setFont(new Font("Serif",Font.ITALIC,12));										   		  //modificamos el formato de los numeros antes de establecerlos. con ITALIC los ponemos en cursiva.
		control.setPaintLabels(true);																	  //hacemos aparecer los numeritos del Slider
		control.setSnapToTicks(true);																	  //con esto, obligamos a que el marcador del slider, quede posicionado justo en la rayita. y no entre dos rayitas. 
		add(control);
		
	}
}


