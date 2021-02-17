package Graficos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3_83_Layout_Calculadora {
	public static void main(String[]args) {
		MarcoCalculadora mimarco = new MarcoCalculadora();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class MarcoCalculadora extends JFrame{
	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500,300,450,300);
		LaminaCalculadora milamina = new LaminaCalculadora();
		add(milamina);
		//pack();  																				//con este m�todo le decimos que el contenedor se tiene que adaptar al tama�o por defecto de lo que contiene. para usar pack(), inhabilitamos el setBounds()
	}
}

class LaminaCalculadora extends JPanel{	
	public LaminaCalculadora() {
		principio = true;
		setLayout(new BorderLayout());							       			 				//BorderLayout xxx = new BorderLayout();
																								//setLayout(xxx);
		pantalla = new JButton("0");
		pantalla.setEnabled(false);                                   							//con esto deshabilitamos la pantalla de la calculadora.
		add(pantalla, BorderLayout.NORTH);
		
		milamina2 = new JPanel();
		milamina2.setLayout(new GridLayout(4,4));
		
		ActionListener insertar = new InsertaNumero();
		ActionListener orden = new AccionOrden(); 
		ponerBoton("0",insertar);
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		ponerBoton("+",orden);
		ponerBoton("-",orden);
		ponerBoton("x",orden);
		ponerBoton("/",orden);
		ponerBoton(".",orden);
		ponerBoton("=",orden);
		add(milamina2, BorderLayout.CENTER);													//agregar la segunda l�mina a la lamina principal. traduccion desde Java: "Agrega la l�mina2 en BorderLayout en el centro.  //rotulo: rotulo del boton		
		ultimaOperacion = "=";
	} 																							
	private void ponerBoton(String rotulo, ActionListener oyente) {  
		JButton boton = new JButton(rotulo);
		boton.addActionListener(oyente);
		milamina2.add(boton); 
	}
	
	//clase evento
	private class InsertaNumero implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String entrada = e.getActionCommand(); 						                       //este m�todo nos devuelve el String asociado con la acci�n.
			
			if(principio==true) {
				pantalla.setText("");   													   //si principio es true, que nos borre la pantalla	
				principio=false;
			}
			pantalla.setText(pantalla.getText() + entrada);									   //Esto quieres decir, que en la pantalla aparecer� lo que hab�a anteriormente + lo que se est� ingresando con los botones.
		}
	}
	
	
	//CLASE QUE GESTIONA LOS EVENTOS DE LAS OPERACIONES MATEM�TICAS
	private class AccionOrden implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			String operacion = e.getActionCommand(); 									 //almaceno un String  que corresponde al texto del bot�n 
			System.out.println(operacion);
			calcular(Double.parseDouble(pantalla.getText()));          				     //calculamos lo que est� en la pantalla.
			ultimaOperacion = operacion;
			principio = true;															 //al pulsar cualquier boton,  el valor num�rico que venga a continuaci�n sea nuevo
																						 //sirve para que no se concatene el 0 inicial de la pantalla, con los dem�s n�meros que vengan.
		}
		public void calcular(double x) {
			if(ultimaOperacion.equals("+")) {
				resultado+=x;
				System.out.println(resultado);
			}else if(ultimaOperacion.equals("-")){
				resultado-=x;
			}else if(ultimaOperacion.equals("x")){
				resultado*=x;
			}else if(ultimaOperacion.equals("/")){
				resultado/=x;
			}else if(ultimaOperacion.equals("=")) {
				resultado = x;
			}
		pantalla.setText("" + resultado);   //se le concatena con "", para que no se produzca un error de tipo. ya que setText() establece String, mientras que la variable resultado es de tipo Double.
		}
	}
	private JPanel milamina2;
	private JButton pantalla;
	private boolean principio;
	private double resultado;
	private String ultimaOperacion;
}


