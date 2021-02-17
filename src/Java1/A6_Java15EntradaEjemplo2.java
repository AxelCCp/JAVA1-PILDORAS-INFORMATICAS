package Java1;

import javax.swing.*;
public class A6_Java15EntradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("introduce tu nombre por favor:");

		String edad = JOptionPane.showInputDialog("Introduce la edad por favor:");
		int edad_usuario = Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("Hola " + nombre_usuario + " el proximo año tendrás " + edad_usuario + " años");
	}
}
