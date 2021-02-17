package Graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C9_92_CheckBox {
	public static void main(String[]args) {
		MarcoCheck mimarco = new MarcoCheck();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCheck extends JFrame{
	public MarcoCheck() {
		setBounds(550,300,500,350);
		setVisible(true);
		LaminaCheck lamina = new LaminaCheck();
		add(lamina);
	}
}

class LaminaCheck extends JPanel {
	public LaminaCheck() {
		setLayout(new BorderLayout()); 														//establecemos una disposición de tipo borderLayout para la lámina.
		Font miLetra = new Font("Serif", Font.PLAIN, 24);
		texto = new JLabel("En un lugar de la mancha...");
		texto.setFont(miLetra);															    //este método establece un tipo de letra. 
		JPanel laminaTexto = new JPanel();
		laminaTexto.add(texto);
		add(laminaTexto, BorderLayout.CENTER); 												//como la lamina principal tiene una disposición borderLayout, ponemos la laminaTexto, con borderlayout.center.
		check1 = new JCheckBox("Negrita");		                                            //crear casillas de verificación
		check2 = new JCheckBox("Cursiva");	
		check1.addActionListener(new ManejaChecks()); 										//ponemos los check 1 y 2 a la escucha.
		check2.addActionListener(new ManejaChecks());
		JPanel laminaChecks = new JPanel();
		laminaChecks.add(check1);
		laminaChecks.add(check2);
		add(laminaChecks, BorderLayout.SOUTH); 												//ponemos esta lámina en la zona sur de la lámina principal.
		}
	
	//clase evento
	private class ManejaChecks implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int tipo = 0;   										 //se podría hacer esto con variables booleanas y estructuras if else, pero de esta forma es más fácil.
			if(check1.isSelected()) tipo+=Font.BOLD;  				 //Bold, vale 1.  lo que estamos diciendo es que si check1 es seleccionado, incrementa la variable tipo en 1.
			if(check2.isSelected()) tipo+=Font.ITALIC; 				 //ITALIC, vale 2.  estamos diciendo que en caso de que esté selecionado el check2, incrementa la variable tipo en 2.
			texto.setFont(new Font("Serif",tipo,24));				 //establecemos el texto.
		}
	}
	private JLabel texto;
	private JCheckBox check1;
	private JCheckBox check2;
}
