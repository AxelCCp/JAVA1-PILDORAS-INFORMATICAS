package Graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class C7_90_AreasDeTexto {
	public static void main(String[]args) {
		MarcoArea marco = new MarcoArea();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoArea extends JFrame{
	public MarcoArea() {
		setBounds(500,300,500,350);
		LaminaArea milamina = new LaminaArea();
		add(milamina);
		setVisible(true);
	}
}


class LaminaArea extends JPanel{
	public LaminaArea() {
		miarea = new JTextArea(8,20);													//establecemos el área del cuadro de texto.
		miarea.setLineWrap(true); 																//establecemos el salto del línea, para que el cuadro de texto quede fijo hacia los lados.
		JScrollPane laminaBarras = new JScrollPane(miarea);										//creamos una 2da lamina, para tener barras de desplazamiento en el texto. Ponemos en el parámetro, "miarea", para que esta lamina reciba las barras de desplazamiento. 
		add(laminaBarras);																		//agregamos el área.
		JButton miboton = new JButton("Dale");
		miboton.addActionListener(new GestionaArea());											//ponemos el boton a la escucha.
		add(miboton);
	}
	private class GestionaArea implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println(miarea.getText());
		}
	}
	private JTextArea miarea;
}
