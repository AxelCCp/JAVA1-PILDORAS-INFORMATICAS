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

public class D2_94_RadioButton2 {
	public static void main(String[]args) {
		MarcoRadio1 mimarco = new MarcoRadio1();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}

class MarcoRadio1 extends JFrame{
	public MarcoRadio1() {
		setVisible(true);
		setBounds(550,300,550,350);
		LaminaRadio1 laminaR = new LaminaRadio1();
		add(laminaR);
	}
}

class LaminaRadio1 extends JPanel{
	public LaminaRadio1() {
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la Mancha.............");
		texto.setFont(new Font("Serif",Font.PLAIN,12));
		add(texto, BorderLayout.NORTH);
		laminaBotones = new JPanel();
		miGrupo = new ButtonGroup();
		colocarBotones("Pequeño",false,10);
		colocarBotones("Mediano",true,12);
		colocarBotones("Grande",false,18);
		colocarBotones("Muy Grande",false,24);
		
		add(laminaBotones,BorderLayout.SOUTH);
		
	}
	
	public void colocarBotones(String nombre, boolean seleccionado,final int tamagno){ 
		
		JRadioButton boton = new JRadioButton(nombre,seleccionado);
		miGrupo.add(boton);
		laminaBotones.add(boton);
		
		//implementamos directamente la interfaz ActionListener
		ActionListener mievento = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				texto.setFont(new Font("Serif",Font.PLAIN,tamagno));
			} 
		};
		boton.addActionListener(mievento);
	}
	private JLabel texto;
	private JRadioButton boton1;
	private JRadioButton boton2;
	private JRadioButton boton3;
	private ButtonGroup miGrupo;
	private JRadioButton boton4;
	private JPanel laminaBotones;
}