package Graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class D1_94_RadioButton2 {
	public static void main(String[]args) {
		MarcoRadio mimarco = new MarcoRadio();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoRadio extends JFrame{
	public MarcoRadio(){
		setVisible(true);
		setBounds(550,300,550,350);
		LaminaRadio laminaR = new LaminaRadio();
		add(laminaR);
	}
}

class LaminaRadio extends JPanel{
	public LaminaRadio() {
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la Mancha.............");
		add(texto, BorderLayout.NORTH);
		ButtonGroup grupo1 = new ButtonGroup();
		boton1 = new JRadioButton("Pequeño",false);
		boton2 = new JRadioButton("Mediano",true);
		boton3 = new JRadioButton("Grande",false);
		boton4 = new JRadioButton("Muy Grande",false);
		grupo1.add(boton1);
		grupo1.add(boton2);
		grupo1.add(boton3);
		grupo1.add(boton4);
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		JPanel laminaRadio = new JPanel();
		laminaRadio.add(boton1);
		laminaRadio.add(boton2);
		laminaRadio.add(boton3);
		laminaRadio.add(boton4);
		add(laminaRadio,BorderLayout.SOUTH);
		
		EventoRadio miEvento = new EventoRadio();
		boton1.addActionListener(miEvento);                       						//se pone el botón a la escucha.
		boton2.addActionListener(miEvento);
		boton3.addActionListener(miEvento);
		boton4.addActionListener(miEvento);
	}
	//Clase que gestiona los eventos
	private class EventoRadio implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==boton1) {
				texto.setFont(new Font("Serif",Font.PLAIN,10));
			}else if(e.getSource()==boton2){
				texto.setFont(new Font("Serif",Font.PLAIN,12));
			}else if(e.getSource()==boton3){
				texto.setFont(new Font("Serif",Font.PLAIN,18));
			}else if(e.getSource()==boton4){
				texto.setFont(new Font("Serif",Font.PLAIN,24));
			}
		}
	}
	
	private JLabel texto;
	private JRadioButton boton1;
	private JRadioButton boton2;
	private JRadioButton boton3;
	private JRadioButton boton4;
}
