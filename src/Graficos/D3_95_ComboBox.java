
//
package Graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D3_95_ComboBox {
	public static void main(String[]args) {
		MarcoCombo mimarco = new MarcoCombo();
			mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoCombo extends JFrame{
	public MarcoCombo() {
		setVisible(true);
		setBounds(550,300,500,350);
		LaminaCombo lamina = new LaminaCombo();
		add(lamina);
	}
}

class LaminaCombo extends JPanel{
	public LaminaCombo() {
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la Mancha...");
		texto.setFont(new Font("Serif",Font.PLAIN,18));
		add(texto,BorderLayout.CENTER);
		JPanel laminaNorte = new JPanel();
		miCombo =new JComboBox();
		miCombo.addItem("Serif");
		miCombo.addItem("Arial");
		miCombo.addItem("Monospaced");
		miCombo.addItem("Dialog");
		miCombo.setEditable(true); 																	//con esto el usuario puede escribir el tipo de letra que quiere usar.
		
		EventoCombo miEvento = new EventoCombo();
		miCombo.addActionListener(miEvento);
		
		laminaNorte.add(miCombo);
		add(laminaNorte,BorderLayout.NORTH);
	}
	private class EventoCombo implements ActionListener{
		public void actionPerformed(ActionEvent e) {	
			texto.setFont(new Font((String)miCombo.getSelectedItem(),Font.PLAIN,18));
		}
		
	}
	
	private JLabel texto;
	private JComboBox miCombo;
}