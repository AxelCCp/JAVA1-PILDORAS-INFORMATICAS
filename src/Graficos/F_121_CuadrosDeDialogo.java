package Graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class F_121_CuadrosDeDialogo {
	public static void main(String[]args) {
		MarcoCuadroD marco = new MarcoCuadroD();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCuadroD extends JFrame{
	public MarcoCuadroD() {
		setBounds(400,100,550,550);
		setVisible(true);
		LaminaCuadroD lamina = new LaminaCuadroD();
		add(lamina);	
	}
}

class LaminaCuadroD extends JPanel{
	public LaminaCuadroD(){
		boton1 = new JButton("Botón 1");
		boton2 = new JButton("Botón 2");
		boton3 = new JButton("Botón 3");
		boton4 = new JButton("Botón 4");
		
		boton1.addActionListener(new gestionaBotones());
		boton2.addActionListener(new gestionaBotones());
		boton3.addActionListener(new gestionaBotones());
		boton4.addActionListener(new gestionaBotones());
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
	}
	
	private class gestionaBotones implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==boton1){		
				                          
				JOptionPane.showMessageDialog(LaminaCuadroD.this, "Has pulsado el botón 1", "Mensaje 1", 1);//parentComponent: qn es el componente que contiene el botón.
			}else if(e.getSource()==boton2){
				
				JOptionPane.showInputDialog(LaminaCuadroD.this,"Pulsaste el botón 2, ingresa algo: ","Mensaje 2",2);
				
			}else if(e.getSource()==boton3){
				JOptionPane.showConfirmDialog(LaminaCuadroD.this, "Pulsaste el botón 3", "Mensaje 3", 1);
				
			}else{		
				JOptionPane.showOptionDialog(LaminaCuadroD.this, "Pulsaste el botón 4", "Mensaje 4", 1, 1,null, null, null);
			}
		}
	}
	private JButton boton1, boton2, boton3, boton4;
}
	

