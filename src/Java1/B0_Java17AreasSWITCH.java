package Java1;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class B0_Java17AreasSWITCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectángulo \n3: Triangulo \n4: Circulo");
		int figura = entrada.nextInt();
		
		switch (figura) {
		
		case 1: // cuadrado.
			int lado = Integer.parseInt(JOptionPane.showInputDialog("introduce el lado"));
			System.out.println("El area del cuadrado es " + Math.pow(lado,2));	
			break;
			
		case 2: // rectángulo
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base")); 
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura")); 
			System.out.println("El área del rectángulo es " + base*altura);
			break;
		
		case 3: // triángulo
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base")); 
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura")); 
			System.out.println("El area de un triangulo es " + (base*altura)/2);
			break;
			
		case 4: // círculo
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio")); 
			System.out.print("El area del circulo es: ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			break;
			
		default: 
			System.out.println("La opcion no es correcta");
			
		}
	}
}
