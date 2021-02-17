package Java1;

import javax.swing.JOptionPane;
public class B8_Java22FactorialBucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Long resultado = 1L;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
		
		for(int i=numero; i>0; i--){
		
		resultado = resultado*i;
	}
		System.out.println("El factorial de " + numero + " es " + resultado);
	
	}	
}
