//nos devuelve los tipos de letras que tenemos en el pc
package Graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;


public class A6_62_FuentesLetras {
	public static void main(String[]args) {
		
		
		String fuente = JOptionPane.showInputDialog("introduce fuente: ");
		boolean estalafuente = false;
		
		
		//Array de String      //con estos 2 métodos, almacenamos en el array, todos los tipos de fuentes instaladas en el ordenador.
		String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); 
	
		for (String nombredelafuente:nombresDeFuentes) {
			//System.out.println(nombredelafuente);
			
			if (nombredelafuente.equalsIgnoreCase(fuente)){
				estalafuente = true;
			}
		}
		
		if (estalafuente) {
			System.out.println(fuente + " ...fuente Instalada");
		}else {
			System.out.println(fuente + " ...fuente no instalada");
		}
	
	}

}
