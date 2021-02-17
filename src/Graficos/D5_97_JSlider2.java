package Graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class D5_97_JSlider2 {
	public static void main(String[]args) {
		FrameMarco1 mimarco1 = new FrameMarco1();
		mimarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


class FrameMarco1 extends JFrame{
	public FrameMarco1() {
		setBounds(400,200,550,300);
		setVisible(true);
		lamina1 lamina = new lamina1();
		add(lamina);
		
	}
}

class lamina1 extends JPanel{
	public lamina1() {
		BorderLayout xxx = new BorderLayout();
		setLayout(xxx);
		//setLayout(new BorderLayout());
		rotulo = (new JLabel("En un lugar de la mancha"));
		add(rotulo,BorderLayout.SOUTH);
		control = new JSlider(8,50,12);
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font("Serif",Font.ITALIC,10));
		JPanel laminaSlider = new JPanel();
		laminaSlider.add(control);
		add(laminaSlider,BorderLayout.CENTER);
		
		EventoSlider zzz = new EventoSlider();
		control.addChangeListener(zzz);
		//control.addChangeListener(new EventoSlider());
	}
	private class EventoSlider implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
			contador++;
			System.out.println("Estas manipulando el Slider... Contador " + contador );
			System.out.println("Slider::: " + control.getValue());
			
			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
		}
	}
	
	private JLabel rotulo;
	private JSlider control;
	private static int contador;
	
}
