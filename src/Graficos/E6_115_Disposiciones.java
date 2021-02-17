package Graficos;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class E6_115_Disposiciones {
	public static void main(String[]args) {
		MarcoCaja xxx = new MarcoCaja();
		xxx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		xxx.setVisible(true);
	}
}


class MarcoCaja extends JFrame{
	public MarcoCaja() {
		setBounds(600,350,200,200);
		
		
		JLabel rotulo1 = new JLabel("Name");
		JTextField texto1 = new JTextField(10);
		texto1.setMaximumSize(texto1.getPreferredSize());  										//que el programa elija el mayor tamaño adecuado para este obj.
		
		Box cajaH1 = Box.createHorizontalBox();												    //creamos una variable de tipo Box. usamos el metodo createHorizontalBox, que devuelve un obj de tipo box.  por lo tanto lo podemos almacenar en cajaH1. el método es statico, por lo tanto anteponemos la clase Box. 
		cajaH1.add(rotulo1);
		cajaH1.add(Box.createHorizontalStrut(10));												//crea un espacio invible entre un componente y otro. es este caso, le ponemos un espacio de 10 pixeles.
		cajaH1.add(texto1);
		
		JLabel rotulo2 = new JLabel("Password");
		JTextField texto2 = new JTextField(10);
		texto2.setMaximumSize(texto2.getPreferredSize());
		
		Box cajaH2 = Box.createHorizontalBox();
		cajaH2.add(rotulo2);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(texto2);
		
		JButton boton1 = new JButton("Ok");
		JButton boton2 = new JButton("Cancel");
		
		Box cajaH3 = Box.createHorizontalBox();
		cajaH3.add(boton1);
		cajaH3.add(Box.createGlue());   														// crea una cola invisible, para establecer un ancho y alto máximo.
		cajaH3.add(boton2);
		
		
		Box cajaVertical = Box.createVerticalBox();
		cajaVertical.add(cajaH1);
		cajaVertical.add(cajaH2);
		cajaVertical.add(cajaH3);
		
		add(cajaVertical,BorderLayout.CENTER);
			
	}
}


