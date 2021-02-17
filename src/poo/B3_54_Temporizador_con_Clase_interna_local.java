package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class B3_54_Temporizador_con_Clase_interna_local {
	public static void main(String[]args) {
		Reloj2 mireloj = new Reloj2();            //los parámetros (3000, true), se pasaron al método enMarcha, pq el ya no está el constructor Reloj2.
		mireloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "Apreta enter para terminar");
		System.exit(0); 
	}
}

class Reloj2{
	//YA NO SE NECESITA EL constructor
	//public Reloj2(int intervalo, boolean sonido) {
		//this.intervalo = intervalo;
		//this.sonido = sonido;
	//}   

	
	//CLASE INTERNA LOCAL, PQ LA CLASE ESTÁ DENTRO DEL MÉTODO               ..... a la clase se le quitó el modificador de acceso private, para quitar el error 
										//final:                            ...es una regla que las clases internas locales accedan a variables locales pertenecientes al método donde han sido declaradas.
	public void enMarcha(int intervalo, final boolean sonido) {
		 class DameLaHora2 implements ActionListener{
			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				System.out.println("hora cada 3 segundos: " + ahora);
				if(sonido) {
					Toolkit.getDefaultToolkit().beep(); 
				}
			}
		}
		 
		ActionListener oyente = new DameLaHora2();
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	}
	
	// dos campos encapsulados
	//private int intervalo;    //estos se pasaron como parametro al método enMarcha()
	//private boolean sonido;
}
