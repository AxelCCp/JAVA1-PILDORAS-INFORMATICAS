package Graficos;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class C4_86_Prueba_Texto {
	public static void main(String[]args) {
		MarcoTexto miMarco = new MarcoTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}
}

class MarcoTexto extends JFrame{
	public MarcoTexto() {
		setBounds(600,300,600,350);
		LaminaTexto miLamina = new LaminaTexto();
		add(miLamina);
		miLamina.setVisible(true);	 
	}
}

class LaminaTexto extends JPanel{
	public LaminaTexto() {
		
		setLayout(new BorderLayout()); 										   //con esto indicamos que la l�mina principal tiene una disposici�n de tipo BorderLayout
		JPanel miLamina2 = new JPanel();
		miLamina2.setLayout(new FlowLayout());                                 //establezco el layout de esta segunda l�mina
		resultado = new JLabel("",JLabel.CENTER);							   //Usamos el constructor  que contiene un parametro String(se lo pasamos vac�o, y en el segundo parametro le decimos que ponga el resultado en el centro de la l�mina.
		JLabel texto1 = new JLabel("Email:");
		miLamina2.add(texto1);
		campo1 = new JTextField(20);  						                   //generamos un cuadro de texto, a�n sin configurar.
		miLamina2.add(campo1);
		add(resultado, BorderLayout.CENTER);						           // agregamos aqu� el resultado, pq est�n las posiciones por defecto de FlowLayout
		JButton miBoton = new JButton("Comprobar");																					
		DameTexto miEvento = new DameTexto();
		miBoton.addActionListener(miEvento);
		miLamina2.add(miBoton);
		add(miLamina2,BorderLayout.NORTH);  									//con esto situamos la l�mina2 en la zona norte de la lamina principal.
	}
	
	private class DameTexto implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			int correcto=0;
			String email = campo1.getText().trim();
			
			for(int i=0; i<email.length(); i++) {
				if (email.charAt(i)=='@') {
					correcto++;
				}
			}
			if(correcto != 1) {
				resultado.setText("Incorrecto");
				System.out.println("Email incorrecto");
			}else {
				resultado.setText("Correcto");
				System.out.println("Email Correcto");
			}
			System.out.println(campo1.getText().trim()); 													 //System.out.println(campo1.getText().trim());  //getText()recoge la cadena de String de campo1 // trim() quita los espacios adicionales al imprimir en la consola.	
		}
	}
	private JTextField campo1;
	private JLabel resultado;
}
