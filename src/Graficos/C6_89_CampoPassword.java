package Graficos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class C6_89_CampoPassword {
	public static void main(String[]args) {
		MarcoPassword mimarco = new MarcoPassword();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoPassword extends JFrame{
	public MarcoPassword() {
		setBounds(400,300,550,300);
		LaminaPassword lamina = new LaminaPassword();
		add(lamina);
		setVisible(true);
	}
}

class LaminaPassword extends JPanel{
	public LaminaPassword() {
		
		setLayout(new BorderLayout());												//le decimos a la lamina principal que tiene que tener una distribuci�n de tipo BorderLayout.
		JPanel laminaSuperior = new JPanel();                                       //segunda lamina, que tenga una distribuci�n GridLayout	
		laminaSuperior.setLayout(new GridLayout(2,2));
		add(laminaSuperior,BorderLayout.NORTH); 									//decirle que esta lamina secundaria, de 2 columnas y 2 filas, tiene que estar en la parte  norte de la lamina principal, que es de tipo borderLayout.
		JLabel etiqueta1 = new JLabel("Usuario");												//en la lamina superior van 2 etiquetas, una con el txt de usuario y otra con el txt de contrase�a.
		JLabel etiqueta2 = new JLabel("Contrase�a");
		JTextField cUsuario = new JTextField(15);									// agrega un cuadro de txt, donde se pueda ingresar el nombre de usuario.
		CompruebaPass miEvento = new CompruebaPass(); 
		cContra = new JPasswordField(15);							//se crea un cuadro  para contrase�a, en este los caracteres ingresados aparecen cm aster�scos.
		cContra.getDocument().addDocumentListener(miEvento);
		laminaSuperior.add(etiqueta1);
		laminaSuperior.add(cUsuario);
		laminaSuperior.add(etiqueta2);
		laminaSuperior.add(cContra);
		JButton enviar = new JButton("Enviar");										//agregar un bot�n en la parte inferior de la l�mina principal.
		add(enviar, BorderLayout.SOUTH);
	}
	private class CompruebaPass implements DocumentListener{

		public void changedUpdate(DocumentEvent e) {}

		public void insertUpdate(DocumentEvent e) {
			char [] contrasena;
			contrasena = cContra.getPassword();
			if(contrasena.length<8 || contrasena.length>12) {
				cContra.setBackground(Color.RED);
			}else {
				cContra.setBackground(Color.WHITE);
			}
		}
		
		public void removeUpdate(DocumentEvent e) {
			char [] contrasena;
			contrasena = cContra.getPassword();
			if(contrasena.length<8 || contrasena.length>12) {
				cContra.setBackground(Color.RED);
			}else {
				cContra.setBackground(Color.WHITE);
			}
		}
	}
	
	private JPasswordField cContra;
}


