package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;


public class B2_53_Temporizador_Con_Clase_Interna {
	public static void main(String[]args) {
		
		//se crea una instancia de la clase Reloj
		Reloj mireloj = new Reloj(3000, true);
		
		//la variable de instancia llama al método enMarcha();
		
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Apreta enter para terminar");
		
		//con esto se termina la ejecución del programa.
		System.exit(0); 
		
	}
}


class Reloj{
	
	//constructor que da el estado inicial al temporizador
	public Reloj(int intervalo, boolean sonido) {
		
		//se le da un valor a los dos campos:
		this.intervalo = intervalo;
		this.sonido = sonido;
	}   
	
	
	public void enMarcha() {
		
		//creamos un objeto
		ActionListener oyente = new DameLaHora2();
		
		//creamos una instancia perteneciente a la clase Timer, para elaborar el temporizador.
		
		//el constructor de la clase timer pedía 2 argumentos. el intervalo en milisegundos y un obj de tipo interfaz ActionListener.
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	}
	
	
	// dos campos encapsulados
	private int intervalo;
	private boolean sonido;
	
	
	//clase interna
	private class DameLaHora2 implements ActionListener{
		
									//parametro que se le pasa a este método de la interfaz.
		public void actionPerformed(ActionEvent evento) {
			
			//se crea un obj de tipo Date, llamado Ahora.
			Date ahora = new Date();
			System.out.println("hora cada 3 segundos: " + ahora);
			
			//si sonido es = true, entonces dame sonido.
			if(sonido) {
				
				Toolkit.getDefaultToolkit().beep(); 
				
			}
		}
	}
}
