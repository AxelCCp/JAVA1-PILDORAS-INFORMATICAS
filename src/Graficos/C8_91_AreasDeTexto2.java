package Graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class C8_91_AreasDeTexto2 {
	public static void main(String[]args) {
		MarcoPruebaArea mimarco = new MarcoPruebaArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class MarcoPruebaArea extends JFrame{
	public MarcoPruebaArea(){
		setTitle("Probando Área de Texto");
		setBounds(500,300,500,350);
		//setLayout(new BorderLayout());
		BorderLayout xxx = new BorderLayout();
		setLayout(xxx);
		laminaBotones = new JPanel();
		botonInsertar = new JButton("insertar");
		botonInsertar.addActionListener(new ActionListener(){ 											//intanciamos dentro del argumento, la interfaz Actionlistener. EL BOTÓN QUEDA A LA ESCUCHA.

			public void actionPerformed(ActionEvent e) {
				
				areaTexto.append("En un lugar de la mancha");
				
			}	 
		});
		laminaBotones.add(botonInsertar); 																//agregamos boton
		botonSaltoLinea = new JButton("Salto Línea");
		botonSaltoLinea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean saltar =! areaTexto.getLineWrap();                                              //detectar si nuestra área de texto tiene o no tiene saltos de texto.
				areaTexto.setLineWrap(saltar);							//que establezca un salto de línea.
																		//almacenamos dentro de la variable saltar, lo contrario de lo que haya en el área de texto. si en el área de texto no hay saltos del línea.  
				/*														//esto pone o quita salto de línea
				if(saltar) {
					botonSaltoLinea.setText("quitar salto");
				}else {
					botonSaltoLinea.setText("Salto Línea");
				}
				*/
				
				botonSaltoLinea.setText(saltar ? "quitar salto" : "Salto Línea");
			}
		});
		laminaBotones.add(botonSaltoLinea);
		add(laminaBotones,BorderLayout.SOUTH);
		areaTexto = new JTextArea(8,20);
		laminaConBarras = new JScrollPane(areaTexto);
		add(laminaConBarras, BorderLayout.CENTER);
	}
	private JPanel laminaBotones;
	private JButton botonInsertar;
	private JButton botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
}
