package Graficos;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class D0_93_RadioButton {
	public static void main(String[]args) {
		MarcoRadioSintaxis mimarco = new MarcoRadioSintaxis();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoRadioSintaxis extends JFrame{
	public MarcoRadioSintaxis(){
		setVisible(true);
		setBounds(550,300,500,350);
		LaminaRadioSintaxis milamina = new LaminaRadioSintaxis();
		add(milamina);
	}
}

class LaminaRadioSintaxis extends JPanel{
	public LaminaRadioSintaxis(){
		ButtonGroup miGrupo1 = new ButtonGroup();											//crea un grupo de botones.
		JRadioButton boton1 = new JRadioButton("Azul",false);  								//crea botones de radio
		JRadioButton boton2 = new JRadioButton("Rojo",true);
		JRadioButton boton3 = new JRadioButton("Verde",false);
		miGrupo1.add(boton1);                       					                    //agrupamos los 3 botones.
		miGrupo1.add(boton2);
		miGrupo1.add(boton3);
		add(boton1); 																		//agregamos los botones
		add(boton2);
		add(boton3);
		ButtonGroup miGrupo2 = new ButtonGroup();
		JRadioButton boton4 = new JRadioButton("Masculino",false);
		JRadioButton boton5 = new JRadioButton("Femenino",false);
		miGrupo2.add(boton4);
		miGrupo2.add(boton5);
		add(boton4);
		add(boton5);
	}
}
